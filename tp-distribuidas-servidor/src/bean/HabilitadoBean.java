package bean;

import javax.persistence.*;


@Entity
public class HabilitadoBean
{
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int idHabilitado;
	private String tipoDocumento;
	private int nroDocumento;
	private String ApellidoNombre;
	
	public HabilitadoBean(String tipoDocumento, int nroDocumento, String apellidoNombre) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		ApellidoNombre = apellidoNombre;
	}
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public int getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public String getApellidoNombre() {
		return ApellidoNombre;
	}
	public void setApellidoNombre(String apellidoNombre) {
		ApellidoNombre = apellidoNombre;
	}
	
	
}
