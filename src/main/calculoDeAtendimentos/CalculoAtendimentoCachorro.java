package calculoDeAtendimentos;

import interfaces.CalculoAtendimento;
import calculoAdministrativos.CachorrosAtendidos;

public class CalculoAtendimentoCachorro implements CalculoAtendimento {
	
	@Override
	public double calculoTosa(double tamanho) {
		double valor = tamanho * 1.0;
		CachorrosAtendidos.addBalancoDiario(valor);
		return valor;
	}

	@Override
	public double calculoBanho(double tamanho) {
		double valor = tamanho * 1.2;
		CachorrosAtendidos.addBalancoDiario(valor);
		return valor;
	}

}
