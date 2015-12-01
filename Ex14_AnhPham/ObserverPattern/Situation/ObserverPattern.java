package ObserverPattern.Situation;

public class ObserverPattern {
    public static void main(String[] args) {
        NewsUpdater newsUpdater = new NewsUpdater();

        Observer Hanna = new Observer("Hanna", "hanna2015@gmail.com", newsUpdater);
        Observer John = new Observer("John", "john209@gmail.com", newsUpdater);

        newsUpdater.addObserver(Hanna);
        newsUpdater.addObserver(John);

        System.out.println("Send Newsletter Oct 2015");
        newsUpdater.sendEmails("Newsletter Oct 2015");

        Hanna.stopObserving(newsUpdater);

        System.out.println("Send Newsletter May 2016");
        newsUpdater.sendEmails("Newsletter May 2016");
    }
}