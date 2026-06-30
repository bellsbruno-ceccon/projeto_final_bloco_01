package application;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		do {

			System.out.println("*****************************************************");
			System.out.println("              BAZAR MARIETA DUTRA");
			System.out.println("*****************************************************");
			System.out.println("1 - Listar todos os produtos");
			System.out.println("2 - Listar produto por ID");
			System.out.println("3 - Cadastrar Produto:");
			System.out.println("4 - Atualizar Produto:");
			System.out.println("5 - Deletar Produto:");
			System.out.println("6 - Sobre");
			System.out.println("0 - Sair");
			System.out.println("*****************************************************");
			System.out.print("Digite uma opção: ");

			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("\nListar todos os produtos.\n");
				keyPress();
				break;

			case 2:
				System.out.println("\nListar produto por ID.\n");
				keyPress();
				break;

			case 3:
				System.out.println("\nCadastrar produto.\n");
				keyPress();
				break;

			case 4:
				System.out.println("\nAtualizar produto.\n");
				keyPress();
				break;

			case 5:
				System.out.println("\nDeletar produto.\n");
				keyPress();
				break;

			case 6:
				sobre();
				keyPress();
				break;

			case 0:
				System.out.println("\nObrigado por utilizar o sistema do Bazar Marieta Dutra!");
				System.out.println("Até a próxima!");
				break;

			default:
				System.out.println("\nOpção inválida!");
				keyPress();
				break;

			}

		} while (opcao != 0);

		leia.close();

	}

	public static void sobre() {

		System.out.println("\n*****************************************************");
		System.out.println("              BAZAR MARIETA DUTRA");
		System.out.println("*****************************************************");
		System.out.println("Sistema de Gerenciamento de Produtos.");
		System.out.println();
		System.out.println("Este projeto foi desenvolvido em Java");
		System.out.println("para auxiliar o controle de produtos");
		System.out.println("de um bazar comunitário.");
		System.out.println();
		System.out.println("Categorias cadastradas:");
		System.out.println("- Livros");
		System.out.println("- Artesanato");
		System.out.println("- Itens de Bazar");
		System.out.println();
		System.out.println("Desenvolvido como Projeto Final");
		System.out.println("do Bloco 01 - Java.");
		System.out.println("*****************************************************");

	}

	public static void keyPress() {

		try {

			System.out.println("\nPressione ENTER para continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Erro ao aguardar a tecla ENTER.");

		}

	}

}