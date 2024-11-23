package edu.PedroDurand.Estruturais.Facade;

import edu.PedroDurand.Estruturais.Facade.subsistema.Entrega;
import edu.PedroDurand.Estruturais.Facade.subsistema.Estoque;
import edu.PedroDurand.Estruturais.Facade.subsistema.Pagamento;

public class CodigoCliente {
    public static void main(String[] args) {
        //Sem o Facade
        Estoque estoque = new Estoque();
        Pagamento pagamento = new Pagamento();
        Entrega entrega = new Entrega();

        String produto = "Guitarra";
        double valor = 2000;
        String metodo = "Cartão de Crédito";

        boolean temEstoque = estoque.verificarDisponibilidade(produto);
        if(!temEstoque){
            System.out.println("Não foi possivel continuar com a compra");
        }
        pagamento.processarPagamento(metodo, valor);
        entrega.agendarEntrega(produto);

        //Usando o Facade
//        Facade facade = new Facade();
//        facade.comprarOnline(produto, valor, metodo);

    }
}
