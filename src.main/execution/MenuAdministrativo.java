package execution;

import java.util.Scanner;

import calculoAdministrativos.CachorrosAtendidos;
import calculoAdministrativos.GatosAtendidos;
import calculoAdministrativos.TotalValorAtendimentos;
import calculoAdministrativos.totalAtendimentos;

public class MenuAdministrativo {

    static Scanner s = new Scanner(System.in);
    int escolha;

    public void menuAdministrativo() {
        TotalValorAtendimentos totalValorAtendimentos = new TotalValorAtendimentos();
        CachorrosAtendidos c = new CachorrosAtendidos();
        GatosAtendidos g = new GatosAtendidos();
        totalAtendimentos t = new totalAtendimentos();
        do {
            System.out.println("BEM VINDO AO MENU ADMINISTRATIVO !!!");
            System.out.println();
            System.out.println("Digite 0 - Encerrar o programa");
            System.out.println("Digite 1 - Total do valor dos atendimentos.");
            System.out.println("Digite 2 - Quantos cachorros marcaram atendimentos.");
            System.out.println("Digite 3 - Quantos gatos marcaram atendimentos.");
            System.out.println("Digite 4 - Quantos banhos e tosas.");
            switch (escolha) {
                case 1:
                    totalValorAtendimentos.balancoDiario();
                    break;
                case 2:
                    c.balancoDiario();
                    break;
                case 3:
                    g.balancoDiario();
                    break;
                case 4:
                    t.balancoDiario();
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
