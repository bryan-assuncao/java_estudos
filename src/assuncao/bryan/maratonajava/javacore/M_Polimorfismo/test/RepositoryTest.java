package assuncao.bryan.maratonajava.javacore.Mpolimorfismo.test;

import assuncao.bryan.maratonajava.javacore.Mpolimorfismo.repository.Repository;
import assuncao.bryan.maratonajava.javacore.Mpolimorfismo.service.DataBaseRepository;
import assuncao.bryan.maratonajava.javacore.Mpolimorfismo.service.FileRepository;
import assuncao.bryan.maratonajava.javacore.Mpolimorfismo.service.MemoryRepository;

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
