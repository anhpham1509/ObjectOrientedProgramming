package ProxyPattern.Situation;

public class RealVideo implements Video {

    private String fileName;

    public RealVideo(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public void play() {
        System.out.println("Playing " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}