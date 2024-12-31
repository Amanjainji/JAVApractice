package oops;

import oops.helper.student;

public class test {
    public static void main(String[] args) {
        student s1=new student(194,"Aman",95);

        student s2=new student(198,"Harsh",90);
        System.out.println(s2.getPerc());

        System.out.println(s1.Class);
        //System.out.println(s1.getNoOfStudent());

        System.out.println(student.getNoOfStudent());  //to access this using class , make it static function.

    }
}
