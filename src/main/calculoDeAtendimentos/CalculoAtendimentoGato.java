package calculoDeAtendimentos;

import calculoAdministrativos.GatosAtendidos;
import interfaces.CalculoAtendimento;

public class CalculoAtendimentoGato implements CalculoAtendimento{

	@Override
	public double calculoTosa(double tamanho) {
		double valor = tamanho * 2.0;
		GatosAtendidos.addBalancoDiario(valor);
		return valor;
	}

	@Override
	public double calculoBanho(double tamanho) {
		double valor= tamanho * 1.5;
		GatosAtendidos.addBalancoDiario(valor);
		return valor;
	}

}
