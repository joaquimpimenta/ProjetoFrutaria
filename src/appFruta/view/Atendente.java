package appFruta.view;

import java.util.Scanner;

import appFruta.model.Fruta;

public class Atendente {
	
	Scanner scanner;
	
	public Atendente() {
		scanner = new Scanner (System.in);
	}
	
	
	
	public int menuPrincipal() {
		System.out.println("1 - Cadastrar fruta: ");
		System.out.println("2 - Listar fruta: ");
		System.out.println("3 - Remover fruta: ");
		System.out.println("0 - Sair");
		
		int opcao = scanner.nextInt();
		scanner.nextLine();
		return opcao;
	}
	
	public String frutaNome() {
		System.out.println("Digite o nome da fruta: ");
		return scanner.nextLine();
	}
	
	public double frutaPreco() {
		System.out.println("Digite o preço da fruta: ");
		return scanner.nextDouble();
	}
	
	public int frutaQuantidade() {
		System.out.println("Digite a quantidade que vai adicionar na prateleira: ");
		return scanner.nextInt();
	}
	
	public String frutaTipo() {
		scanner.nextLine();
		System.out.println("Digite o tipo da fruta: ");
		return scanner.nextLine();
	}
	
	public void visualizar(Fruta fruta) {
		System.out.println("--------------");
		System.out.println("Nome: " + fruta.getNome());
		System.out.println("Preço: " + fruta.getPreco());
		System.out.println("Quantidade: " + fruta.getQuantidade());
		System.out.println("Tipo: " + fruta.getTipo());
	}
	
	public String removerFruta() {
		System.out.println("Digite o nome da fruta que deseja remover: ");
		return scanner.nextLine();
	}
	
	public void visualizarFrutaRemovida(String nome) {
		System.out.println("A fruta " + nome + " foi removida!");
	}
	
	public void mensagemErro() {
		System.out.println("Fruta não encontrada!");
	}
	
	public void finalizarApp() {
		System.out.println("Encerrado app...");
	}
	
}
