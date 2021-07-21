package com.example.schooliapi.service;

import com.example.schooliapi.entity.Marks;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.example.schooliapi.Constants;

import java.util.List;
import org.slf4j.Logger;
import org.springframework.web.client.RestTemplate;

@Service
public class SchoolService {
    private final Logger log= LoggerFactory.getLogger("SchoolService");
    private RestTemplate restTemplate = new RestTemplate();

    public List<Marks> viewStudentMarksById(int studentId){
        String uri=Constants.studentSAPI+"viewAllMarks/"+studentId;
        List<Marks> res = restTemplate.getForObject(uri, List.class);
        return res;
    }

    public Marks studentViewSingleMarks(int studentId, int subjectId){
        String uri=Constants.studentSAPI+"viewMarksOfASingleSubject/"+studentId+"/"+subjectId;
        Marks res=restTemplate.getForObject(uri, Marks.class);
        return res;
    }

    public String studentRequestRecheck(int studentId, int subjectId){
        String uri=Constants.studentSAPI+"requestRecheck/"+studentId+"/"+subjectId;
        String res=restTemplate.getForObject(uri, String.class);
        return res;
    }
}
