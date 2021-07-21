package com.example.schooliapi.controller;

import com.example.schooliapi.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {
    @Autowired
    private SchoolService schoolService;


}
