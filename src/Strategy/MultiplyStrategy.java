package Strategy;

public class MultiplyStrategy implements Strategy{
    @Override
    public int doAction(int a, int b) {
        return a * b;
    }
}
