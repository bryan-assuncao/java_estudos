package assuncao.bryan.maratonajava.javacore.M_Polimorfismo.service;

import assuncao.bryan.maratonajava.javacore.M_Polimorfismo.repository.Repository;

public class MemoryRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in memory");
    }
}
