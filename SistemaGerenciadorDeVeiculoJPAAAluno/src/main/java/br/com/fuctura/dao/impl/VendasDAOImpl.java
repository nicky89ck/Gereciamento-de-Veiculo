package br.com.fuctura.dao.impl;

import br.com.fuctura.dao.IVendasDAO;
import br.com.fuctura.entity.Vendas;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;

public class VendasDAOImpl implements IVendasDAO {
	
	private final EntityManager em;
	
	public VendasDAOImpl(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public void persist (Vendas vendas) {
		em.getTransaction().begin();
		em.persist(vendas);
		em.getTransaction().commit();
		
	}
	
	@Override
	public void remove(Integer codigo) {
		Vendas vendas = em.find(Vendas.class, codigo);
		if(vendas!= null) {
			em.remove(vendas);
		}else {
			throw new EntityNotFoundException("Venda não encontrada");
		}
	}

}
