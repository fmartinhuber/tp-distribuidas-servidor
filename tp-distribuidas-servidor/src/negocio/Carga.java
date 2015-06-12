package negocio;
import java.io.File;

import bean.CargaBean;
import dao.CargaDao;

public class Carga{
	
	private float alto;
	private float ancho;
	private float profundidad;
	private float peso;
	private float volumen;
	private boolean apilable;
	private int cantidadApilable;
	private String fragilidad;
	private String tratamiento;
	private String condicionViaje;
	private String textoManipulacion;
	private String permiso;
	private String archivoPermiso;
	
	
	
	public Carga(float alto, float ancho, float profundidad, float peso,
			float volumen, boolean apilable, int cantidadApilable,
			String fragilidad, String tratamiento, String condicionViaje,
			String textoManipulacion, String permiso, String archivoPermiso) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.peso = peso;
		this.volumen = volumen;
		this.apilable = apilable;
		this.cantidadApilable = cantidadApilable;
		this.fragilidad = fragilidad;
		this.tratamiento = tratamiento;
		this.condicionViaje = condicionViaje;
		this.textoManipulacion = textoManipulacion;
		this.permiso = permiso;
		this.archivoPermiso = archivoPermiso;
	}


	public void guardar(){
		CargaBean cargaBean = new CargaBean ();		
		CargaDao.getInstancia().guardar(cargaBean);
	}


	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public float getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getVolumen() {
		return volumen;
	}

	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}

	public boolean isApilable() {
		return apilable;
	}

	public void setApilable(boolean apilable) {
		this.apilable = apilable;
	}

	public int getCantidadApilable() {
		return cantidadApilable;
	}

	public void setCantidadApilable(int cantidadApilable) {
		this.cantidadApilable = cantidadApilable;
	}

	public String getFragilidad() {
		return fragilidad;
	}

	public void setFragilidad(String fragilidad) {
		this.fragilidad = fragilidad;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getCondicionViaje() {
		return condicionViaje;
	}

	public void setCondicionViaje(String condicionViaje) {
		this.condicionViaje = condicionViaje;
	}

	public String getTextoManipulacion() {
		return textoManipulacion;
	}

	public void setTextoManipulacion(String textoManipulacion) {
		this.textoManipulacion = textoManipulacion;
	}

	public String getPermiso() {
		return permiso;
	}

	public void setPermiso(String permiso) {
		this.permiso = permiso;
	}

	public String getArchivoPermiso() {
		return archivoPermiso;
	}

	public void setArchivoPermiso(String archivoPermiso) {
		this.archivoPermiso = archivoPermiso;
	}
}
