package assuncao.bryan.maratonajava.javacore.Mpolimorfismo.service;

import assuncao.bryan.maratonajava.javacore.Mpolimorfismo.repository.Repository;

public class FileRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving file");
    }
}
