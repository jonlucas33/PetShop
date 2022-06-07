package services.calculoAdministrativos;

import interfaces.IAdministracao;

public class GatosAtendidos implements IAdministracao {

    double balancoDiario=0;

    @Override
    public void addBalancoDiario(double balancoDiario) {
        this.balancoDiario += balancoDiario;
        TotalValorAtendimentos.addBalancoDiario(balancoDiario);
    }

    @Override
    public double getBalancoDiario() {
        return balancoDiario;
    }

}
