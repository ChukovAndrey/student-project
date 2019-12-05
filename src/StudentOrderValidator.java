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
                AnswerMarriage marriageAnswer = AnswerMarriage(so);
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

    static AnswerMarriage AnswerMarriage(StudentOrder so) {
        return MarriageValidator.AnswerMarriage(so);
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        return ChildrenValidator.checkChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        return StudentValidator.checkStudent(so);
    }

    static void sendMail(StudentOrder so) {
        System.out.println("Почта отправлена");
    }
}
