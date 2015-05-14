package dao;

import org.hibernate.Session;

import bean.ClienteBean;

public class ClienteDao  {
	public static ClienteDao instancia;
	
	public static ClienteDao getInstancia(){
		if(instancia==null)
			instancia = new ClienteDao();
		return instancia;
	}
	
	public void guardar(ClienteBean clienteBean){
		HibernateDao hb=HibernateDao.getInstancia();
		
		hb.persist(clienteBean);
		
	}
	
	public ClienteBean obtener(String dni){
		HibernateDao hb=HibernateDao.getInstancia();
		Session session = hb.getSession();
		return (ClienteBean) session.get(ClienteBean.class,  dni);
	}	
	
}