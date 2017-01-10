package Strategy;

public class Context {
    Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public  int execute(int a, int b){
        return strategy.doAction(a, b);
    }
}
