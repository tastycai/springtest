package lcwms.springtest.designpattern.adapter;

public class InterceptorImpl implements Interceptor{
    @Override
    public void invoke() {

        System.out.println(" InterceptorImpl invoke...");
    }
}
