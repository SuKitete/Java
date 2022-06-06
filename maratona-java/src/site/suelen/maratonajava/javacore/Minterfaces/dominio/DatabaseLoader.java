package site.suelen.maratonajava.javacore.Minterfaces.dominio;

/*
IMPLEMENTADO MÚLTIPLAS INTERFACES
Na interface é possível implementar mais de uma interface,
ao contrário da classe, que estende apenas uma classe.
 */
public class DatabaseLoader implements DataLoader, DataRemover{//Na interface é necessário utilizar a palavra
    @Override                                                  //implements ao invés de extends
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove(){
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission(){
        System.out.println("Checando permissões no banco de dados");
    }
}
