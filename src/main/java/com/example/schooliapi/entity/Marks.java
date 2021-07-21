package com.example.schooliapi.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="marks")
@Data
public class Marks {
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name="studentId", column=@Column(name="student_id")),
            @AttributeOverride(name="subjectId", column=@Column(name="subjectId"))
    })
    private MarksId marksId;

    @Column(name="marks")
    private int marks;

    @Override
    public String toString(){
        return (this.marksId.getStudentId()+" "+this.marksId.getSubjectId()+" "+marks);
    }
}
