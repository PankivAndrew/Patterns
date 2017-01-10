package Builder;

/**
 * Created by Andrue on 09.01.2017.
 */
public class Sprite extends Drinks {
    @Override
    public String name() {
        return "Sprite";
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public float price() {
        return 2.5f;
    }
}
