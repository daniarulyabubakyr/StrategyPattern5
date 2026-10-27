public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        double price = 100000;

        cart.setDiscountStrategy(new RegularDiscount());
        System.out.printf("Regular price: %.1f ₸%n", cart.calculateFinalPrice(price));

        cart.setDiscountStrategy(new StudentDiscount());
        System.out.printf("Student price: %.1f ₸%n", cart.calculateFinalPrice(price));

        cart.setDiscountStrategy(new VipDiscount());
        System.out.printf("VIP price: %.1f ₸%n", cart.calculateFinalPrice(price));
    }
}
