package Factory;

/**
 * Created by Andrue on 09.01.2017.
 */
public class Football implements Sport {
    @Override
    public void equipment() {
        System.out.println("Football ball!");
    }
}
