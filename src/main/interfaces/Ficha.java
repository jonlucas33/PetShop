package interfaces;

import entidades.Animal;

@FunctionalInterface
public interface Ficha {
	 Ficha exibicaoDeFicha=(Animal animal)-> {
		 System.out.println("------FICHA DO SEU PET------");
		 System.out.println("NOME: "+animal.getNome());
		 System.out.println("IDADE: "+animal.getIdade()+" anos");
		 System.out.println("PESO: "+animal.getPeso()+" kg");
	};
	void exibir(Animal animal);
}
