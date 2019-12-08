package edu.javapractice.studentorder.validator;

import edu.javapractice.studentorder.domain.AnswerCityRegister;
import edu.javapractice.studentorder.domain.StudentOrder;

public class CityRegisterValidator
{
    public String hostName;
    public int port;
    public String login;
    public String password;

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running: "
                + hostName + ", " + login + ", " + password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
