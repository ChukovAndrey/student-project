package edu.javapractice.studentorder.validator;

import edu.javapractice.studentorder.domain.AnswerMarriage;
import edu.javapractice.studentorder.domain.StudentOrder;

public class MarriageValidator
{
    public AnswerMarriage checkMarriage(StudentOrder so) {
        System.out.println("Wedding запущен");
        return new AnswerMarriage();
    }
}
