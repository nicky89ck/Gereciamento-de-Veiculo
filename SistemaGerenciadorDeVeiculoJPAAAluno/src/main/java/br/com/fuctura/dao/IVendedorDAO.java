package br.com.fuctura.dao;

import br.com.fuctura.entity.Vendedor;

public interface IVendedorDAO {

	void persist(Vendedor vendedor);

	void remove(Integer codigo);

	void update(Vendedor vendedor);

	Vendedor findByNome(String nome);

}
