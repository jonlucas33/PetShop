package services.calculoAdministrativos;

import interfaces.IAdministracao;

public class CachorrosAtendidos implements IAdministracao {

    double balancoDiario=0;

    @Override
    public double getBalancoDiario() {
       return balancoDiario;
    }

    @Override
    public void addBalancoDiario(double balancoDiario) {
        this.balancoDiario += balancoDiario;
        TotalValorAtendimentos.addBalancoDiario(balancoDiario);
    }

}
