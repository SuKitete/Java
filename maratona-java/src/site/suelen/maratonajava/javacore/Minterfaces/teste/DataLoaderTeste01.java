package site.suelen.maratonajava.javacore.Minterfaces.teste;

import site.suelen.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import site.suelen.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

    }
}
