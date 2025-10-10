package assuncao.bryan.maratonajava.javacore.ZZ_A_Classes_Internas.test;

class Animal{
    public void walk(){
        System.out.println("Animal walking...");
    }
}


public class AnonymousClassesTest {
    public static void main() {

        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows...");
            }
        };


        animal.walk();
    }
}


