package Singelton;

/**
 * Created by Andrue on 09.01.2017.
 */
public class SingeltonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
