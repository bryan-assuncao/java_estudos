package assuncao.bryan.codes.associacao.test;

import assuncao.bryan.codes.associacao.domain.Professor;
import assuncao.bryan.codes.associacao.domain.School;

public class SchoolTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Kakashi Sensei");
        Professor professor2 = new Professor("Guy Sensei");
        Professor professor3 = new Professor("Jiraya Sensei");

        Professor[] professors = {professor1, professor2, professor3};

        School school = new School("Marshal Rondon", professors);

        school.printSchool();

    }
}
