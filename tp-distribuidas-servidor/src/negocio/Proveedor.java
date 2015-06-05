package negocio;
import java.util.ArrayList;
import java.util.List;

import bean.ProveedorBean;
import dao.ProveedorDao;
import dto.ProveedorDto;

public class Proveedor{
	
	private String tipoDocumento;
	private String numeroDocumento;
	private String razonSocial;
	private Direccion domicilioComercial;
	private List<Servicio> serviciosProvistos;
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public Direccion getDomicilioComercial() {
		return domicilioComercial;
	}
	public void setDomicilioComercial(Direccion domicilioComercial) {
		this.domicilioComercial = domicilioComercial;
	}
	public List<Servicio> getServiciosProvistos() {
		return serviciosProvistos;
	}
	public void setServiciosProvistos(List<Servicio> serviciosProvistos) {
		this.serviciosProvistos = serviciosProvistos;
	}

	public List<ProveedorDto> obtenerProveedores() {
		// TODO Auto-generated method stub
		return null;
	}
	//TODO TERMINARS
	public static List<ProveedorDto> listarBeanADto(List<ProveedorBean> lista) {
		List <ProveedorDto> listaProveedor = new ArrayList <ProveedorDto> ();
		//ProveedorDto proveedor = new ProveedorDto(razonSocial, numeroDocumento, razonSocial, null, null);
		return null;
	}
	public static ProveedorDto obtenerProveedor(String cuit) {
		ProveedorDao.obtenerProveedor(cuit);
		return null;
	}
}
