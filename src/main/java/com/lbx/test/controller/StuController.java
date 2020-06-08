package com.lbx.test.controller;

import com.lbx.test.pojo.Student;
import com.lbx.test.service.impl.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/7 20:53
 * NOTE:
 */
@Controller
public class StuController {
    private final StuService stuService;

    public StuController(StuService stuService) {
        this.stuService = stuService;
    }

    @GetMapping("/findAll")
    public String findAll(Map map) {
        List<Student> list = stuService.findAll();
        map.put("studentList", list);
        return "student";
    }
}
