package Facade;

public class Comedy implements Movie{
    @Override
    public void play() {
        System.out.println("Comedy is playing now");
    }
}
