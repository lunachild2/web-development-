package exam02;

public class Ex01 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.student(1000,"학생1","과목1");
        s1.showInfo();
        System.out.println("s1 = "+System.identityHashCode(s1));

        Student s2 = new Student();
        s2.student(1001,"학생2","과목2");
        s2.showInfo();
        System.out.println("s2 = "+System.identityHashCode(s2));

        Student s3 = s2;
        s3.student(1002,"학생3","과목3");
        s3.showInfo();
        System.out.println("s3 = "+System.identityHashCode(s3));

        //System.out.println(System.identityHashCode(s1));

        /*
        s1.id = 1000;
        s1.name = "학생1";
        s1.subject = "과목1";
        */


    }
}
