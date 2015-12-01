package FacadePattern.Situation;

public class FastFoodOrder {
    private FastFood friedChicken;
    private FastFood frenchFries;
    private FastFood hamburger;

    public FastFoodOrder() {
        friedChicken = new FriedChicken();
        frenchFries = new FrenchFries();
        hamburger = new Hamburger();
    }

    public void orderFriedChicken() {
        friedChicken.order();
    }

    public void orderFrenchFries() {
        frenchFries.order();
    }

    public void orderHamburger() {
        hamburger.order();
    }
}