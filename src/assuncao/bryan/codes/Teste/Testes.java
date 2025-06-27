package assuncao.bryan.codes.Teste;

import assuncao.bryan.codes.aulaclasses.dominio.Estudante;
import assuncao.bryan.codes.aulaclasses.dominio.Estudante02;
import assuncao.bryan.codes.aulaclasses.dominio.Professor;

public class Testes {
    public static void main(String[] args){
        Estudante estudante = new Estudante();
        Estudante02 estudante02 = new Estudante02();
        Professor professor = new Professor();

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

