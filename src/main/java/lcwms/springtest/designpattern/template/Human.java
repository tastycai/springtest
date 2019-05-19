package lcwms.springtest.designpattern.template;

public abstract class Human {

    // 模板方法设计模式重点在父类中定义好了模板，然后留出了部分功能让自类来实现，但是流程还是按照父类定义的来。供子类实现的部分也叫钩子 hook
    // 这里就是把spendMoney给子类实现
    public void live(){

        // 读书
        study();

        // 工作
        work();

        // 发工资了
        getMoney();

        // 花钱
        spendMoney();
    }

    public void study(){

        System.out.println("human study...");
    }

    public void work(){

        System.out.println("human work...");
    }

    public void getMoney(){

        System.out.println("human get some money");
    }

    public abstract void spendMoney();
}
