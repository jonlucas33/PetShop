package calculoAdministrativos;

import interfaces.IAdministracao;

public class GatosAtendidos implements IAdministracao {

    static double balancoDiario=0;

    public static void addBalancoDiario(double balancoDia) {
        balancoDiario += balancoDia;
        TotalValorAtendimentos.addBalancoDiario(balancoDiario);
    }

    @Override
    public double getBalancoDiario() {
        return balancoDiario;
    }

}
