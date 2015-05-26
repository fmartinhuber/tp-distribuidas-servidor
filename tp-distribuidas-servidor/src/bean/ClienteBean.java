package bean;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ClienteBean{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
