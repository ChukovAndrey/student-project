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
                    continue;
                }
                AnswerWedding wedAnswer = checkWedding(so);
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
        return CityRegisterValidator.checkCityRegister(so);
    }

    static AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding запущен");
        return new AnswerWedding();
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children check is running");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Студенты проверяются");
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder so) {
        System.out.println("Почта отправлена");
    }
}
