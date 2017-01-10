package Builder;

/**
 * Created by Andrue on 09.01.2017.
 */
public abstract class Drinks implements Item {
    public Packing pack(){
        return new Bottle();
    }
    public abstract float price();

}
