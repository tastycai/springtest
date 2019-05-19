package lcwms.springtest.designpattern.adapter;

public class BeforeAdviceAdapter implements Interceptor{

    private BeforeAdvice beforeAdvice;

    public BeforeAdviceAdapter(BeforeAdvice beforeAdvice) {
        this.beforeAdvice = beforeAdvice;
    }

    @Override
    public void invoke() {

        beforeAdvice.before();
    }
}
