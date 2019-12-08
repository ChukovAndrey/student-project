package edu.javapractice.studentorder.validator;

import edu.javapractice.studentorder.domain.AnswerChildren;
import edu.javapractice.studentorder.domain.StudentOrder;

public class ChildrenValidator
{
    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children check is running");
        return new AnswerChildren();
    }
}
