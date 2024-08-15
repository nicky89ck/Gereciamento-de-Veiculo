package br.com.fuctura.dao;

import java.util.List;

import br.com.fuctura.entity.Veiculo;

public interface IVeiculoDAO {

	void persist(Veiculo veiculo);

	void remove(Integer codigo);

	void update(Veiculo veiculo);

	List<Veiculo> findALL();

	Veiculo findByPlaca(String placa);	

}
