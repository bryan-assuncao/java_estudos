package assuncao.bryan.maratonajava.javacore.Z_Generics.test;

import java.util.ArrayList;
import java.util.List;

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
        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
        printConsultaAnimal(List.of(cachorro));
    }
    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
    private static void printConsultaAnimal(List<? super Animal> animals){
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
