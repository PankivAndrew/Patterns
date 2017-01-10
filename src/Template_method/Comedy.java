package Template_method;

public class Comedy extends Movie {
    @Override
    void beginning() {
        System.out.println("Start ahaha");
    }

    @Override
    void middle() {
        System.out.println("Middle ahaha");
    }

    @Override
    void ending() {
        System.out.println("End ahahah");
    }
}
