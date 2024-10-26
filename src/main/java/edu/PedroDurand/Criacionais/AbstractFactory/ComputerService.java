package edu.PedroDurand.Criacionais.AbstractFactory;

public class ComputerService {
    private OSFactory osFactory;

    public ComputerService(OSFactory osFactory) {
        this.osFactory = osFactory;
    }

    public void testarSistema() {
        osFactory.executarPrograma();
        osFactory.localizarArquivo();
        osFactory.desalocarMemoria();
    }
}
