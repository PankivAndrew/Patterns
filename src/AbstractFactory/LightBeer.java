package AbstractFactory;

/**
 * Created by Andrue on 09.01.2017.
 */
public class LightBeer implements Beer {
    @Override
    public void type() {
        System.out.println("Light beer");
    }
}
