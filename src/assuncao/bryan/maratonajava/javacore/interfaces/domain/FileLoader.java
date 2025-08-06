package assuncao.bryan.maratonajava.javacore.interfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading files...");
    }

    @Override
    public void remove() {
        System.out.println("Remove file.");
    }
}
