package services.calculoAdministrativos;

public class Administracao {

    private CachorrosAtendidos cachorrosAtendidos;
    private GatosAtendidos gatosAtendidos;

    public Administracao() {
        this.cachorrosAtendidos = new CachorrosAtendidos();
        this.gatosAtendidos = new GatosAtendidos();
    }

    public void getBalancoCachorros() {
        this.cachorrosAtendidos.getBalancoDiario();
    }

    public void getBalancoGatos() {
        this.gatosAtendidos.getBalancoDiario();
    }

    public void getBalancoTotal() {
        TotalValorAtendimentos.getBalancoDiario();
    }

}
    
