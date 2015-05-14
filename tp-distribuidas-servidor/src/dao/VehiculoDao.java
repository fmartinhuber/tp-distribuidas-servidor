package dao;


import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;

import bean.VehiculoBean;

public class VehiculoDao extends HibernateDao {
	
	public static List<VehiculoBean> obtenerVehiculos() {
		HibernateDao hb = HibernateDao.getInstancia();
		Session session = hb.getSession();
		Query q = session.createQuery("from VehiculoBean");
		return q.list();
	}

	
}
