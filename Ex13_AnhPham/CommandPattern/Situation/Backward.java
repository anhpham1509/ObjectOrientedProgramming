package CommandPattern.Situation;

public class Backward implements Command {
    private Car car;

    public Backward(Car car) {
        this.car = car;
    }

    public void execute() {
        car.backward();
    }
}