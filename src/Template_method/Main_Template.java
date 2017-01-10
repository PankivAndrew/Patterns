package Template_method;

public class Main_Template {
    public static void main(String[] args) {
        Movie comedy = new Comedy();
        comedy.play();
        System.out.println("");
        Movie horror = new Horror();
        horror.play();
    }
}
