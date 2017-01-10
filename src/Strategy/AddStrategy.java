package Strategy;

public class AddStrategy implements Strategy{
    @Override
    public int doAction(int a, int b) {
        return a + b;
    }
}
