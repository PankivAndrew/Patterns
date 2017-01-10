package Factory;

/**
 * Created by Andrue on 09.01.2017.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        SportFactory SportFactory = new SportFactory();
        Sport sport1 = SportFactory.getSport("Baseball beat");
        sport1.equipment();
        Sport sport2 = SportFactory.getSport("Ski");
        sport2.equipment();
        Sport sport3 = SportFactory.getSport("Football ball");
        sport3.equipment();
    }
}
