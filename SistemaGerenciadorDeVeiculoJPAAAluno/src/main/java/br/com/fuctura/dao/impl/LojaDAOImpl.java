package br.com.fuctura.dao.impl;

import java.util.List;

import br.com.fuctura.dao.ILojaDAO;
import br.com.fuctura.entity.Cliente;
import br.com.fuctura.entity.Loja;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.TypedQuery;

public class LojaDAOImpl implements ILojaDAO {

	private final EntityManager em;
	
	
	public LojaDAOImpl(EntityManager em) {
		this.em = em;
	}


	@Override
	public void persist(Loja loja) {
		em.getTransaction().begin();
		em.persist(loja);
		em.getTransaction().commit();
		//metodo para cadastrar a loja
	}
	
	@Override
	public void delete (Integer codigo) {
		em.getTransaction().begin();
		Loja loja = em.find(Loja.class, codigo);
		if(loja!= null) {
			em.remove(loja);
		}else {
			throw new EntityNotFoundException("Loja não encontrada com codigo: "+ codigo);
		}
		em.getTransaction().commit();
	}
	
	@Override
	 public void update(Loja loja) {
		 em.getTransaction().begin();
		 em.merge(loja);
		 em.getTransaction().commit();
	 }
	
	@Override
	public List<Loja>findAll(){
		var comandoSQL = "SELECT l FROM Loja l";
		TypedQuery<Loja> query = em.createQuery(comandoSQL, Loja.class);
		List<Loja> resultadoConsulta = query.getResultList();
		return resultadoConsulta;
	}
}
