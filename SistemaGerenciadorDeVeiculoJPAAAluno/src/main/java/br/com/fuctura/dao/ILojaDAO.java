package br.com.fuctura.dao;

import java.util.List;

import br.com.fuctura.entity.Loja;

public interface ILojaDAO {
	
	public void persist(Loja loja);

	void delete(Integer codigo);

	void update(Loja loja);

	List<Loja> findAll();

	

}
