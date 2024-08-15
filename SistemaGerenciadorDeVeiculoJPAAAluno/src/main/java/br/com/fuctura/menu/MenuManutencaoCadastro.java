package br.com.fuctura.menu;

import java.util.Scanner;

public class MenuManutencaoCadastro {
	Scanner input = new Scanner(System.in);

	public void exibirManutecaoCadastro(Scanner input) {
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
							Opção 1 - Cadastrar veículo
							Opção 2 - Excluir veículo
							Opção 3 - Alterar dados do veículo
							Opção 4 - Voltar para o menu superior

							""");
			int opcao = input.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Veiculo selecionado");
				break;
			case 2:
				System.out.println("Excluir Veiculo selecionado");
				break;
			case 3:
				System.out.println("Alterar dados do Veiculo selecionado");
				break;
			case 4:
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
						 	Opção 1 - Cadastrar Loja
					 		Opção 2 - Excluir Loja
					 		Opção 3 - Alterar dados da Loja
					 		Opção 4 - Voltar para o menu superior.

						 	""");
			int opcao = input.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Loja selecionado");
				break;
			case 2:
				System.out.println("Excluir Loja selecionado");
				break;
			case 3:
				System.out.println("Alterar dados da Loja selecionado");
				break;
			case 4:
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
					 		Opção 1 - Cadastrar Vendedor
					 		Opção 2 - Excluir Vendedor
					 		Opção 3 - Alterar dados do Vendedor
					 		Opção 4 - Voltar para o menu superior.

						 	""");
			int opcao = input.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Vendedor selecionado");
				//chamar logica de cadastro de vendedor
				break;
			case 2:
				System.out.println("Excluir Vendedor selecionado");
				//chamar logica de excluir de vendedor
				break;
			case 3:
				System.out.println("Alterar dados do Vendedor selecionado");
				//chamar logica de alterar dados de vendedor
				break;
			case 4:
				return;
			default:
				System.out.println("Escolha inválida, tente novamente.");
			}
		}
	}

	private void gerenciarCliente(Scanner input) {
		while (true) {
			System.out.println("""

					Opção 4 - Gerenciar Cliente
					 		Opção 1 - Cadastrar Cliente
					 		Opção 2 - Excluir Cliente
					 		Opção 3 - Alterar dados do Cliente
					 		Opção 4 - Voltar para o menu superior.

						 	""");
			int opcao = input.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Cliente selecionado");
				//chamar logica de cadastro de Cliente
				break;
			case 2:
				System.out.println("Excluir Cliente selecionado");
				//chamar logica de excluir de Cliente
				break;
			case 3:
				System.out.println("Alterar dados do Cliente selecionado");
				//chamar logica de alterar dados de Cliente
				break;
			case 4:
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
					 		Opção 1 - Cadastrar Venda
					 		Opção 2 - Excluir Venda
					 		Opção 3 - Voltar para o menu superior.

						 	""");
			int opcao = input.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar nova venda.");
				break;
			case 2:
				System.out.println("Excluir Venda.");
				break;
			case 3:
				return;
			default:
				System.out.println("Escolha inválida, tente novamente.");
			}
		}
	}
}
			

