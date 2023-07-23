package furtado.erlan.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento{
        DEBITO{
                @Override
                public double calcularDesconto(double valor) {
                        return valor * 0.1;
                }
        },
        Credito{
                @Override
                public double calcularDesconto(double valor) {
                        return valor * 0.05;
                }
        };

        public double calcularDesconto(double valor){
            return 0;
        }
}