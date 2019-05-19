package lcwms.springtest.designpattern.template;

public class TemplateTest {

    public static void main(String[] args){

        // 第一个
        Human human1 = new Boy();

        human1.live();

        System.out.println("妖娆的分割线==================================================");

        // 第二个
        Human human2 = new Girl();

        human2.live();

        System.out.println("妖娆的分割线==================================================");

        // 第三个
        Human human3 = new Chihuo();

        human3.live();
    }
}
