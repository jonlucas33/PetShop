package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import services.calculoDeAtendimentos.CalculoAtendimentoCachorro;
import services.calculoDeAtendimentos.CalculoAtendimentoGato;

public class PetShopTests {
	
	private CalculoAtendimentoCachorro calculoCachorro = new CalculoAtendimentoCachorro();
	private CalculoAtendimentoGato calculoGato = new CalculoAtendimentoGato();
	
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
	
	/*@Test
	public void test05() {
		try {
			calculoCachorro.calculoBanho(3);
			Assertions.fail("N�o trabalhamos com animais desse porte.");
		}catch(Exception e) {
			
		}
	}
	
	@Test
	public void test06() {
		try {
			calculoCachorro.calculoTosa(-5);
			Assertions.fail("N�o trabalhamos com animais desse porte.");
		}catch(Exception e) {
			
		}
	}
	
	@Test
	public void test07() {
		try {
			calculoGato.calculoTosa(200);
			Assertions.fail("N�o trabalhamos com animais desse porte.");
		} catch(Exception e) {
			
		}
	}
	
	@Test
	public void test08() {
		try {
			calculoGato.calculoBanho(0);
			Assertions.fail("N�o trabalhamos com animais desse porte.");
		} catch(Exception e) {
			
		}
	}*/
}
