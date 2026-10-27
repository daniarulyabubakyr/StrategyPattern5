# Online Store Discount System

A small Java example of the Strategy design pattern. The customer discount can be changed at runtime without changing the shopping cart.

## Discount strategies

- `RegularDiscount` — no discount
- `StudentDiscount` — 10% discount
- `VipDiscount` — 20% discount

`DiscountStrategy` defines the common contract. `ShoppingCart` delegates the final-price calculation to the selected strategy, and `Main` demonstrates switching strategies at runtime.

## Project structure

```text
src/
├── Main.java
├── DiscountStrategy.java
├── RegularDiscount.java
├── StudentDiscount.java
├── VipDiscount.java
└── ShoppingCart.java
```

## Run from the project root

Install a JDK (17 or newer), then compile and run:

```text
javac -d out src/*.java
java -cp out Main
```

Expected output:

```text
Regular price: 100000.0 ₸
Student price: 90000.0 ₸
VIP price: 80000.0 ₸
```

`ShoppingCart` rejects negative or non-finite prices, requires a strategy to be selected before calculation, and rejects a null strategy.

## Add another strategy

Create a class implementing `DiscountStrategy`, then pass it to the cart with `setDiscountStrategy`:

```java
public class BlackFridayDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.70;
    }
}
```

```java
cart.setDiscountStrategy(new BlackFridayDiscount());
```
