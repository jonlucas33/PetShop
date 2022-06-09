# Projeto final P3

<h1>  🐶 🐱 Bem vindo ao nosso PetShop </h1>
 
## 🅾️ Identificação 

Professor: Leuson Mario.

Alunos: José Felipe, Bruno Vicente e João Lucas.

## <h1> O que é o nosso projeto </h1> Esse sistema tem o proposito de dar suporte ao cliente que deseja agendar uma consulta ou outros serviços de qualidade para seu animal de estimação fora do estabelecimento petshop. Dessa forma, como e qualquer sistema automatizado, auxiliando para promover praticidade e conveniência a todos os clientes. Além de que, torna possivel um melhor gerenciamento de todos que solicitarem algum serviço disponíveis delegado aos funcionários responsáveis.


## 🅾️ Detalhes do projeto PetShop

- Para que o solicitador do serviço garanta o atendimento, o sistema PetShop é provido de um sistema de cadastro necessário para o gerenciamento de todos os clientes através de um verificador de cadastro que permite analisar se as informações inseridas são corretas de acordo com a exigência do sistema.


~~~java
public Cadastro[] cadastros;
	private int contadorDeCadastros;

	public VerificacaoDeCadastros() {
		cadastros = new Cadastro [10];
		contadorDeCadastros = 0;
	}
  
  
~~~

- Após a realização do cadastro, o cliente poderar selecionar qual tipo de serviço gostaria para seu animal. Ex: Marcar banho ou tosa? E claro, só é possivel chegar nesta opção se o solicitador do serviço obter êxito na conclusão do cadastro. Do contrário, a ação não poderá ser concluída e uma mensagem de que existe algum erro no cadastro será exibido ou por não existir o cadastro ou por alguma informação inserida incorretamente. 


~~~java
public void getMenu(Animal animal,CalculoAtendimento calculoAtendimento,Cadastro c) throws CadastroNaoPermitido, TamanhoNaoPermitido, CadastroNaoExiste {
		do {
			Custos custos = new Custos(); 
			System.out.println("VAMOS CUIDAR DO SEU PET !!!");
			System.out.println();
			System.out.println("Digite 0 - Sair.");
			System.out.println("Digite 1 - Marcar o banho.");
			System.out.println("Digite 2 - Marcar a Tosa.");
			escolha=scan.nextInt();
~


- Escolhida a opção, uma ficha será liberada para ser preenchida, solicitando que o cliente forneca os dados(Atributos) do animal, como seu peso e a idade. Para que a consulta do banco de dados seja mais rápida na próxima ida ao estabelecimento, facilitando também o trabalho dos funcionários.  

~~~java
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
		
		Ficha.exibicaoDeFicha.exibir(animal);
	}
~

- E depois de todo processo de entrada de dados, será retornado a ficha do pet com o valor do atendimento solicitado, de acordo com os dados que foram repassados.
