package Factory;

/**
 * Created by Andrue on 09.01.2017.
 */
public class Baseball implements Sport {
    @Override
    public void equipment() {
        System.out.println("Baseball beat");
    }
}
