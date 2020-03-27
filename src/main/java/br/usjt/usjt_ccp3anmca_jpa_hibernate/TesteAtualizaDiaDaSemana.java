package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteAtualizaDiaDaSemana {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		DiaDaSemana u = manager.find(DiaDaSemana.class, 1L);
		u.setNome(u.getNome() + " - feira");
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}