package calculoAdministrativos;

public class TotalValorAtendimentos {

    static double balancoDiario=0;

    public static void addBalancoDiario(double balancoDia) {
        balancoDiario += balancoDia;
    }

    public static double getBalancoDiario() {
      return balancoDiario;
    }
    
}
