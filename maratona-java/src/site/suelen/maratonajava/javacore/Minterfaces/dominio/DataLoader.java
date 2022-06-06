package site.suelen.maratonajava.javacore.Minterfaces.dominio;

/*
INTERFACE
É uma classe abstrata composta por métodos abstratos, ou seja, não pode ser instanciada
Serve para que outras classes, baseadas nessa classe, utilizem esses métodos de forma específica
Usa-se a palavra interface ao invés de class
Por padrão todos os métodos de uma interface são public e abstract
 */
public interface DataLoader {
    public abstract void load();

    /*
    DEFAULT
    Usado para possibilitar a implentação de um método concreto em uma interface, dessa forma não é obrigatório
    que as classes que implementam essa interface implementem esse método, o que evita de quebrar o código.
     */
    default void checkPermission(){
        System.out.println("Checando permissões");
    }
}
