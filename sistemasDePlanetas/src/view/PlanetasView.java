package view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import modeo.Planetas;

public class PlanetasView {
	private Scanner scanner;

	public PlanetasView() {
		scanner = new Scanner(System.in);
	}

	public int menu() {
		System.out.println("--------menu--------");
		System.out.println("1-Adicionar planeta");
		System.out.println("2-Remover planeta");
		System.out.println("3-Listar planetas");
		System.out.println("4-Limpar lista");
		System.out.println("0-Sair");
		try {
			return scanner.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Caracter invalido!!" + " " + "Erro:" + e);
			scanner.nextLine();
		}
		return menu();

	}

	public void saida() {
		System.err.println("Saindo...");
	}

	public String nome() {
		System.out.println("Digite o nome do planeta: ");
		return scanner.next();
	}

	public void exibirLista(ArrayList<Planetas> planetas) {
		System.out.println("-------lista de planetas-------");
		System.out.println();
		for (Planetas planeta : planetas) {
			System.out.println("Planeta " + planeta.getId() + ":" + planeta.getNome());
			System.out.println("-------------------------------");
		}
	}

	public void recadoRemove() {
		System.out.println("Planeta removido!");
	}
	
	public void opcaoErrada() {
		System.err.println("opcao nao existente!!");
	}

}
