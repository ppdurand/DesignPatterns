package edu.PedroDurand.Estruturais.Facade.subsistema;

public class Estoque {
    private int qtd = 3;
    public boolean verificarDisponibilidade(String produto) {
        System.out.println("Verificando estoque para " + produto);
        if(qtd >= 1){
            qtd -= 1;
            System.out.println("Produto em estoque");
            return true;
        }
        System.out.println("Produto em falta");
        return false;
    }
}
