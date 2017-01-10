package AbstractFactory;

/**
 * Created by Andrue on 09.01.2017.
 */
public abstract class AbstractFactory {
    abstract Beer getBeer(String beer);
    abstract Size getCapacity(String capacity);
}
