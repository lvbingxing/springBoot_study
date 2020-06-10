package com.lbx.test.controller;

import com.lbx.test.pojo.Student;
import com.lbx.test.service.impl.StuService;
import com.lbx.test.utils.StuResult;
import com.lbx.test.utils.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/7 20:53
 * NOTE:
 */
@RestController
public class StuController {
    private final StuService stuService;
    public StuController(StuService stuService) {
        this.stuService = stuService;
    }

    @GetMapping("/findAll")
    public StuResult findAll(Map map) {
        List<Student> list = stuService.findAll();
        map.put("studentList", list);
        StuResult stuResult = ResultUtil.success(map);
        return stuResult;
    }
    @GetMapping("/findOne/{id}")
    public StuResult findOne(@PathVariable("id")Integer id){
            return ResultUtil.success(stuService.findById(id));
    }
    @PostMapping("/updateOne")
    public StuResult updateOne(Student student){
        return ResultUtil.success(stuService.updateStu(student));
    }
}
