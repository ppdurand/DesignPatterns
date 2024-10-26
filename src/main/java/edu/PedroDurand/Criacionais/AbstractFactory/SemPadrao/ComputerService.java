package edu.PedroDurand.Criacionais.AbstractFactory.SemPadrao;

public class ComputerService {
    private WindowsOS windowsOS;
    private LinuxOS linuxOS;
    private MacOS macOS;

    public ComputerService(WindowsOS windowsOS) {
        this.windowsOS = windowsOS;
    }

    public ComputerService(LinuxOS linuxOS) {
        this.linuxOS = linuxOS;
    }

    public ComputerService(MacOS macOS) {
        this.macOS = macOS;
    }

    public void testarWindows() {
        windowsOS.executarPrograma();
        windowsOS.localizarArquivo();
        windowsOS.desalocarMemoria();
    }

    public void testarLinux() {
        linuxOS.executarPrograma();
        linuxOS.localizarArquivo();
        linuxOS.desalocarMemoria();
    }

    public void testarMac() {
        macOS.executarPrograma();
        macOS.localizarArquivo();
        macOS.desalocarMemoria();
    }
}

