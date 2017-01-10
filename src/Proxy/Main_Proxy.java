package Proxy;

public class Main_Proxy {
    public static void main(String[] args) {
        Movie movie = new ProxyMovie("Titanic");
        movie.display();
        System.out.println("");
        movie.display();
    }
}