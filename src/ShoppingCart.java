import java.util.Objects;

public class ShoppingCart {

    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = Objects.requireNonNull(
                discountStrategy, "Discount strategy must not be null.");
    }

    public double calculateFinalPrice(double price) {
        if (!Double.isFinite(price) || price < 0) {
            throw new IllegalArgumentException("Price must be a finite, non-negative number.");
        }
        if (discountStrategy == null) {
            throw new IllegalStateException("Choose a discount strategy before calculating the final price.");
        }

        return discountStrategy.applyDiscount(price);
    }
}
