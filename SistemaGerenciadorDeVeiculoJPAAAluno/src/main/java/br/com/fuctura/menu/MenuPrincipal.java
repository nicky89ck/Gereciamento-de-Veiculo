package br.com.fuctura.menu;

import java.util.Scanner;

public class MenuPrincipal {
	Scanner input = new Scanner(System.in);

	private final MenuFrenteDeLoja frenteLoja = new MenuFrenteDeLoja();
	private final MenuManutencaoCadastro manutencaoCadastro = new MenuManutencaoCadastro();

	public void exibirMenuPrincipal(Scanner input) {

		int opcao;

		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("Opção 1 - Frente de Loja");
			System.out.println("Opção 2 - Manutenção no Cadastro");
			System.out.println("Opção 3 - Sair");

			opcao = input.nextInt();

			switch (opcao) {
			case 1:
				// exibir o menu frente de loja
				frenteLoja.exibirFrenteDeLoja(input);
				break;
			case 2:
				// exibir o menu manutenção no cadastro
				manutencaoCadastro.exibirManutecaoCadastro(input);
				break;
			case 3:
				System.out.println("Encerrando Sistema.");
				break;
			default:
				System.out.println("Opção Inválida, tente novamente.");
			}
			
		}while(opcao != 3);
		opcao = input.nextInt();

	}
}
