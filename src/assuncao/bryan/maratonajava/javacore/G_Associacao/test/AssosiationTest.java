package assuncao.bryan.maratonajava.javacore.G_Associacao.test;

import assuncao.bryan.maratonajava.javacore.G_Associacao.domain.Master;
import assuncao.bryan.maratonajava.javacore.G_Associacao.domain.Place;
import assuncao.bryan.maratonajava.javacore.G_Associacao.domain.Seminar;
import assuncao.bryan.maratonajava.javacore.G_Associacao.domain.Student;

public class AssosiationTest {
    public static void main(String[] args) {
        Place place = new Place("Konoha Village");

        Student student1 = new Student("Sasuke", 13);
        Student student2 = new Student("Naruto", 13);
        Student[] students = {student1, student2};

        Seminar seminar1 = new Seminar("Get Stronger", students, place);
        Seminar[] seminars = {seminar1};

        Master master = new Master("Kakashi Sensei", "Ninja");

        master.setSeminars(seminars);

        master.printMaster();


    }
}
