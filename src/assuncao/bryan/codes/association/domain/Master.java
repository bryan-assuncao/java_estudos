package assuncao.bryan.codes.association.domain;

public class Master {
    private String name;
    private String researchField;
    private Seminar[] seminars;

    public Master(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }

    public Master(String name, String researchField, Seminar[] seminars) {
        this.name = name;
        this.researchField = researchField;
        this.seminars = seminars;
    }

    public void printMaster(){
        System.out.println(this.name);
        System.out.println(this.researchField);
        for(Seminar semi : seminars){
            System.out.println(semi.getTitle());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
