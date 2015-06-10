package negocio;

import bean.CargaBean;
import bean.DimensionBean;
import dao.CargaDao;

public class Carga{
	
	private Dimension dimension;
	private boolean apilable;
	private int cantidadApilable;
	private String fragilidad;
	private String tratamiento;
	private String condicionViaje;
	private String textoManipulacion;
	private String permiso;
	private String archivoPermiso;
	
	public Carga(Dimension dimension, boolean apilable, int cantidadApilable, String fragilidad, String tratamiento,
			String condicionViaje, String textoManipulacion, String permiso, String archivoPermiso) {
		this.dimension = dimension;
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
		CargaBean cargaBean = new CargaBean (cantidadApilable, dimensionNegocioTOdimensionBean(this.dimension), this.apilable, 
				this.cantidadApilable, this.fragilidad, this.tratamiento, this.condicionViaje, 
				this.textoManipulacion, this.permiso, this.archivoPermiso, null, null);		
		CargaDao.getInstancia().guardar(cargaBean);
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
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

	public DimensionBean dimensionNegocioTOdimensionBean (Dimension dimNeg){
		return new DimensionBean (dimNeg.getAlto(), dimNeg.getAncho(), dimNeg.getProfundidad(), dimNeg.getPeso(), dimNeg.getVolumen());
	}
}
