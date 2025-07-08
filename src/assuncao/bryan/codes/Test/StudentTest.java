package assuncao.bryan.codes.Test;

import assuncao.bryan.codes.classes.domain.Student;
import assuncao.bryan.codes.classes.domain.StudentPrinter;

public class StudentTest {
    public static void main(String[] args){
        Student student = new Student();
        Student student02 = new Student();
        StudentPrinter printer = new StudentPrinter();
        

        student.name = "Bryan";
        student.age = 24;
        student.gender = 'M';

        student02.name = "Maju";
        student02.age = 23;
        student02.gender = 'F';
        
        
        printer.print(student);
        printer.print(student02);

        student.print();
        student02.print();

        student.justName();
        


    }
}

