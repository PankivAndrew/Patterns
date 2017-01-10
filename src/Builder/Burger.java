package Builder;

/**
 * Created by Andrue on 09.01.2017.
 */
public abstract class Burger implements Item {
    public Packing pack(){
        return new Wrapper();
    }
}
