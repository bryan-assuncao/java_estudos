package assuncao.bryan.codes.classes.domain;

public class StudentPrinter {
    public void print(Student student){
        System.out.println("-------------");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
