package assuncao.bryan.codes.interfaces.domain;

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
