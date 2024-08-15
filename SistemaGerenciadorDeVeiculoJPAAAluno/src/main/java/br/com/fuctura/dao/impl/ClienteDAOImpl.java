package br.com.fuctura.dao.impl;

import java.util.List;
import java.util.Scanner;

import br.com.fuctura.dao.IClienteDAO;
import br.com.fuctura.entity.Cliente;
import br.com.fuctura.entity.Endereco;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.TypedQuery;

public class ClienteDAOImpl implements IClienteDAO {
	Scanner input = new Scanner(System.in);

	private final EntityManager em;

	public ClienteDAOImpl(EntityManager em) {
		this.em = em;

	}

	@Override
	public void persist() {
		
		System.out.println("Digite seu nome:");
		String nome = input.nextLine();
		
		System.out.println("Digite seu cpf:");
		String cpf = input.nextLine();
		
		System.out.println("Digite seu email:");
		String email = input.nextLine();
		
		
		System.out.print("RUA: ");
		String rua = input.nextLine();
		
		System.out.print("NUMERO: ");
		int numeroCasa = input.nextInt();
		
		System.out.print("BAIRRO E CIDADE: ");
		String cidade = input.nextLine();
		
		System.out.print("ESTADO: ");
		String estado = input.next();
		
		System.out.print("COMPLEMENTO: ");
		String complemento = input.nextLine();
		
		System.out.print("CEP ");
		String cep = input.next();
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setEmail(email);
		
		
		Endereco endereco = new Endereco();
		endereco.setRua(rua);
		endereco.setNumeroCasa(numeroCasa);
		endereco.setCidade(cidade);
		endereco.setEstado(estado);
		endereco.setComplemento(complemento);
		endereco.setCep(cep);
		
		cliente.setEndereco(endereco);
				
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
	}
	@Override
	public void remove(String cpf) {
		em.getTransaction().begin();
		Cliente cliente = em.find(Cliente.class, cpf);
		if (cliente != null) {
			em.remove(cliente);
		} else {
			throw new EntityNotFoundException("Cliente não encontrado");
		}
		em.getTransaction().commit();
	}

	@Override
	public void update(Cliente cliente) {
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
	}
	
	
	@Override
	public List<Cliente>findAll(){
		var comandoSQL = "SELECT c FROM Cliente c";
		TypedQuery<Cliente> query = em.createQuery(comandoSQL, Cliente.class);
		
		List<Cliente>resultadoConsulta = query.getResultList();
		return resultadoConsulta;
		
	}
	@Override
	public Cliente findByCpf (String cpf) {
		var comandoSQL = "SELECT c From Cliente c WHERE cpf = :cpf";
		TypedQuery<Cliente> query = em.createQuery(comandoSQL, Cliente.class);
		query.setParameter("cpf", cpf);
		return query.getSingleResult();
		
	}

	
	
	
}
