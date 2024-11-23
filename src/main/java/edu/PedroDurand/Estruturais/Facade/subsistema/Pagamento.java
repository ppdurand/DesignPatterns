package edu.PedroDurand.Estruturais.Facade.subsistema;

public class Pagamento {
    public void processarPagamento(String metodo, double valor) {
        System.out.println("Processando pagamento de R$" + valor + " via " + metodo);
    }
}
