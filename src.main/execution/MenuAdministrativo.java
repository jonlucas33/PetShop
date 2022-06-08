package execution;

import java.util.Scanner;

import services.calculoAdministrativos.CachorrosAtendidos;
import services.calculoAdministrativos.GatosAtendidos;
import services.calculoAdministrativos.TotalValorAtendimentos;
//import services.calculoDeAtendimentos.Custos;

public class MenuAdministrativo {

    static Scanner s = new Scanner(System.in);
    int escolha;

    public void menuAdministrativo() {

        CachorrosAtendidos cachorrosAtendidos = new CachorrosAtendidos();
        GatosAtendidos gatosAtendidos = new GatosAtendidos();
        //Custos custos = new Custos();

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
                    TotalValorAtendimentos.getBalancoDiario();
                    break;
                case 2:
               // cachorrosAtendidos.addBalancoDiario(custos.getBalancoDiario());
                cachorrosAtendidos.getBalancoDiario();
                    break;
                case 3:
                gatosAtendidos.getBalancoDiario();
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
