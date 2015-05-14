package dao;
import hbt.HibernateUtil;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import bean.EmpleadoBean;

public class EmpleadoDAO {

	private static EmpleadoDAO instancia; 
	private SessionFactory sf; 
	private Session session; 
	
	
	public static EmpleadoDAO getInstancia()
	{
		if(instancia==null)
			instancia=new EmpleadoDAO(); 
		return instancia;
	}
	
	
	public EmpleadoDAO()
	{
		sf = HibernateUtil.getSessionFactory();
	}
	
	private Session getSession(){
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

	//TODO: Evaluar e implementar metodos que faltan
}
