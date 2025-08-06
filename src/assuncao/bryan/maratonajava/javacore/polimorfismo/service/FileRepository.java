package assuncao.bryan.maratonajava.javacore.polimorfismo.service;

import assuncao.bryan.maratonajava.javacore.polimorfismo.repository.Repository;

public class FileRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving file");
    }
}
