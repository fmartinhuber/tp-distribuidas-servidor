package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import bean.SucursalBean;


public class SucursalDao extends HibernateDao{

	

	public static List<SucursalBean> obtenerSucursales() {
		HibernateDao hb = HibernateDao.getInstancia();
		Session session = hb.getSession();
		Query q = session.createQuery("from SucursalBean");
		return q.list();
	}

}
