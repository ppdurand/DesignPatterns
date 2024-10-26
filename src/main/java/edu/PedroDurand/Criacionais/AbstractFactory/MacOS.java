package edu.PedroDurand.Criacionais.AbstractFactory;

public class MacOS implements OSFactory{
    @Override
    public void executarPrograma() {
        System.out.println("Executando o programa selecionado no Mac");
    }

    @Override
    public void localizarArquivo() {
        System.out.println("Buscando arquivo no Mac");
    }

    @Override
    public void desalocarMemoria() {
        System.out.println("O Mac desalocou a memória");
    }
}
