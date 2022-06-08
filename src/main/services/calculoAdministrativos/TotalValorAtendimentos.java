package services.calculoAdministrativos;

public class TotalValorAtendimentos {

    static double balancoDiario=0;

    public static void addBalancoDiario(double balancoDiario) {
        balancoDiario += balancoDiario;
    }

    public static double getBalancoDiario() {
      return balancoDiario;
    }
    
}
