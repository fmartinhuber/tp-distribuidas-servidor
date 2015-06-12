package bean;
import java.io.File;

import javax.persistence.*;

@Entity
@Table(name="Carga")
public class CargaBean{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int idCarga;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idDimension", nullable=false)
		private DimensionBean dimension;
	private boolean apilable;
	private int cantidadApilable;
	private String fragilidad;
	private String tratamiento;
	private String condicionViaje;
	private String textoManipulacion;
	private String permiso;
	private String archivoPermiso;
	@ManyToOne
	@JoinColumn(name="idDeposito", nullable=false)
		private DepositoBean depositos;
	@ManyToOne
	@JoinColumn(name="idSolicitudDeCarga", nullable=false)
		private SolicitudDeCargaBean solicitudesdecarga_carga;
	
	
	
	public CargaBean(int idCarga, DimensionBean dimension, boolean apilable,
			int cantidadApilable, String fragilidad, String tratamiento,
			String condicionViaje, String textoManipulacion, String permiso,
			String archivoPermiso, DepositoBean depositos,
			SolicitudDeCargaBean solicitudesdecarga_carga) {
		super();
		this.idCarga = idCarga;
		this.dimension = dimension;
		this.apilable = apilable;
		this.cantidadApilable = cantidadApilable;
		this.fragilidad = fragilidad;
		this.tratamiento = tratamiento;
		this.condicionViaje = condicionViaje;
		this.textoManipulacion = textoManipulacion;
		this.permiso = permiso;
		this.archivoPermiso = archivoPermiso;
		this.depositos = depositos;
		this.solicitudesdecarga_carga = solicitudesdecarga_carga;
	}

	public CargaBean() {
		super();
	}

	public int getIdCarga() {
		return idCarga;
	}

	public void setIdCarga(int idCarga) {
		this.idCarga = idCarga;
	}

	public DimensionBean getDimension() {
		return dimension;
	}

	public void setDimension(DimensionBean dimension) {
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

	public DepositoBean getDepositos() {
		return depositos;
	}

	public void setDepositos(DepositoBean depositos) {
		this.depositos = depositos;
	}

	public SolicitudDeCargaBean getSolicitudesdecarga_carga() {
		return solicitudesdecarga_carga;
	}

	public void setSolicitudesdecarga_carga(
			SolicitudDeCargaBean solicitudesdecarga_carga) {
		this.solicitudesdecarga_carga = solicitudesdecarga_carga;
	}
		
}
