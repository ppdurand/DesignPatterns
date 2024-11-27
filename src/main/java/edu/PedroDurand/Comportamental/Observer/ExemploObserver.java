package edu.PedroDurand.Comportamental.Observer;

public class ExemploObserver {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Cliente p = new Cliente("Pedro", "Teclado");
        Cliente y = new Cliente("Yohans", "Livro");
        Cliente j = new Cliente("Julia", "Livro");

        loja.adicionarObserver(p);
        loja.adicionarObserver(y);
        loja.adicionarObserver(j);

        System.out.println("Atualizando o estoque da loja");
        loja.setProduct("Livro");

        System.out.println("Atualizando o estoque novamente");
        loja.setProduct("Teclado");

    }
}
