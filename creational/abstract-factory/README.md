# Abstract Factory 

Abstract Factory is a **creational** design pattern that lets you produce families of related objects
without specifying their concrete classes.

## Problem

Imagine that you’re creating a furniture shop simulator. Your code consists of classes that represent:
1. A family of related products, say: Chair + Sofa.
2. Several variants of this family. For example, products Chair, Sofa are available in these 
variants: Modern, Victorian.

You need a way to create individual furniture objects so that they match other objects of the same family.
You don’t want to change existing code when adding new products or families of products to the program. 
Furniture vendors update their catalogs very often, and you wouldn’t want to change the core code each time it happens.

## Solution

The Abstract Factory pattern suggests to explicitly declare interfaces for each distinct product of the
product family (e.g., chair, sofa). Then you can make all variants of products follow those interfaces. 
For example, all chair variants can implement the Chair interface; all sofa variants can
implement the Sofa interface, and so on.

Now we declare the _Abstract Factory_ — an interface with a list of creation methods for all products 
that are part of the product family (e.g., createChair, createSofa). These methods must return abstract
product types represented by the interfaces we extracted previously: Chair , Sofa and so on.

Now, how about the product variants? For each variant of a product family, we create a separate factory 
class based on the AbstractFactory interface. A factory is a class that returns products of a 
particular kind. For example, the ModernFactory can only create ModernChair, ModernSofa objects.

## Structure

1. **Abstract Products** declare interfaces for a set of distinct but related products which make up a product family.
2. **Concrete Products** are various implementations of abstract products, grouped by variants. 
Each abstract product (chair/ sofa) must be implemented in all given variants (Victorian/ Modern).
3. The **Abstract Factory interface** declares a set of methods for creating each of the abstract products.
4. **Concrete Factories** implement creation methods of the abstract factory. 
Each concrete factory corresponds to a specific variant of products and creates only those product variants.
5. Although concrete factories instantiate concrete products, signatures of their creation methods must 
return corresponding abstract products. This way the **client** code that uses a factory doesn’t get coupled
to the specific variant of the product it gets from a factory. 