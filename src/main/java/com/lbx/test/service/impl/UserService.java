package com.lbx.test.service.impl;

import com.lbx.test.pojo.User;
import com.lbx.test.rep.UserRep;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/7 20:40
 * NOTE:
 */
@Service
public class UserService {
    final
    UserRep userRep;

    public UserService(UserRep userRep) {
        this.userRep = userRep;
    }

    public void add() {
        User user = new User();
        user.setU_name("黄渤");
        user.setU_age(40);
        userRep.save(user);
    }

    public User addUser(User user) {

        return userRep.save(user);
    }

    public Optional<User> selectOne(Integer id) {
        return userRep.findById(id);
    }
}
