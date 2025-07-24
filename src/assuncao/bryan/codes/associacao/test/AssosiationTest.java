package assuncao.bryan.codes.associacao.test;

import assuncao.bryan.codes.associacao.domain.Master;
import assuncao.bryan.codes.associacao.domain.Place;
import assuncao.bryan.codes.associacao.domain.Seminar;
import assuncao.bryan.codes.associacao.domain.Student;

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
