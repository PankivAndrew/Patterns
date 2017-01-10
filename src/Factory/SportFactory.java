package Factory;

/**
 * Created by Andrue on 09.01.2017.
 */
public class SportFactory {
    public Sport getSport(String equipment){
        if (equipment == null){
            return null;
        }
        if (equipment.equalsIgnoreCase("Baseball beat")){
            return new Baseball();
        }
        if(equipment.equalsIgnoreCase("Football ball")){
            return new Football();
        }
        if(equipment.equalsIgnoreCase("Ski")){
            return new Skiing();
        }
        return null;
    }
}
