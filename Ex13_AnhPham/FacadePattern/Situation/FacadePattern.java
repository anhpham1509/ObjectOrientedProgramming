package FacadePattern.Situation;

public class FacadePattern {
    public static void main(String[] args) {
        FastFoodOrder fastFoodOrder = new FastFoodOrder();

        fastFoodOrder.orderFriedChicken();
        fastFoodOrder.orderFrenchFries();
        fastFoodOrder.orderHamburger();
    }
}