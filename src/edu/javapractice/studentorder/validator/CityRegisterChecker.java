package edu.javapractice.studentorder.validator;

import edu.javapractice.studentorder.domain.CityRegisterCheckerResponse;
import edu.javapractice.studentorder.domain.Person;

public interface CityRegisterChecker
{
    CityRegisterCheckerResponse checkPerson(Person person);
}
