package Singelton;

/**
 * Created by Andrue on 09.01.2017.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){}
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hell World!");
    }
}
