package lcwms.springtest.proxytest.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args){

        UserService userService = new UserServiceImpl();

        userService.add("zhangsan");
        userService.update("zhangsan","lisi");

        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("begin transaction");

                Object object = method.invoke(userService,args);

                System.out.println("commit transaction");

                return object;
            }
        });

        System.out.println("妖娆的分隔符=============================================================================");
        userServiceProxy.add("zhangsan");
        userServiceProxy.update("zhangsan","lisi");
    }
}
