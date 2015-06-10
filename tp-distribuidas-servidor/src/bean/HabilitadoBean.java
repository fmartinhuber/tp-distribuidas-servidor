package bean;

import javax.persistence.*;

@Entity
@Table(name="Habilitado")
public class HabilitadoBean{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int idHabilitado;
	private String tipoDocumento;
	private String nroDocumento;
	private String ApellidoNombre;
	@ManyToOne
	@JoinColumn(name="idSolicitudDeCarga", nullable=false)
		private SolicitudDeCargaBean solicitudesdecarga_habilitado;
	
	
	
	public HabilitadoBean(String tipoDocumento, String nroDocumento, String apellidoNombre) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		ApellidoNombre = apellidoNombre;
	}
	
	public HabilitadoBean() {

	}
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public String getApellidoNombre() {
		return ApellidoNombre;
	}
	public void setApellidoNombre(String apellidoNombre) {
		ApellidoNombre = apellidoNombre;
	}	
	
}
