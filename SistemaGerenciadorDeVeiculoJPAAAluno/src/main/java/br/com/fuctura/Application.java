package br.com.fuctura;
import java.util.Scanner;

import br.com.fuctura.menu.MenuPrincipal;


public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("FUCTURA-PU");
//		
//		EntityManager manager = factory.createEntityManager();
		
		MenuPrincipal menu = new MenuPrincipal();
		
		System.out.println("Bem-Vindo à Consessionária Fuctura");
		
		menu.exibirMenuPrincipal(input);
		
		
		input.close();

	}

}
