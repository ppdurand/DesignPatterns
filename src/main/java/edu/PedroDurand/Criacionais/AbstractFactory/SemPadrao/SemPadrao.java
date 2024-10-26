package edu.PedroDurand.Criacionais.AbstractFactory.SemPadrao;

public class SemPadrao {
    public static void main(String[] args){
        WindowsOS windowsOS = new WindowsOS();
        LinuxOS linuxOS = new LinuxOS();
        MacOS macOS = new MacOS();

        ComputerService windowsService = new ComputerService(windowsOS);
        ComputerService linuxService = new ComputerService(linuxOS);
        ComputerService macService = new ComputerService(macOS);

        System.out.println("== Windows ==");
        windowsService.testarWindows();

        System.out.println("\n== Linux ==");
        linuxService.testarLinux();

        System.out.println("\n== MacOS ==");
        macService.testarMac();

    }
}
