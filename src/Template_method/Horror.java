package Template_method;

public class Horror extends Movie{
    @Override
    void beginning() {
        System.out.println("Start aaaaa");
    }

    @Override
    void middle() {
        System.out.println("Middle aaaaa");
    }

    @Override
    void ending() {
        System.out.println("End aaaaa");

    }
}
