package assuncao.bryan.maratonajava.javacore.M_Polimorfismo.test;

import assuncao.bryan.maratonajava.javacore.M_Polimorfismo.repository.Repository;
import assuncao.bryan.maratonajava.javacore.M_Polimorfismo.service.DataBaseRepository;
import assuncao.bryan.maratonajava.javacore.M_Polimorfismo.service.FileRepository;
import assuncao.bryan.maratonajava.javacore.M_Polimorfismo.service.MemoryRepository;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository database = new DataBaseRepository();
        Repository memory = new MemoryRepository();
        Repository file = new FileRepository();

        database.save();
        memory.save();
        file.save();
    }
}
