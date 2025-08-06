package assuncao.bryan.maratonajava.javacore.polimorfismo.test;

import assuncao.bryan.maratonajava.javacore.polimorfismo.repository.Repository;
import assuncao.bryan.maratonajava.javacore.polimorfismo.service.DataBaseRepository;
import assuncao.bryan.maratonajava.javacore.polimorfismo.service.FileRepository;
import assuncao.bryan.maratonajava.javacore.polimorfismo.service.MemoryRepository;

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
