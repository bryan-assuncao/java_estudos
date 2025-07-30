package assuncao.bryan.codes.polimorfismo.test;

import assuncao.bryan.codes.polimorfismo.repository.Repository;
import assuncao.bryan.codes.polimorfismo.service.DataBaseRepository;
import assuncao.bryan.codes.polimorfismo.service.FileRepository;
import assuncao.bryan.codes.polimorfismo.service.MemoryRepository;

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
