package execution;

import java.util.Scanner;

import calculoAdministrativos.CachorrosAtendidos;
import calculoAdministrativos.GatosAtendidos;
import calculoAdministrativos.TotalValorAtendimentos;

public class MenuAdministrativo {

    static Scanner s = new Scanner(System.in);
    int escolha;

    public void menuAdministrativo() {

        CachorrosAtendidos cachorrosAtendidos = new CachorrosAtendidos();
        GatosAtendidos gatosAtendidos = new GatosAtendidos();
        double valorTotal;

        do {
            System.out.println("BEM VINDO AO MENU ADMINISTRATIVO !!!");
            System.out.println();
            System.out.println("Digite 0 - Encerrar o programa");
            System.out.println("Digite 1 - Total do valor dos atendimentos.");
            System.out.println("Digite 2 - Valor de atendimentos de cachorro.");
            System.out.println("Digite 3 - Valor de atendimentos de gato.");
            escolha = s.nextInt();
            switch (escolha) {
                case 1:
                valorTotal=TotalValorAtendimentos.getBalancoDiario();
                System.out.println("O valor total com atendimentos foi: "+valorTotal+" reais");
                    break;
                case 2:
                valorTotal=cachorrosAtendidos.getBalancoDiario();
                System.out.println("O valor total com atendimentos de cachorros foi: "+valorTotal+" reais");
                    break;
                case 3:
                valorTotal=gatosAtendidos.getBalancoDiario();
                System.out.println("O valor total com atendimentos de gatos foi: "+valorTotal+" reais");
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
