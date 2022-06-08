package execution;

import java.util.Scanner;

import entidades.Animal;
import entidades.Cachorro;
import entidades.Gato;
import exceptions.CadastroNaoExiste;
import exceptions.CadastroNaoPermitido;
import exceptions.TamanhoNaoPermitido;
import interfaces.CalculoAtendimento;
import calculoDeAtendimentos.CalculoAtendimentoCachorro;
import calculoDeAtendimentos.CalculoAtendimentoGato;
import calculoDeAtendimentos.Custos;
import sistemaDeCadastros.Cadastro;
import sistemaDeCadastros.EfetuarCadastro;

public class MenuGeral {

	static Scanner s = new Scanner(System.in);
	int escolha, idade;
	double peso;
	String nome;
	Cadastro cadastro;

	public void menuAnimal() throws Exception {
		EfetuarCadastro efetuarCadastro = EfetuarCadastro.getInstance();
		do {
			MenuAdministrativo menuAdministrativo = new MenuAdministrativo();
			System.out.println("BEM VINDO AO NOSSO PET SHOP !!!");
			System.out.println();
			System.out.println("Digite 0 - Encerrar o programa");
			System.out.println("Digite 1 - Criar Cadastro");
			System.out.println("Digite 2 - Menu Cachorro");
			System.out.println("Digite 3 - Menu Gato");
			System.out.println("Digite 4 - Menu administrativo");
			escolha = s.nextInt();
			switch (escolha) {
				case 1:
					try {
						cadastro = efetuarCadastro.realizarCadastro();
					} catch (CadastroNaoPermitido cadastroNaoPermitido) {
						System.out.println(cadastroNaoPermitido.getMessage());
					} catch (CadastroNaoExiste cadastroNaoExiste) {
						System.out.println(cadastroNaoExiste.getMessage());
					}
					break;
				case 2:
					getMenu(new Cachorro(nome, peso, idade), new CalculoAtendimentoCachorro(), cadastro);
					break;

				case 3:
					getMenu(new Gato(nome, peso, idade), new CalculoAtendimentoGato(), cadastro);
					break;

				case 4:
					menuAdministrativo.menuAdministrativo();
					break;

				case 0:
					System.out.println("Programa encerrado. Volte sempre.");
					break;

				default:
					System.out.println("Opção inválida. Digite um dos números do menu.");
					break;
			}

		} while (escolha != 0);
	}

	public void getMenu(Animal animal, CalculoAtendimento calculoAtendimento, Cadastro c)
			throws Exception {
		do {
			Custos custos = new Custos();
			System.out.println("VAMOS CUIDAR DO SEU PET !!!");
			System.out.println();
			System.out.println("Digite 0 - Sair.");
			System.out.println("Digite 1 - Marcar o banho.");
			System.out.println("Digite 2 - Marcar a Tosa.");
			escolha = s.nextInt();
			switch (escolha) {
				case 1:
					try {
						custos.calcularBanho(animal, calculoAtendimento, c);
					} catch (TamanhoNaoPermitido tamanhoNaoPermitido) {
						System.out.println(tamanhoNaoPermitido.getMessage());
					} catch (CadastroNaoExiste cadastroNaoExiste) {
						System.out.println(cadastroNaoExiste.getMessage());
					}
					break;
				case 2:
					try {
						custos.calcularTosa(animal, calculoAtendimento, c);
					} catch (TamanhoNaoPermitido tamanhoNaoPermitido) {
						System.out.println(tamanhoNaoPermitido.getMessage());
					} catch (CadastroNaoExiste cadastroNaoExiste) {
						System.out.println(cadastroNaoExiste.getMessage());
					}
					break;
				case 0:
					System.out.println("Programa encerrado.");
					menuAnimal();
					break;
				default:
					System.out.println("Opção inválida. Digite um dos números do menu.");
					break;
			}
		} while (escolha != 0);
	}
}
