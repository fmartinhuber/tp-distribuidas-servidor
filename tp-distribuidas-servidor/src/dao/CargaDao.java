package dao;

import bean.CargaBean;

public class CargaDao  {
	public static CargaDao instancia;
	
	public static CargaDao getInstancia(){
		if(instancia==null)
			instancia = new CargaDao();
		return instancia;
	}
	
	public void guardar(CargaBean cargaBean){
		HibernateDao hb=HibernateDao.getInstancia();
		hb.persist(cargaBean);
	}
	
}