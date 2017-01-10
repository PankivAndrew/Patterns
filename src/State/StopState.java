package State;

public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("You are now in stop state");
        context.setState(this);
    }
    public String toString(){
        return "Stop State";
    }
}
