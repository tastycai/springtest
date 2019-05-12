package lcwms.springtest.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{


    @Override
    public String showUserName() {
        return "zhangsan";
    }
}
