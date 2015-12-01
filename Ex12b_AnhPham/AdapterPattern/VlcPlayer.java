package AdapterPattern;

/**
 * Created by DuyAnhPham on 11/10/15.
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    public void playVlc(String fileName) {
        System.out.printf("Playing vlc file. Name: %s\n", fileName);
    }

    public void playMp4(String fileName) {

    }
}
