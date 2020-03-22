# Experiments with the Observer Pattern

In the repository there are various examples and related problems of each implementation of the observer patter.

### Project Observer1:

#### The observed value is passed when the update method is called
In this implementation of the observer pattern, the observed value is stored inside the observable class.
When the `observable.sendNotify` is called to update all the observers, then the observed value is passed as an argument to the `observer.update` method.
##### Problems
- The Observer Interface, where is defined the `update(type T)` method is not unique: you need to have an Observer Interface for each type of data you need to observe;
- The Observable Interface, which depends on the Observer Interface for a certain type of data, is not unique: you need to have an Observable Interface for each type of Observer;
- This means that you need a specific couple of interfaces Observable/Observer for each type of data you need to observe, because in the update method of the observer is specified the type to be used.

### Project Observer2:

#### The observable is injected in the constructor of the observer
In this implementation of the observer pattern, the concrete observable class is passed as an argument **to the constructor** of each observer.
##### Advantages
- There is no dependences in the Interface from the type of data -> only 2 interfaces defined;
- The observed data type is joined to the Observable class that is responsible to update observers with that data;

##### Problems
- In each concrete observer, there is the reference to a concrete observable;

### Project Observer3:

#### The observed value is passed when the update method is called. The interfaces are generic.
In this implementation of the observer pattern, the observed value is stored inside the observable class.
When the `observable.sendNotify` is called to update all the observers, then the observed value is passed as an argument to the `observer.update` method.
##### Advantages
- This solves the problem of Project Observer 1, because the interfaces are generic, so there are only one interface for Observer and one interface for Observable.
##### Problems
- This example works only because the **usage** of the observed data done in the Observer class is donw with a `System.out.println(...)` that can accept and use `Strings` and `Integer` types.



