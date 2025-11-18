package Main;

import appFruta.service.Estoque;
import appFruta.view.Atendente;

public class Appfruta {

	public static void main(String[] args) {

		Atendente atendente = new Atendente();
		Estoque estoque = new Estoque();
		int opcaoMenuEscolhida = 1;

		do {
			opcaoMenuEscolhida = atendente.menuPrincipal();
			estoque.gerenciarEstoque(opcaoMenuEscolhida, atendente);
		} while (opcaoMenuEscolhida != 0);

		atendente.finalizarApp();

	}

}
