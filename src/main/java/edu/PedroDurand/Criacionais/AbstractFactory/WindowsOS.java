package edu.PedroDurand.Criacionais.AbstractFactory;

public class WindowsOS implements OSFactory{
    @Override
    public void executarPrograma() {
        System.out.println("Executando programa no Windows");
    }
    @Override
    public void localizarArquivo() {
        System.out.println("Procurando arquivo no Windows");
    }
    @Override
    public void desalocarMemoria() {
        System.out.println("A memória foi desalocada pelo Windows");
    }
}
