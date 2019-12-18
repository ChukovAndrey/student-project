package edu.javapractice.studentorder;

import edu.javapractice.studentorder.domain.Adult;
import edu.javapractice.studentorder.domain.StudentOrder;

public class SaveStudentOrder
{

    public static void main(String[] args) {

 //       StudentOrder so = new StudentOrder();

//        long ans = saveStudentOrder(so);
//        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder");

        return answer;
    }

    public static StudentOrder buildStudentOrder (long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);
        printStudentOrder(so);
        return so;
    }

    static void printStudentOrder(StudentOrder stOr) {
        System.out.println(stOr.getStudentOrderId());
    }
}
