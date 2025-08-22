package assuncao.bryan.maratonajava.javacore.M_Polimorfismo.service;

import assuncao.bryan.maratonajava.javacore.M_Polimorfismo.repository.Repository;

public class DataBaseRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving to the database");
    }
}
