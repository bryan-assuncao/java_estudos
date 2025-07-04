package assuncao.bryan.codes.Teste;

import assuncao.bryan.codes.aulaclasses.dominio.Student;
import assuncao.bryan.codes.aulaclasses.dominio.StudentPrinter;

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
        


    }
}

