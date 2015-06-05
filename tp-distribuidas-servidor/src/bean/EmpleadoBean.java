package bean;

import javax.persistence.*;

@Entity
@Table(name="Empleado")
public class EmpleadoBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int idEmpleado;
	private int codEmpleado;
	private String tipoDocumento;
	private String nroDocumento;
	private String CUIL;
	private String apellido;
	private String nombre;
	private String funcion;
	@ManyToOne
	@JoinColumn(name="idSucursal", nullable=false)
		private SucursalBean sucursales_empleado;
	
	

	public EmpleadoBean(int codEmpleado, String tipoDocumento,
			String nroDocumento, String CUIL, String apellido, String nombre,
			String funcion) {
		this.codEmpleado = codEmpleado;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.CUIL = CUIL;
		this.apellido = apellido;
		this.nombre = nombre;
		this.funcion = funcion;
	}
	
	public EmpleadoBean() {
		
	}
	
	public void setcodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public void setNroDocumento(String documento){
		this.nroDocumento = documento;
	}
	
	public void setCUIL(String cuil){
		this.CUIL = cuil;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public int getCodEmpleado(){
		return this.codEmpleado;
	}
	
	public String getTipoDoc(){
		return this.tipoDocumento;
	}
	
	public String getNroDoc(){
		return this.nroDocumento;
	}
	
	public String getCUIL(){
		return this.CUIL;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getApellido(){
		return this.apellido;
	}
	
	public String getFuncion(){
		return this.funcion;
	}	
}
