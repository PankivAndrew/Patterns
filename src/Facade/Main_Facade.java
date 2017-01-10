package Facade;

public class Main_Facade {
    public static void main(String[] args) {
        MovieMaker movieMaker = new MovieMaker();
        movieMaker.playComedy();
        movieMaker.playHorror();
        movieMaker.playDorama();
    }
}
