package CommandPattern.Situation;

public class Forward implements Command {
    private Car car;

    public Forward(Car car) {
        this.car = car;
    }

    public void execute() {
        car.forward();
    }
}
