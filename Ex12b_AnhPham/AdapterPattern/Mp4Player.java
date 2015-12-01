package AdapterPattern;

/**
 * Created by DuyAnhPham on 11/10/15.
 */
public class Mp4Player implements AdvancedMediaPlayer{

    public void playVlc(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.printf("Playing mp4 file. Name: %s\n", fileName);
    }
}
