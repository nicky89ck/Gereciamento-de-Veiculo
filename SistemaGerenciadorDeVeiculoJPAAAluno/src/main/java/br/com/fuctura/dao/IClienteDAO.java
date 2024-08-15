package br.com.fuctura.dao;

import java.util.List;

import br.com.fuctura.entity.Cliente;

public interface IClienteDAO {

	
	void update(Cliente cliente);
	
	List<Cliente> findAll();

	Cliente findByCpf(String cpf);

	void persist();

	void remove(String cpf);



	

}
