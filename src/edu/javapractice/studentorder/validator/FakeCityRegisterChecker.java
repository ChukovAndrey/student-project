package edu.javapractice.studentorder.validator;

import edu.javapractice.studentorder.domain.CityRegisterCheckerResponse;
import edu.javapractice.studentorder.domain.Person;

public class FakeCityRegisterChecker implements CityRegisterChecker
{
    public CityRegisterCheckerResponse checkPerson(Person person) {

        return null;
    }
}
