package Adapter;

/**
 * Created by Andrue on 10.01.2017.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("vlc","dssdsd.vlc");
        audioPlayer.play("mp4","hdhdhdh.mp4");
        audioPlayer.play("mp3","lsdklsdksl.mp3");
        audioPlayer.play("avi","ldfsgkfg.avi");
    }
}
