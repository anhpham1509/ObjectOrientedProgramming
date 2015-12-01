package CommandPattern.Situation;

public class CommandPattern {
    public static void main(String[] args) {
        Car car = new Car();

        Forward forwardOrder = new Forward(car);
        Backward backwardOrder = new Backward(car);

        Stack stack = new Stack();
        stack.takeOrder(forwardOrder);
        stack.takeOrder(backwardOrder);

        stack.placeOrders();
    }
}