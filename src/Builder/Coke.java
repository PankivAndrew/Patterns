package Builder;

/**
 * Created by Andrue on 09.01.2017.
 */
public class Coke extends Drinks {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
