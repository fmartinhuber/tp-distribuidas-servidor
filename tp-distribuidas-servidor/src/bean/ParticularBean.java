package bean;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Particular")
public class ParticularBean extends ClienteBean{
	
	private String apellido;
	private String nombre;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idDireccion")
		private DireccionBean direccion;
	
	
	
	public ParticularBean(String tipoDocumento, String nroDocumento, List<HabilitadoBean> habilitados) {
		super(tipoDocumento, nroDocumento);
	}
	
	public ParticularBean() {
		
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public DireccionBean getDireccionBean() {
		return direccion;
	}

	public void setDireccionBean(DireccionBean miDireccionBean) {
		this.direccion = miDireccionBean;
	}
	
}
