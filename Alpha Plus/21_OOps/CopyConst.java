import java.util.StringTokenizer;

import javax.print.DocFlavor.STRING;

public class CopyConst {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "yoyo";
        Student s2 = new Student(s1);
        s1.name = "bebe";// this wont work here but if it was an array it would have been changed

        System.out.println(s2.name);

    }

}

class Student {
    String name;
    int roll;
    String pwd;

    Student(Student s1) {
        this.name = s1.name;
    }

    Student() {
        System.out.println("Const callledddd");
    }
}