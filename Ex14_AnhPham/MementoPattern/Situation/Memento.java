package MementoPattern.Situation;

public class Memento {
    private double temperature;

    private double humidity;
    public Memento(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public String getState() {
        return "Weather Info : [ Temperature = " + temperature + ", Humidity = " + humidity + " ]";
    }
}