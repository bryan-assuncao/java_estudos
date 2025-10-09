package assuncao.bryan.maratonajava.javacore.ZZ_A_Classes_Internas;

public class InnerClassesTest {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void print(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        InnerClassesTest innerClassesTest = new InnerClassesTest();

        Inner inner = innerClassesTest.new Inner();

        inner.print();
    }
}



