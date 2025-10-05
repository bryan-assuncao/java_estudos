package assuncao.bryan.maratonajava.javacore.Z_Generics.test;

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando Cachorro.");
    }
}
class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando Gato.");
    }
}

public class WildcardTest {
    public static void main(String[] args) {
        Cachorro[] cachorro = {new Cachorro(), new Cachorro()};
        Gato[] gato = {new Gato(), new Gato()};
        printConsulta(cachorro);
        printConsulta(gato);
    }
    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }

    }
}
