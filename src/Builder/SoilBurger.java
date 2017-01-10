package Builder;

/**
 * Created by Andrue on 09.01.2017.
 */
public class SoilBurger extends Burger {
    @Override
    public String name() {
        return "SoilBurger";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
