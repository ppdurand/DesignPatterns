package edu.PedroDurand.Criacionais.AbstractFactory;

public class AbstractFactory {
    public static void main(String[] args) {
        OSFactory windows = new WindowsOS();
        OSFactory linux = new LinuxOS();
        OSFactory mac = new MacOS();

        ComputerService windowsService = new ComputerService(windows);
        ComputerService linuxService = new ComputerService(linux);
        ComputerService macService = new ComputerService(mac);

        System.out.println("Windows");
        windowsService.testarSistema();

        System.out.println("\nLinux");
        linuxService.testarSistema();

        System.out.println("\nMac");
        macService.testarSistema();

    }
}
