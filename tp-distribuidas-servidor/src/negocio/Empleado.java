package negocio;

public class Empleado
{
	private int codEmpleado;
	private String tipoDocumento;
	private String nroDocumento;
	private String CUIL;
	private String nombre;
	private String apellido;
	private String funcion;
	
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
	
	//TODO: Agregar más clases de negocio para el ABM
}