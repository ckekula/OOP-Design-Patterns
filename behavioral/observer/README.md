# Observer

Observer is a **behavioral** design pattern that lets you define a subscription mechanism to notify 
multiple objects about any events that happen to the object they’re observing.

## Problem

Imagine that you have two types of objects: a Customer and a Store. The customer is very interested 
in a particular brand of product which should become available in the store very soon.
The customer could visit the store every day and check product availability. But while the 
product is still en route, most of these trips would be pointless.

On the other hand, the store could send tons of emails to all customers each time a new
product becomes available. This would save some customers from endless trips to the store. 
At the same time, it’d upset other customers who aren’t interested in new products.

## Solution

The object that is going to notify other objects about the changes to its state, we’ll call it **publisher**. 
All other objects that want to track changes to the publisher’s state are called **subscribers**.

The Observer pattern suggests that you add a subscription mechanism to the publisher class so 
individual objects can subscribe to or unsubscribe from a stream of events coming
from that publisher. This mechanism consists of 
1. an array field for storing a list of references to subscriber objects 
2. several public methods which allow adding subscribers to and removing them from that list.

## Structure

1. The **Publisher** issues events of interest to other objects. These events occur when the publisher changes 
its state or executes some behaviors. Publishers contain a subscription infrastructure that 
lets new subscribers join and current subscribers leave the list.
2. When a new event happens, the publisher goes over the subscription list and calls the notification
method declared in the subscriber interface on each subscriber object.
3. The **Subscriber interface** declares the notification interface. It consists of a single update method. 
The method may have several parameters that let the publisher pass some event details along with the update.
4. **Concrete Subscribers** perform some actions in response to notifications issued by the publisher. 
All of these classes must implement the same interface so the publisher isn’t coupled to concrete classes.
5. Usually, subscribers need some contextual information to handle the update correctly. For this reason, 
publishers often pass some context data as arguments of the notification method. The publisher can pass
itself as an argument, letting subscriber fetch any required data directly.
6. The **Client** creates publisher and subscriber objects separately and then registers subscribers for publisher updates.