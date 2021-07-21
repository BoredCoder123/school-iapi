package com.example.schooliapi.controller;

import com.example.schooliapi.entity.Marks;
import com.example.schooliapi.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @GetMapping("/studentViewMarks/{studentId}")
    public List<Marks> viewStudentMarksById(@PathVariable int studentId){
        return schoolService.viewStudentMarksById(studentId);
    }

    @GetMapping("/studentViewSingleMarks/{studentId}/{subjectId}")
    public Marks studentViewSingleMarks(@PathVariable int studentId, @PathVariable int subjectId){
        return schoolService.studentViewSingleMarks(studentId, subjectId);
    }

    @GetMapping("/studentRequestRecheck/{studentId}/{subjectId}")
    public String studentRequestRecheck(@PathVariable int studentId, @PathVariable int subjectId){
        return schoolService.studentRequestRecheck(studentId, subjectId);
    }

    @GetMapping("/")
    public String checkHeartBeat(){
        Date date= new Date();
        String res="School-IAPI is working. "+(new Timestamp(date.getTime()));
        return res;
    }
}
