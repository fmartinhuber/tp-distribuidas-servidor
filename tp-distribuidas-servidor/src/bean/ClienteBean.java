package bean;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ClienteBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
		protected int idCliente;
	protected String tipoDocumento;
	protected String nroDocumento;
	
	public ClienteBean(String tipoDocumento, String nroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
	}
	
	public ClienteBean() {
		
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
	
}
