package Adapter;

/**
 * Created by Andrue on 10.01.2017.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VlcAudio" + fileName);

    }

    @Override
    public void platMp4(String fileName) {

    }
}
