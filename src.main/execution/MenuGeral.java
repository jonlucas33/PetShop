package execution;

import java.util.Scanner;

import calculoDeAtendimentos.CalculoAtendimentoCachorro;
import calculoDeAtendimentos.CalculoAtendimentoGato;
import calculoDeAtendimentos.Custos;
import entidades.Animal;
import entidades.Cachorro;
import entidades.Gato;
import exceptions.CadastroNaoExiste;
import exceptions.CadastroNaoPermitido;
import exceptions.TamanhoNaoPermitido;
import interfaces.CalculoAtendimento;
import sistemaDeCadastros.Cadastro;
import sistemaDeCadastros.EfetuarCadastro;

public class MenuGeral  {

	static Scanner s = new Scanner(System.in);
	//ExibirFicha exibirFicha = new ExibirFicha();
	int escolha, idade;
	double peso;
	String nome;
	Cadastro cadastro;

	public void menuAnimal() throws Exception {
		int escolha;
		EfetuarCadastro efetuarCadastro = EfetuarCadastro.getInstance();
		do {
			System.out.println("BEM VINDO AO NOSSO PET SHOP !!!");
			System.out.println();
			System.out.println("Digite 0 - Encerrar o programa");
			System.out.println("Digite 1 - Criar Cadastro");
			System.out.println("Digite 2 - Menu Cachorro");
			System.out.println("Digite 3 - Menu Gato");
						//Digite 4 - menu adminstrativo
			//Mostrar balanço diário, total de dinheiro, quantos cachorros e gatos foram atendidos, quantidade de banhos e quantidade de tosas.
			escolha=s.nextInt();
			switch(escolha) {
			case 1:
				try{
					cadastro=efetuarCadastro.realizarCadastro();
				} catch(CadastroNaoPermitido cadastroNaoPermitido) {
					System.out.println(cadastroNaoPermitido.getMessage());
				} catch(CadastroNaoExiste cadastroNaoExiste) {
					System.out.println(cadastroNaoExiste.getMessage());
				}
				break;
			case 2:
				getMenu(new Cachorro(nome, peso, idade), new CalculoAtendimentoCachorro(), cadastro);
				break;

			case 3:
				getMenu(new Gato(nome,peso,idade), new CalculoAtendimentoGato(), cadastro);
				break;

			case 0:
				System.out.println("Programa encerrado. Volte sempre.");
				break;

			default:
				System.out.println("Op��o inv�lida. Digite um dos n�meros do menu.");
				break;
			}

		}while(escolha!=0);
	}

	public void getMenu(Animal animal,CalculoAtendimento calculoAtendimento,Cadastro c) throws TamanhoNaoPermitido, CadastroNaoExiste {
		do {
			Custos custos = new Custos(); 
			System.out.println("VAMOS CUIDAR DO SEU PET !!!");
			System.out.println();
			System.out.println("Digite 0 - Sair.");
			System.out.println("Digite 1 - Marcar o banho.");
			System.out.println("Digite 2 - Marcar a Tosa.");
			escolha=s.nextInt();
			switch(escolha) {
			case 1: 
				try{
					custos.calcularBanho(animal, calculoAtendimento,c );
				}catch(TamanhoNaoPermitido tamanhoNaoPermitido) {
					System.out.println(tamanhoNaoPermitido.getMessage());
				} catch(CadastroNaoExiste cadastroNaoExiste) {
					System.out.println(cadastroNaoExiste.getMessage());
				}
				break;
			case 2: 
				try{
					custos.calcularTosa(animal, calculoAtendimento,c);
				}catch(TamanhoNaoPermitido tamanhoNaoPermitido) {
					System.out.println(tamanhoNaoPermitido.getMessage());
				} catch(CadastroNaoExiste cadastroNaoExiste) {
					System.out.println(cadastroNaoExiste.getMessage());
				}
				break;
			case 0:
				System.out.println("Programa encerrado.");
				break;
			default:
				System.out.println("Op��o inv�lida. Digite um dos n�meros do menu.");
				break;
			}
		}while(escolha!=0);
	}
}
