package AbstractFactory;

/**
 * Created by Andrue on 09.01.2017.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory BeerFactory = FactoryProducer.getFactory("BeerFactory");
        Beer beer1 = BeerFactory.getBeer("LightBeer");
        beer1.type();
        Beer beer2 = BeerFactory.getBeer("BrownBeer");
        beer2.type();
        AbstractFactory SizeFactory = FactoryProducer.getFactory("SizeFactory");
        Size size1 = SizeFactory.getCapacity("Half Of Pinta");
        size1.capacity();
        Size size2 = SizeFactory.getCapacity("Pinta");
        size2.capacity();

    }
}
