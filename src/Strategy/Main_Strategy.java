package Strategy;

public class Main_Strategy {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        Strategy addStrategy = new AddStrategy();
        int addStrategys = new Context(addStrategy).execute(a, b);
        Strategy substractStrategy = new SubstractStrategy();
        int substractStrategys = new Context(substractStrategy).execute(a, b);
        Strategy multiplyStrategy = new MultiplyStrategy();
        int multiplyStrategys = new Context(multiplyStrategy).execute(a, b);
        System.out.println(addStrategys);
        System.out.println(substractStrategys);
        System.out.println(multiplyStrategys);
    }
}
