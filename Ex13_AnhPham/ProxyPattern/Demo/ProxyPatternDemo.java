package ProxyPattern.Demo;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("metropolia.png");

        image.display();
        System.out.println("");


        image.display();
    }
}