package dao;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;

import dto.ProveedorDto;
import bean.ClienteBean;
import bean.DireccionBean;
import bean.ProveedorBean;
import bean.ServicioBean;

public class ProveedorDao extends HibernateDao{
	private String tipoDocumento;
	private int numeroDocumento;
	private String razonSocial;
	private DireccionDao domicilioComercial;
	private List<ServicioDao> serviciosProvistos;
	
	public static ProveedorDao instancia;
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public int getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public DireccionDao getDomicilioComercial() {
		return domicilioComercial;
	}
	public void setDomicilioComercial(DireccionDao domicilioComercial) {
		this.domicilioComercial = domicilioComercial;
	}
	public List<ServicioDao> getServiciosProvistos() {
		return serviciosProvistos;
	}
	public void setServiciosProvistos(List<ServicioDao> serviciosProvistos) {
		this.serviciosProvistos = serviciosProvistos;
	}

	public static List<ProveedorBean> obtenerProveedores() {
		HibernateDao hb = HibernateDao.getInstancia();
		Session session = hb.getSession();
		Query q = session.createQuery("from ProveedorBean");
		return q.list();
	}

	public static ProveedorBean obtenerProveedor(String cuit) {
		HibernateDao hb = HibernateDao.getInstancia();
		Session session = hb.getSession();
		return (ProveedorBean) session.get(ProveedorBean.class,  cuit);
	}
}
