package edu.javapractice.studentorder;

import edu.javapractice.studentorder.domain.*;
import edu.javapractice.studentorder.mail.MailSender;
import edu.javapractice.studentorder.validator.ChildrenValidator;
import edu.javapractice.studentorder.validator.CityRegisterValidator;
import edu.javapractice.studentorder.validator.MarriageValidator;
import edu.javapractice.studentorder.validator.StudentValidator;

public class StudentOrderValidator
{
    private CityRegisterValidator cityRegisterVal;
    private MarriageValidator marriageVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterVal = new CityRegisterValidator();
        marriageVal = new MarriageValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

    public void checkAll() {
        StudentOrder[] soArray = readStudentOrders();

        for(int c = 0; c < soArray.length; c++) {
            System.out.println();
            checkOneOrder(soArray[c]);
        }
    }

    public StudentOrder[] readStudentOrders() {
        StudentOrder[] soArray = new StudentOrder[3];

        for(int c = 0; c < soArray.length; c++) {
            soArray[c] = SaveStudentOrder.buildStudentOrder(c);
        }

        StudentOrder so = new StudentOrder();
        return soArray;
    }

    public void checkOneOrder(StudentOrder so) {
        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerMarriage marriageAnswer = checkMarriage(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerStudent studAnswer = checkStudent(so);

        sendMail(so);
    }


    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerMarriage checkMarriage(StudentOrder so) {
        return marriageVal.checkMarriage(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        return studentVal.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }
}
