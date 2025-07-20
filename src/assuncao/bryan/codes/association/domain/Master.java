package assuncao.bryan.codes.association.domain;

public class Master {
    private String name;
    private String Specialty;
    private Seminar[] seminars;

    public Master(String name, String Specialty) {
        this.name = name;
        this.Specialty = Specialty;
    }

    public Master(String name, String Specialty, Seminar[] seminars) {
        this.name = name;
        this.Specialty = Specialty;
        this.seminars = seminars;
    }

    public void printMaster(){
        System.out.println("Master: " + this.name);
        System.out.println("Specialty: " + this.Specialty);
        if(seminars == null) return;
        for(Seminar semi : seminars){
            System.out.println("Seminar title: " + semi.getTitle());
            System.out.println("Happening at: " + semi.getPlace().getAddress());
            if (semi.getStudents() == null || semi.getStudents().length == 0) continue;
            System.out.println("-- Students --");
            for(Student learning : semi.getStudents()){
                System.out.println("Student: " + learning.getName() + " " + learning.getAge() + " years old");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchField() {
        return Specialty;
    }

    public void setResearchField(String Specialty) {
        this.Specialty = Specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
