package ObserverPattern.Situation;

import java.util.ArrayList;
import java.util.List;

public class NewsUpdater {

    private List<Observer> observers = new ArrayList<>();
    private String news;

    public void sendEmails(String news) {
        this.news = news;
        sendToAllObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void sendToAllObservers() {
        for (Observer observer : observers) {
            System.out.println("\tSent " + news + " to " + observer.email);
            observer.update(news);
        }
    }
}