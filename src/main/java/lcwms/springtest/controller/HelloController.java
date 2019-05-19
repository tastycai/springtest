package lcwms.springtest.controller;

import lcwms.springtest.dao.UserDao;
import lcwms.springtest.service.OrderService;
import lcwms.springtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @RequestMapping("/hello")
    public String sayHello(){

        return "hello";
    }

    @RequestMapping("/showzhangsan")
    public String showZhangsan(){

        ApplicationContext applicationContext = ApplicationHolder.getApplicationContext();

        /*System.out.println(applicationContext);

        System.out.println(applicationContext.getBean("userServiceImpl"));

        System.out.println(applicationContext.getParent().getBean("userServiceImpl"));*/

        // System.out.println(applicationContext.getBean("userServiceImpl").equals(applicationContext.getParent().getBean("userServiceImpl")));

        UserDao userDaoProxy = (UserDao) applicationContext.getBean("userDaoProxy");

        userDaoProxy.add();

        System.out.println(userDaoProxy);

        orderService.select("123");

        return userService.showUserName();
    }
}
