# Java functional programming
## Functional programming
### What is functional programming?
Functional programming is a programming paradigm that treats computation as the evaluation of mathematical functions and avoids changing-state and mutable data.
### What is a pure function and how do we know if a function is pure or not?
A pure function is a function that has the following properties:
- The function always evaluates the same result value given the same argument value(s). The function result value cannot depend on any hidden information or state that may change as program execution proceeds or between different executions of the program, nor can it depend on any external input from I/O devices.
- Evaluation of the result does not cause any semantically observable side effect or output, such as mutation of mutable objects or output to I/O devices.
- Evaluation of the result has no side effects.
Examples of pure functions:
```java
public int sum(int a, int b) {
    return a + b;
}
```
```java
public int multiply(int a, int b) {
    return a * b;
}
```
```java
public int divide(int a, int b) {
    return a / b;
}
```
```java
public int subtract(int a, int b) {
    return a - b;
}
```
```java
public int square(int a) {
    return a * a;
}
```
### What are the benefits of pure functions?
- Pure functions are easier to reason about.
- Pure functions are thread-safe.
- Pure functions are easier to test.
- Pure functions are easier to debug.
- Pure functions are easier to parallelize.
- Pure functions can be cached.
- Pure functions are referentially transparent.
### What is immutability?
Immutability is a property of an object that prevents its state from being modified after it is created.
### What is Referential transparency?
Referential transparency and referential opacity are properties of parts of computer programs. An expression is called referentially transparent if it can be replaced with its corresponding value without changing the program's behavior.
### What is a first class function?
A programming language is said to have first-class functions if it treats functions as first-class citizens. This means the language supports passing functions as arguments to other functions, returning them as the values from other functions, and assigning them to variables or storing them in data structures.
### What is a higher order function?
A higher-order function is a function that can take another function as an argument, or that returns a function as a result.
### What is a lambda expression?
A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
Examples of lambda expressions:
```java
(int a, int b) -> a + b
```
```java
(int a, int b) -> a * b
```
```java
(int a, int b) -> a / b
```
```java
(int a, int b) -> a - b
```
```java
(int a) -> a * a
```
### Why use lambda expressions?
- Lambda expressions are easy to read.
- Lambda expressions are easy to write.
- Lambda expressions are easy to test.
- Lambda expressions are easy to debug.
- Lambda expressions are easy to maintain.
- Lambda expressions are easy to understand.
- Lambda expressions are easy to extend.
- Lambda expressions are easy to refactor.
- Lambda expressions are easy to optimize.
- Lambda expressions are easy to parallelize.

### What is a closure?
A closure is a function that captures the state of the surrounding environment.
Example:
```java
public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;
    IntSupplier closure = () -> a + b + c;
    System.out.println(closure.getAsInt());
}
```
### What is currying?
Currying is the technique of translating the evaluation of a function that takes multiple arguments into evaluating a sequence of functions, each with a single argument.
Example:
```java
public static void main(String[] args) {
    IntBinaryOperator curriedSum = a -> b -> a + b;
    System.out.println(curriedSum.applyAsInt(10).applyAsInt(20));
}
```
### What are the benefits of currying?
- Currying helps you to avoid passing the same variable again and again.
- Currying helps to create a higher-order function.
- Currying helps to create a function with multiple arities.
### What is function composition?
Function composition is the process of combining two or more functions to produce a new function.

# Streams

## What is a stream?
A stream is a sequence of elements supporting sequential and parallel aggregate operations. The following are characteristics of a stream:
- A stream is not a data structure.
- A stream does not store elements.
- A stream is functional in nature.
- A stream is lazily constructed.
- A stream is consumable.
- A stream can be traversed only once.
- A stream is pipelined.
- A stream is internal iteration.
- A stream is automatically parallelized.
- A stream is capable of parallel and sequential execution.
- A stream is capable of processing elements in parallel.
- A stream is capable of processing elements in a pipeline.
- A stream is capable of processing elements from a source.
- A stream is capable of processing elements from a collection.
- A stream is capable of processing elements from an array.
- A stream is capable of processing elements from a generator function.
- A stream is capable of processing elements from an I/O channel.
- A stream is capable of processing elements from a stream builder.
- A stream is capable of processing elements from a stream iterator.
- A stream is capable of processing elements from a stream of lines.
- A stream is capable of processing elements from a stream of regular expression matches.

## Why use streams?
- Streams are easy to parallelize.
- Streams are easy to reuse.
- Streams are easy to test.
- Streams are easy to debug.
- Streams are easy to read.
- Streams are easy to write.
- Streams are easy to optimize.
- Streams are easy to maintain.
- Streams are easy to understand.
- Streams are easy to extend.
- Streams are easy to refactor.
- Streams are easy to optimize.
- Streams are easy to parallelize.

## What is class optional?
A container object which may or may not contain a non-null value. If a value is present, isPresent() will return true and get() will return the value.
Example:
```java
public static void main(String[] args) {
    Optional<String> optional = Optional.of("Hello");
    System.out.println(optional.isPresent());
    System.out.println(optional.get());
}
```
Why use optional?
- Optional is easy to read.
- Optional is easy to write.
- Optional is easy to test.
- Optional is easy to debug.
- Optional is easy to maintain.
- Optional is easy to understand.
- Optional is easy to extend.
- Optional is easy to refactor.
- Optional is easy to optimize.
- Optional is easy to parallelize.
