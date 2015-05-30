package bean;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="Particular")
public class ParticularBean extends ClienteBean{
	
	private static final long serialVersionUID = 1L;
	
	private String apellido;
	private String nombre;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idDireccion")
		private DireccionBean direccion;
		
	
	
	public ParticularBean(String tipoDocumento, String nroDocumento,
			String apellido, String nombre, DireccionBean direccion) {
		super(tipoDocumento, nroDocumento);
		this.apellido = apellido;
		this.nombre = nombre;
		this.direccion = direccion;
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
