package edu.javapractice.studentorder.validator;

import edu.javapractice.studentorder.domain.AnswerCityRegister;
import edu.javapractice.studentorder.domain.StudentOrder;

public class CityRegisterValidator
{
    public String hostName;
    public int port;
    public String login;
    public String password;

    private RealCityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new RealCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        personChecker.checkPerson(so.getHusband());
        personChecker.checkPerson(so.getWife());
        personChecker.checkPerson(so.getChild());

        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
