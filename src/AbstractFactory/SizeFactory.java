package AbstractFactory;

/**
 * Created by Andrue on 09.01.2017.
 */
public class SizeFactory extends AbstractFactory {
    @Override
    public Beer getBeer(String beer) {
        return null;
    }

    @Override
    public Size getCapacity(String capacity) {
        if(capacity == null){
            return null;
        }
        if(capacity.equalsIgnoreCase("Half of pinta")){
            return new HalfOfPinta();
        }
        if(capacity.equalsIgnoreCase("Pinta")){
            return new Pinta();
        }
        return null;
    }
}
