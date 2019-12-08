package edu.javapractice.studentorder.validator;

import edu.javapractice.studentorder.domain.AnswerStudent;
import edu.javapractice.studentorder.domain.StudentOrder;

public class StudentValidator
{
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Студенты проверяются");
        return new AnswerStudent();
    }
}
