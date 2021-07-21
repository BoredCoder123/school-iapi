package com.example.schooliapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MarksId implements Serializable {
    @Column(name="student_id")
    private int studentId;
    @Column(name="subject_id")
    private int subjectId;
}