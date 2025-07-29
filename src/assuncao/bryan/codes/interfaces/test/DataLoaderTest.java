package assuncao.bryan.codes.interfaces.test;

import assuncao.bryan.codes.interfaces.domain.DataBaseLoader;
import assuncao.bryan.codes.interfaces.domain.DataLoader;
import assuncao.bryan.codes.interfaces.domain.FileLoader;


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
