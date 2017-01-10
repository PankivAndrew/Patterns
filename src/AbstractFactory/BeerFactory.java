package AbstractFactory;

/**
 * Created by Andrue on 09.01.2017.
 */
public class BeerFactory extends AbstractFactory {
    @Override
    public Beer getBeer(String beer) {
        if(beer == null){
            return null;
        }
        if(beer.equalsIgnoreCase("LightBeer")){
            return new LightBeer();
        }
        if(beer.equalsIgnoreCase("BrownBeer")){
            return new BrownBeer();
        }
        return null;
    }

    @Override
    public Size getCapacity(String capacity) {
        return null;
    }
}
