package com.lbx.test.service.impl;

import com.lbx.test.enums.ResultEnums;
import com.lbx.test.pojo.Student;
import com.lbx.test.rep.StuRep;
import com.lbx.test.utils.MyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/8 9:36
 * NOTE:    student 服务层
 */
@Service
@Transactional
public class StuService {
    private final StuRep stuRep;

    public StuService(StuRep stuRep) {
        this.stuRep = stuRep;
    }

    public List<Student> findAll() {
        return stuRep.findAll();

    }

    public Student findById(Integer id) throws MyException {

        if (!stuRep.findById(id).isEmpty()) {
            return stuRep.findById(id).get();
        }else {
        throw new MyException(ResultEnums.EXIST_ERROR);
        }
    }

    public Student updateStu(Student student){
        if (stuRep.save(student) != null) {
            return stuRep.save(student);
        }else {
            throw  new MyException(ResultEnums.UNKNOWN_ERROR);
        }
    }
}
