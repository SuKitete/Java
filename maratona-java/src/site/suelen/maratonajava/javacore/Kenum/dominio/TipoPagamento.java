package site.suelen.maratonajava.javacore.Kenum.dominio;

//Enum sobrescrita de método
public enum TipoPagamento {
    DEBITO{
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calculaDesconto(double valor);//É como se o método não existisse, é usado apenas para ser sobrescrito
}                                                        //Por não ser usado ele recebe o modificador abstract
