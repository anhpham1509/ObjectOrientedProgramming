package MementoPattern.Situation;

public class Originator {
    private double temperature;
    private double humidity;

    public void setState(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getState() {
        return "Weather Info : [ Temperature = " + temperature + ", Humidity = " + humidity + " ]";
    }

    public Memento saveStateToMemento() {
        return new Memento(temperature, humidity);
    }

    public void getStateFromMemento(Memento memento) {
        this.temperature = memento.getTemperature();
        this.humidity = memento.getHumidity();
    }
}