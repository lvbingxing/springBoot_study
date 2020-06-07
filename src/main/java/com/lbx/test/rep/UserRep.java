package com.lbx.test.rep;

import com.lbx.test.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/7 20:46
 * NOTE:
 */
public interface UserRep extends JpaRepository<User, Integer> {
}
