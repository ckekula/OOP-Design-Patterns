# Proxy Design Pattern

Proxy is a **structural** design pattern that lets you provide a substitute or placeholder 
for another object. A proxy controls access to the original object, allowing you to perform
something either before or after the request gets through to the original object.

## Problem

Why would you want to control access to an object? Imagine you have a massive object that consumes a vast
amount of system resources. You need it from time to time, but not always.

Consider a scenario where your application needs to load and display images, and you want to optimize 
the image loading process. Loading images from disk or other external sources can be resource-intensive, 
especially if the images are large or stored remotely.

You could implement lazy initialization: create this object only when it’s actually needed. 
All of the object’s clients would need to execute some deferred initialization code. 
Unfortunately, this would probably cause a lot of code duplication.

## Solution

The Proxy pattern suggests that you create a new proxy class with the same interface as an original
service object. Then you update your app so that it passes the proxy object to all of the
original object’s clients. Upon receiving a request from a client, the proxy creates a real service 
object and delegates all the work to it.

But what’s the benefit? If you need to execute something either before or after the primary 
logic of the class, the proxy lets you do this without changing that class. 
Since the proxy implements the same interface as the original class, it can be
passed to any client that expects a real service object

## Structure

1. The Service Interface declares the interface of the Service. The proxy must follow this 
interface to be able to disguise itself as a service object.
2. The Service is a class that provides some useful business logic.
3. The Proxy class has a reference field that points to a service object. After the proxy finishes 
its processing (e.g., lazy initialization, logging, access control, caching, etc.), it passes the request
to the service object. Usually, proxies manage the full lifecycle of their service objects.
4. The Client should work with both services and proxies via the same interface. This way you can
pass a proxy into any code that expects a service object.
