package edu.PedroDurand.Criacionais.AbstractFactory;

public class LinuxOS implements OSFactory{
    @Override
    public void executarPrograma() {
        System.out.println("Executando programa no Linux");
    }
    @Override
    public void localizarArquivo() {
        System.out.println("Localizando arquivo no Linux");
    }
    @Override
    public void desalocarMemoria() {
        System.out.println("Desalocando memória do Linux");
    }
}
