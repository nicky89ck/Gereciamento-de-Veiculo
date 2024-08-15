package br.com.fuctura.dao.impl;

import java.util.List;

import br.com.fuctura.dao.IVeiculoDAO;
import br.com.fuctura.entity.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.TypedQuery;

public class VeiculoDAOImpl implements IVeiculoDAO{
	
	private final EntityManager em;
	
	public VeiculoDAOImpl (EntityManager em) {
		this.em = em;
		
	}
	@Override
	public void persist(Veiculo veiculo) {
		em.getTransaction().begin();
		em.persist(veiculo);
		em.getTransaction().commit();
	}
	
	@Override
	public void remove(Integer codigo) {
		em.getTransaction().begin();
		Veiculo veiculo = em.find(Veiculo.class, codigo);
		if(veiculo != null) {
			em.remove(veiculo);
		}else {
			throw new EntityNotFoundException("Veiculo não encontrado com codigo:" + codigo);
		}
		em.getTransaction().commit();
	}
	@Override
	public void update(Veiculo veiculo) {
		em.getTransaction().begin();
		em.merge(veiculo);
		em.getTransaction().commit();
	}
	
	@Override
	public List<Veiculo>findALL(){
		var comandoSQL = "SELECT v FROM Veiculo v";
		TypedQuery<Veiculo> query = em.createQuery(comandoSQL, Veiculo.class);
		
		List<Veiculo>resultadoConsulta = query.getResultList();
		return resultadoConsulta;
	}
	
	@Override
	public Veiculo findByPlaca(String placa) {
		var comandoSQL = "SELECT v FROM Veiculo v WHERE placa = :placa";
		TypedQuery<Veiculo> query = em.createQuery(comandoSQL, Veiculo.class);
		query.setParameter("placa", placa);
		return query.getSingleResult();
	}
	
	
}
