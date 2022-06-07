package execution;

import java.util.Scanner;

import services.calculoAdministrativos.CachorrosAtendidos;
import services.calculoAdministrativos.GatosAtendidos;
import services.calculoAdministrativos.TotalValorAtendimentos;

public class MenuAdministrativo {

    static Scanner s = new Scanner(System.in);
    int escolha;

    public void menuAdministrativo() {
        CachorrosAtendidos c = new CachorrosAtendidos();
        GatosAtendidos g = new GatosAtendidos();
        do {
            System.out.println("BEM VINDO AO MENU ADMINISTRATIVO !!!");
            System.out.println();
            System.out.println("Digite 0 - Encerrar o programa");
            System.out.println("Digite 1 - Total do valor dos atendimentos.");
            System.out.println("Digite 2 - Quantos cachorros marcaram atendimentos.");
            System.out.println("Digite 3 - Quantos gatos marcaram atendimentos.");
            switch (escolha) {
                case 1:
                    TotalValorAtendimentos.getBalancoDiario();
                    break;
                case 2:
                    c.getBalancoDiario();
                    break;
                case 3:
                    g.getBalancoDiario();
                    break;
                case 0:
                    System.out.println("Programa encerrado. Volte sempre.");
                    break;

                default:
                    System.out.println("Opção inválida. Digite um dos números do menu.");
                    break;
            }
        } while (escolha != 0);
    }

}
