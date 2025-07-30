package assuncao.bryan.codes.polimorfismo.service;

import assuncao.bryan.codes.polimorfismo.repository.Repository;

public class FileRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving file");
    }
}
