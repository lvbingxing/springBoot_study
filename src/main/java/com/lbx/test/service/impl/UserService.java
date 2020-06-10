package com.lbx.test.service.impl;

import com.lbx.test.pojo.User;
import com.lbx.test.rep.UserRep;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/7 20:40
 * NOTE:
 */
@Service
@Transactional
public class UserService {
    final
    UserRep userRep;

    public UserService(UserRep userRep) {
        this.userRep = userRep;
    }

    public void add() {
        User user = new User();
        user.setU_name("黄老邪");
        user.setU_age(40);
        userRep.save(user);
//        int a=1/0;
        User user1 = new User();
        user1.setU_name("郭靖");
        user1.setU_age(32);
        userRep.save(user1);
    }

    public User addUser(User user) {

        return userRep.save(user);
    }

    public Optional<User> selectOne(Integer id) {
        return userRep.findById(id);
    }
}
