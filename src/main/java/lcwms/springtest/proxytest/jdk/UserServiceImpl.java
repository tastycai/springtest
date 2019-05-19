package lcwms.springtest.proxytest.jdk;

public class UserServiceImpl implements UserService{

    @Override
    public void add(String name) {

        System.out.println("add ..." + name);
    }

    @Override
    public void update(String originalName, String newName) {

        System.out.println("update...from " + originalName + " to " + newName);
    }
}
