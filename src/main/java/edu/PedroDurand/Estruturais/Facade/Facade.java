package edu.PedroDurand.Estruturais.Facade;

import edu.PedroDurand.Estruturais.Facade.subsistema.Entrega;
import edu.PedroDurand.Estruturais.Facade.subsistema.Estoque;
import edu.PedroDurand.Estruturais.Facade.subsistema.Pagamento;

public class Facade {
    private final Estoque estoque;
    private final Pagamento pagamento;
    private final Entrega entrega;

    public Facade() {
        this.estoque = new Estoque();
        this.pagamento = new Pagamento();
        this.entrega = new Entrega();
    }

    public void comprarOnline(String produto, Double valor, String metodo){
        boolean temEstoque = estoque.verificarDisponibilidade(produto);
        if(!temEstoque){
            System.out.println("Não foi possivel continuar com a compra");
        }
        pagamento.processarPagamento(metodo, valor);
        entrega.agendarEntrega(produto);
    }
}
