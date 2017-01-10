package Facade;

public class MovieMaker {
    private Movie comedy;
    private Movie horror;
    private Movie dorama;
    public MovieMaker(){
        comedy = new Comedy();
        horror = new Horror();
        dorama = new Dorama();
    }
    public void playComedy(){
        comedy.play();
    }
    public void playHorror(){
        horror.play();
    }
    public void playDorama(){
        dorama.play();
    }
}
