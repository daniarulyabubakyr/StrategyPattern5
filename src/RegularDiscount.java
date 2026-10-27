public class RegularDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {
        return price;
    }
}