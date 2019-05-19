package lcwms.springtest.designpattern.adapter;

public class AfterAdviceAdapter implements Interceptor{

    private AfterAdvice afterAdvice;


    public AfterAdviceAdapter(AfterAdvice afterAdvice) {
        this.afterAdvice = afterAdvice;
    }

    @Override
    public void invoke() {

        afterAdvice.after();
    }
}
