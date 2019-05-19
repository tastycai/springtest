package lcwms.springtest.designpattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterTest {

    public static void main(String[] args){

        // 准备集合
        List<Interceptor> interceptors = new ArrayList<>();

        // 真正的对象
        BeforeAdvice beforeAdvice = new BeforeAdvice();
        AfterAdvice afterAdvice = new AfterAdvice();
        Interceptor interceptor = new InterceptorImpl();

        interceptors.add(interceptor);

        // 用适配器包裹后丢到集合
        interceptors.add(new BeforeAdviceAdapter(beforeAdvice));
        interceptors.add(new AfterAdviceAdapter(afterAdvice));

        // 统一的invoke方法
        for (Interceptor it:interceptors){

            it.invoke();
        }
    }
}
