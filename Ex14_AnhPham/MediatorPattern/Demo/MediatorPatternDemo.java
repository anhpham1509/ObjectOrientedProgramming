package MediatorPattern.Demo;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User anne = new User("Anne");
        User joe = new User("Joe");

        anne.sendMessage("Hi! Joe!");
        joe.sendMessage("Hello! Anne!");
    }
}