package Template_method;
public abstract class Movie {
    abstract void beginning();
    abstract void middle();
    abstract void ending();

    public final void play(){
        beginning();
        middle();
        ending();

    }
}
