package appFruta.service;

import java.util.List;

import appFruta.model.Fruta;
import appFruta.view.Atendente;

import java.util.ArrayList;

public class Estoque {

	List<Fruta> listaFrutas;

	public Estoque() {
		listaFrutas = new ArrayList<>();
	}

	public void gerenciarEstoque(int opcao, Atendente atendente) {
		switch (opcao) {
		case 1 -> {

			String nome = atendente.frutaNome();
			double preco = atendente.frutaPreco();
			int quantidade = atendente.frutaQuantidade();
			String tipo = atendente.frutaTipo();

			Fruta fruta = new Fruta(nome, preco, quantidade, tipo);
			listaFrutas.add(fruta);

		}

		case 2 -> {
			for (Fruta fruta : listaFrutas) {
				atendente.visualizar(fruta);
			}
		}

		case 3 -> {
			String nome = atendente.removerFruta();
			boolean removida = false;

			for (int i = 0; i < listaFrutas.size(); i++) {
				if (listaFrutas.get(i).getNome().equalsIgnoreCase(nome)) {
					listaFrutas.remove(i);
					removida = true;
					break;
				}
			}

			if (removida) {
				atendente.visualizarFrutaRemovida(nome);
			} else {
				atendente.mensagemErro();
			}
		}

		}
	}
}
