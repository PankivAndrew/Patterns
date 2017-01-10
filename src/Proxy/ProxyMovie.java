package Proxy;

public class ProxyMovie implements Movie{
    private String filename;
    private RealMovie realMovie;
    public ProxyMovie(String filename){
        this.filename = filename;
    }
    @Override
    public void display() {
        if (realMovie == null){
            realMovie = new RealMovie(filename);
        }
        realMovie.display();
    }
}
