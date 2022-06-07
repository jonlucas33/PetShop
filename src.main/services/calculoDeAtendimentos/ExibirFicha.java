package services.calculoDeAtendimentos;

import java.util.Scanner;
import entidades.Animal;
import interfaces.Ficha;

public class ExibirFicha {
	
	static Scanner scan = new Scanner(System.in);
	
	int idade;
	double peso;
	String nome;

	public void exibicaoDeFicha(Animal animal) {
		System.out.println("Qual o nome do seu pet?");
		nome = scan.next();
		System.out.println("Qual o peso(kg) do seu pet?");
		peso = scan.nextDouble();
		System.out.println("Qual a idade do seu pet?");
		idade = scan.nextInt();
		animal.setNome(nome);
		animal.setPeso(peso);
		animal.setIdade(idade);
		
		Ficha.exibicaoDeFicha.test(animal);
	}
	
}
