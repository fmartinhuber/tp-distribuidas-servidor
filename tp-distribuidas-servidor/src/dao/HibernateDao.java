package dao;

import hbt.HibernateUtil;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.ClienteBean;


public class HibernateDao{
	protected static HibernateDao instancia = null;
	protected static SessionFactory sf = null;
	protected static Session session = null;

	
	public static HibernateDao getInstancia(){
		if(instancia == null){
			instancia = new HibernateDao();
		} 
		return instancia;
	}
	
	protected HibernateDao()  {
		sf = HibernateUtil.getSessionFactory();
	}

	protected Session getSession(){
		if(session == null || !session.isOpen()){
			session = sf.openSession();
		}
		return session;
	}
	
	public void closeSession(){
		if (session.isOpen()) {
			session.close();
		}
	}
	
	public void persist(Object obj) {
		Session session = getSession();
		session.beginTransaction();
		session.persist(obj);
		session.getTransaction().commit();
	}
	
	@SuppressWarnings("rawtypes")
	public void persistList(List lista){
		Session session = getSession();
		session.beginTransaction();
		for(Object e : lista){
			session.saveOrUpdate(e);
		}
		session.flush();
		session.getTransaction().commit();
	}
	
	
}