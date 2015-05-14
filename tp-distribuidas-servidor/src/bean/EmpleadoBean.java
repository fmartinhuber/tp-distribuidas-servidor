package bean;

import java.util.List;


public class EmpleadoBean {
	private int codEmpleado;
	private String tipoDocumento;
	private int nroDocumento;
	private int CUIL;
	private String apellido;
	private String nombre;
	private String funcion;

	public EmpleadoBean(int codEmpleado, String tipoDocumento,
			int nroDocumento, int CUIL, String apellido, String nombre,
			String funcion) {
		this.codEmpleado = codEmpleado;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.CUIL = CUIL;
		this.apellido = apellido;
		this.nombre = nombre;
		this.funcion = funcion;
	}
	
	public void setcodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public void setNroDocumento(int documento){
		this.nroDocumento = documento;
	}
	
	public void setCUIL(int cuil){
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
	
	public int getNroDoc(){
		return this.nroDocumento;
	}
	
	public int getCUIL(){
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
