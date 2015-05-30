package bean;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Proveedor")
public class ProveedorBean{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int idProveedor;
	private String tipoDocumento;
	private int numeroDocumento;
	private String razonSocial;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idDireccion")
		private DireccionBean domicilioComercial;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idServicio")
		private List<ServicioBean> serviciosProvistos;
	
	
	
	public ProveedorBean(int idProveedor, String tipoDocumento,
			int numeroDocumento, String razonSocial,
			DireccionBean domicilioComercial,
			List<ServicioBean> serviciosProvistos) {
		super();
		this.idProveedor = idProveedor;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.razonSocial = razonSocial;
		this.domicilioComercial = domicilioComercial;
		this.serviciosProvistos = serviciosProvistos;
	}
	
	public ProveedorBean() {
		
	}

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

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

	public DireccionBean getDomicilioComercial() {
		return domicilioComercial;
	}

	public void setDomicilioComercial(DireccionBean domicilioComercial) {
		this.domicilioComercial = domicilioComercial;
	}

	public List<ServicioBean> getServiciosProvistos() {
		return serviciosProvistos;
	}

	public void setServiciosProvistos(List<ServicioBean> serviciosProvistos) {
		this.serviciosProvistos = serviciosProvistos;
	}
	
	
}
