package edu.javapractice.studentorder;

import edu.javapractice.studentorder.domain.*;
import edu.javapractice.studentorder.mail.MailSender;
import edu.javapractice.studentorder.validator.ChildrenValidator;
import edu.javapractice.studentorder.validator.CityRegisterValidator;
import edu.javapractice.studentorder.validator.MarriageValidator;
import edu.javapractice.studentorder.validator.StudentValidator;

public class StudentOrderValidator
{
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {

        while (true) {
            StudentOrder so = readStudentOrder();

            if (so == null) {
                break;
            } else {
                AnswerCityRegister cityAnswer = checkCityRegister(so);
                if (!cityAnswer.success) {
                    //continue;
                    break;
                }
                AnswerMarriage marriageAnswer = checkMarriage(so);
                AnswerChildren childAnswer = checkChildren(so);
                AnswerStudent studAnswer = checkStudent(so);

                sendMail(so);
            }
        }
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        CityRegisterValidator crv = new CityRegisterValidator();
        crv.hostName = "Host";
        crv.login = "Login1";
        crv.password = "Password1";
        AnswerCityRegister ans = crv.checkCityRegister(so);
        return ans;
    }

    static AnswerMarriage checkMarriage(StudentOrder so) {
        MarriageValidator wd = new MarriageValidator();
        return wd.checkMarriage(so);
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        ChildrenValidator cv = new ChildrenValidator();
        return cv.checkChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        return new StudentValidator().checkStudent(so);
    }

    static void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);
    }
}
