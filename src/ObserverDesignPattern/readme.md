# Observer Pattern - Stock Notification System

## Introduction

The **Observer Pattern** is a behavioral design pattern where an object (the **subject**) maintains a list of dependents (**observers**) that need to be notified of any state changes. This pattern is widely used in event-driven systems.

In this example, we implement a **Stock Notification System** where investors (observers) receive updates whenever stock prices change.

## Features

- Implements the **Observer Pattern** in Java.
- A `Stock` class (subject) notifies multiple `Investor` classes (observers) about price updates.
- Uses a clean and scalable approach for handling subscriptions and notifications.

## UML Diagram

The following **UML class diagram** represents our implementation of the Observer pattern:

```mermaid
classDiagram
    class Observer {
        <<interface>>
        +update(stockName: String, price: double)
    }

    class Stock {
        - String name
        - double price
        - List~Observer~ observers
        + Stock(name: String, initialPrice: double)
        + addObserver(observer: Observer)
        + removeObserver(observer: Observer)
        + setPrice(newPrice: double)
        - notifyObservers()
    }

    class Investor {
        - String name
        + Investor(name: String)
        + update(stockName: String, price: double)
    }

    class ObserverPatternDemo {
        + main(String[] args)
    }

    Observer <|.. Investor
    Stock --> Observer : "notifies"
    ObserverPatternDemo --> Stock : "creates and updates"
    ObserverPatternDemo --> Investor : "adds as observer"