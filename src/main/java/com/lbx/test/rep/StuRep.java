package com.lbx.test.rep;

import com.lbx.test.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/8 9:37
 * NOTE:    spring JPA接口
 */
public interface StuRep extends JpaRepository<Student, Integer> {
}
