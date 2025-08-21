package assuncao.bryan.maratonajava.javacore.Mpolimorfismo.service;

import assuncao.bryan.maratonajava.javacore.Mpolimorfismo.repository.Repository;

public class MemoryRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in memory");
    }
}
