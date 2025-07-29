package assuncao.bryan.codes.interfacess.domain;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading database...");
    }

    @Override
    public void remove() {
        System.out.println("Remove database.");
    }

    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
    }

    public void printDataBaseLoader(){
        System.out.println("Printing DataBaseLoader...");
    }

}
