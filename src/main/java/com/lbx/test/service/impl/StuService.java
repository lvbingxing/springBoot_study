package com.lbx.test.service.impl;

import com.lbx.test.pojo.Student;
import com.lbx.test.rep.StuRep;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/8 9:36
 * NOTE:
 */
@Service
public class StuService {
    private final StuRep stuRep;

    public StuService(StuRep stuRep) {
        this.stuRep = stuRep;
    }

    public List<Student> findAll() {
        return stuRep.findAll();

    }
}
