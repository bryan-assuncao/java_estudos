package assuncao.bryan.codes.Teste;

import assuncao.bryan.codes.aulaclasses.dominio.Estudante;
import assuncao.bryan.codes.aulaclasses.dominio.Professor;

public class EstudanteTeste {
    public static void main(String[] args){
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();
        Professor professor = new Professor();

        estudante.name = "Bryan";
        estudante.age = 24;
        estudante.sex = 'M';

        estudante02.name = "Maju";
        estudante02.age = 23;
        estudante02.sex = 'F';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);

        System.out.println("======");

        System.out.println(estudante02.name);
        System.out.println(estudante02.age);
        System.out.println(estudante02.sex);

        System.out.println("======");
        
        System.out.println(professor.name);
        System.out.println(professor.age);
        System.out.println(professor.sex);

    }
}

