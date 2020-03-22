# Experiments with the Observer Pattern

In the repository there are various examples and related problems of each implementation of observer patter.

## Project Observer1: The concrete observable is injected in the constructor of the observer.
This implementation of the observer pattern passes the concrete observable class in the constructor of each observer.
The problem is that for each observable you have to build a specific observer for that specific observable.
