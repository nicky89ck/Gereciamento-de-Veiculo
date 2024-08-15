package br.com.fuctura.menu;

import java.util.Scanner;

public class MenuFrenteDeLoja {
	Scanner input = new Scanner(System.in);

	public void exibirFrenteDeLoja(Scanner input) {
		while (true) {

			System.out.println("Opção 1 - Gerenciar Veículo ");
			System.out.println("Opção 2 - Gerenciar Loja ");
			System.out.println("Opção 3 - Gerenciar Vendedor ");
			System.out.println("Opção 4 - Gerenciar Cliente ");
			System.out.println("Opção 5 - Gerenciar Venda ");
			System.out.println("Opção 6 - Voltar para o menu superior. ");

			int opcao = input.nextInt();
			switch (opcao) {
			case 1:
				gerenciarVeiculo(input);
				break;
			case 2:
				gerenciarLoja(input);
				break;
			case 3:
				gerenciarVendedor(input);
				break;
			case 4:
				gerenciarCliente(input);
				break;
			case 5:
				gerenciarVendas(input);
				break;
			case 6:
				return; // volta pra o menu superior
			default:
				System.out.println("Escolha inválida, tente nomvamente.");
			}

		}

	}
	
	
	
	
	
	
	

	private void gerenciarVeiculo(Scanner input) {
		while (true) {
			System.out.println("""
					
					Opção 1 - Gerenciar Veículo
					    Opção 1 - Consultar Veículo por Placa
					    Opção 2 - Voltar para o menu anterior.
					    
					""");

			int opcao = input.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Consultar Veiculo por Placa selecionado");
				// chamar a logica para consultar veículos por placa aqui
				break;
			case 2:
				return;
			default:
				System.out.println("Escolha inválida, tente novamente.");
			}
		}
	}

	private void gerenciarLoja(Scanner input) {
		while (true) {
			System.out.println("""

					Opção 2 - Gerenciar Loja
					 		Opção 1 - Listar todas as Lojas
							Opção 2 - Voltar para o menu superior.

					 		""");

			int opcao = input.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Consultar Lojas");
				// chamar a logica para consultar veículos por placa aqui
				break;
			case 2:
				return;
			default:
				System.out.println("Escolha inválida, tente novamente.");
			}
		}
	}

	private void gerenciarCliente(Scanner input) {
		while (true) {
			System.out.println("""

					Opção 1 - Gerenciar Cliente
					    Opção 1 - Consultar Cliente por CPF
					    Opção 2 - Voltar para o menu anterior.

					""");

			int opcao = input.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Consultar Cliente");
				// chamar a logica para consultar veículos por placa aqui
				break;
			case 2:
				return;
			default:
				System.out.println("Escolha inválida, tente novamente.");
			}
		}
	}

	private void gerenciarVendedor(Scanner input) {
		while (true) {
			System.out.println("""

					Opção 3 - Gerenciar Vendedor
							Opção 1 - Consultar Vendedor por Nome
							Opção 2 - Voltar para o menu superior.

					 		""");

			int opcao = input.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Consultar Vendedor");
				// chamar a logica para consultar veículos por placa aqui
				break;
			case 2:
				return;
			default:
				System.out.println("Escolha inválida, tente novamente.");
			}
		}
	}

	private void gerenciarVendas(Scanner input) {
		while (true) {
			System.out.println("""

					Opção 5 - Gerenciar Venda
							Opção 1 - Consultar Venda.
							Opção 2 - Voltar para o menu superior.

					 		""");

			int opcao = input.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Consultar Venda");
				// chamar a logica para consultar veículos por placa aqui
				break;
			case 2:
				return;
			default:
				System.out.println("Escolha inválida, tente novamente.");
			}
		}
	}

}
