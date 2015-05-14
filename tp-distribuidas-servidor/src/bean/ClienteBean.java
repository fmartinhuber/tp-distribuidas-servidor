package bean;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Entity;

@Entity
@Table(name="Cliente")
public class ClienteBean{
	
	@Id 
	@GeneratedValue( strategy = GenerationType.AUTO)
		private int idCliente;
	private String tipoDocumento;
	private String nroDocumento;
		
	public ClienteBean(String tipoDocumento, String nroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
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
