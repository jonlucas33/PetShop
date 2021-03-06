
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculoDeAtendimentos.CalculoAtendimentoCachorro;
import calculoDeAtendimentos.CalculoAtendimentoGato;
import calculoAdministrativos.CachorrosAtendidos;
import calculoAdministrativos.GatosAtendidos;

public class PetShopTests {
	
	private CalculoAtendimentoCachorro calculoCachorro = new CalculoAtendimentoCachorro();
	private CalculoAtendimentoGato calculoGato = new CalculoAtendimentoGato();
	private CachorrosAtendidos c = new CachorrosAtendidos();
	private GatosAtendidos g = new GatosAtendidos();

	@Test
	public void test01() {
		double actual = calculoCachorro.calculoBanho(30);
		double expected = 36;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void test02() {
		double actual = calculoCachorro.calculoTosa(20);
		double expected = 20;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void test03() {
		double actual = calculoGato.calculoBanho(10);
		double expected = 15;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void test04() {
		double actual = calculoGato.calculoTosa(15);
		double expected = 30;
		Assertions.assertEquals(expected, actual);
	}

}
