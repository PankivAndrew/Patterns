package Builder;

/**
 * Created by Andrue on 09.01.2017.
 */
public class MegaBurger extends Burger {
    @Override
    public String name() {
        return "MegaBurger";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }


    @Override
    public float price() {
        return 10.0f;
    }
}
