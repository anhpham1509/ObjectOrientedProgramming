package AdapterPattern;

/**
 * Created by DuyAnhPham on 11/10/15.
 */
public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;

    public void play(String audioType, String fileName){
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.printf("Playing mp3 file. Name: %s\n", fileName);
        }
        else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.printf("Invalid media. %s format not supported", audioType);
        }
    }
}
