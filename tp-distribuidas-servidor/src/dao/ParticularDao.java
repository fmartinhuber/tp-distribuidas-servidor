package dao;

import org.hibernate.Session;

import bean.ParticularBean;

public class ParticularDao  {
	public static ParticularDao instancia;
	
	public static ParticularDao getInstancia(){
		if(instancia==null)
			instancia = new ParticularDao();
		return instancia;
	}
	
	public void guardar(ParticularBean particularBean){
		HibernateDao hb = HibernateDao.getInstancia();
		hb.persist(particularBean);
	}

}