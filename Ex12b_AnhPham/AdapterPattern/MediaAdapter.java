package AdapterPattern;

/**
 * Created by DuyAnhPham on 11/10/15.
 */
public class MediaAdapter implements MediaPlayer{

    public AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }
        else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    public void play(String audioType, String fileName){
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }
        else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
