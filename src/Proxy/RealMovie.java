package Proxy;

public class RealMovie implements Movie{
    String filename;
    public RealMovie(String filename){
        this.filename = filename;
        loadFromDisc(filename);

    }
    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
    public void loadFromDisc(String filename){
        System.out.println("Loading from disc " + filename);
    }
}
