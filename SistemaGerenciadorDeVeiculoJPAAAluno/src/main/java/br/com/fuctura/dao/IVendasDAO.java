package br.com.fuctura.dao;

import br.com.fuctura.entity.Vendas;

public interface IVendasDAO {

	void persist(Vendas vendas);

	void remove(Integer codigo);

}
