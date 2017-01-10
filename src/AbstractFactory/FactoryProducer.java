package AbstractFactory;

/**
 * Created by Andrue on 09.01.2017.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice == null) {
            return null;
        }
        if(choice.equalsIgnoreCase("BeerFactory")){
            return new BeerFactory();
        }
        if(choice.equalsIgnoreCase("SizeFactory")){
            return new SizeFactory();
        }
        return null;
    }
}
