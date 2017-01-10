package Adapter;

/**
 * Created by Andrue on 10.01.2017.
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void platMp4(String fileName) {
        System.out.println("Playing Mp4Audio" + fileName);
    }
}
