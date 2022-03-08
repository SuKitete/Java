package site.suelen.maratonajava.javacore.Kenum.dominio;
/*
ENUM
Tipo de classe.
Usada para decisões limitadas, quando o dado deve ser padronizado, por exemplo, dois tipos de clientes, pessoa física e pessoa jurídica
*/

public enum TipoCliente {
    //Um exemplo agregando um valor a cada tipo caso queira usar no banco de dados
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio){
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    //Busca por atributo
    //Buscando a enumeração(PESSOA_FISICA ou PESSOA_JURIDICA) pelo atributo nomeRelatorio
    public static TipoCliente TipoClientePorNomeRelatorio(String nomeRelatorio){
        for(TipoCliente tipoCliente : values()){//O values percorre todas as enumerações, deve ser iterado
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public int getValor(){
        return this.valor;
    }

    public String getNomeRelatorio(){
        return this.nomeRelatorio;
    }
}
