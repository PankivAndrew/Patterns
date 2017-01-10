package Strategy;

public class SubstractStrategy implements Strategy{
    @Override
    public int doAction(int a, int b) {
        return a - b;
    }
}
