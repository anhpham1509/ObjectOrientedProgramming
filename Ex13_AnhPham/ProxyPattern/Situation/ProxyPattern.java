package ProxyPattern.Situation;

public class ProxyPattern {

    public static void main(String[] args) {
        Video video = new ProxyVideo("espoo.mp4");

        video.play();
        System.out.println("");


        video.play();
    }
}