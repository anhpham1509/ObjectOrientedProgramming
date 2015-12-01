package ObserverPattern.Situation;

public class Observer {
    NewsUpdater newsUpdater;
    String name;
    String email;

    public  Observer(String name, String email, NewsUpdater newsUpdater){
        this.name = name;
        this.email = email;
        this.newsUpdater = newsUpdater;
    }

    public void update(String content){
        System.out.println("\t" + name + " received email about " + content + "\n");
    }

    public void stopObserving(NewsUpdater newsUpdater){
        newsUpdater.removeObserver(this);
    }
}