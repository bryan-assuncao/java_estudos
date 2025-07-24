package assuncao.bryan.codes.classe.domain;

public class Bryan {
    public String surname;
    public int age;
    public String[] stacks;

    public void printBryan(String surname, int age, String... stacks){

        this.surname = surname;
        this.age = age;
        this.stacks = stacks;

        System.out.println(this.surname);
        System.out.println(this.age);
        if (stacks == null) return;
        for(String stack : this.stacks){
            System.out.println(stack);
        }
    }
}



