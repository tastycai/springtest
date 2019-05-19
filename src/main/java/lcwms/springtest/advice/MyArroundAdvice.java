package lcwms.springtest.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyArroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        // 先执行啥

        invocation.proceed();

        // 后执行啥
        return null;
    }
}
