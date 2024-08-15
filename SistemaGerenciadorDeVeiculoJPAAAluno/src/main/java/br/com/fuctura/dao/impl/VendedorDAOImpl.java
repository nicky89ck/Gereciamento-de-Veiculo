package br.com.fuctura.dao.impl;

import br.com.fuctura.dao.IVendedorDAO;
import br.com.fuctura.entity.Vendedor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.TypedQuery;

public class VendedorDAOImpl implements IVendedorDAO {
	
	private final EntityManager em ;
	
	public VendedorDAOImpl(EntityManager em) {
		this.em = em;	
	}
	
	@Override
	public void persist(Vendedor vendedor) {
		em.getTransaction().begin();
		em.persist(vendedor);
		em.getTransaction().commit();
	}
	
	@Override
	public void remove(Integer codigo) {
		em.getTransaction().begin();
		Vendedor vendedor = em.find(Vendedor.class, codigo);
		if(vendedor != null) {
			em.remove(vendedor);
		}else {
			throw new EntityNotFoundException("Vendedor não encontrado");
		}
		em.getTransaction().commit();
	}
	
	@Override
	public void update(Vendedor vendedor) {
		em.getTransaction().begin();
		em.merge(vendedor);
		em.getTransaction().commit();
	}
	
	@Override
	public Vendedor findByNome(String nome) {
		var comandoSQL = "SELECT ven FROM Vendedor ven WHERE nome = :nome";
		TypedQuery<Vendedor> query = em.createQuery(comandoSQL, Vendedor.class);
		query.setParameter("nome", nome);
		
		return query.getSingleResult();
	}
}

