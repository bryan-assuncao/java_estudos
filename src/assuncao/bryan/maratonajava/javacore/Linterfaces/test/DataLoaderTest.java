package assuncao.bryan.maratonajava.javacore.Linterfaces.test;

import assuncao.bryan.maratonajava.javacore.Linterfaces.domain.DataBaseLoader;
import assuncao.bryan.maratonajava.javacore.Linterfaces.domain.DataLoader;
import assuncao.bryan.maratonajava.javacore.Linterfaces.domain.FileLoader;


public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        dataBaseLoader.remove();
        dataBaseLoader.checkPermission();

        System.out.println("-----------------------");

        fileLoader.load();
        fileLoader.remove();

        System.out.println("-----------------------");

        DataLoader.print();
        System.out.println(DataLoader.MAX_SIZE);

        dataBaseLoader.printDataBaseLoader();



    }
}
