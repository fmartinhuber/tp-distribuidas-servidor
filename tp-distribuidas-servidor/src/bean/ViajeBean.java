package bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ViajeBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
		protected int idViaje;
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="idSucursal")
		private SucursalBean sucursalOrigen;
	private Integer nroSucursalDestino;
	private Date fechaPartida;
	private Date fechaArribo;
	@OneToMany (cascade=CascadeType.ALL, mappedBy="viajes_servicios")
		private List<ServicioBean> serviciosAdicionales = new ArrayList<ServicioBean>();
	@OneToMany (cascade=CascadeType.ALL, mappedBy="viajes_solicitudes")
		private List<SolicitudDeCargaBean> solicitudesDeCarga = new ArrayList<SolicitudDeCargaBean>();
	private Date fechaPrioridad;
	
	
	
	public ViajeBean(SucursalBean sucursalOrigen, Integer nroSucursalDestino,
			Date fechaPartida, Date fechaArribo,
			List<ServicioBean> serviciosAdicionales,
			List<SolicitudDeCargaBean> solicitudesDeCarga, Date fechaPrioridad) {
		this.sucursalOrigen = sucursalOrigen;
		this.nroSucursalDestino = nroSucursalDestino;
		this.fechaPartida = fechaPartida;
		this.fechaArribo = fechaArribo;
		this.serviciosAdicionales = serviciosAdicionales;
		this.solicitudesDeCarga = solicitudesDeCarga;
		this.fechaPrioridad = fechaPrioridad;
	}

	public ViajeBean() {
		
	}

	public SucursalBean getSucursalOrigen() {
		return sucursalOrigen;
	}

	public void setSucursalOrigen(SucursalBean sucursalOrigen) {
		this.sucursalOrigen = sucursalOrigen;
	}

	public Integer getNroSucursalDestino() {
		return nroSucursalDestino;
	}

	public void setNroSucursalDestino(Integer nroSucursalDestino) {
		this.nroSucursalDestino = nroSucursalDestino;
	}

	public Date getFechaPartida() {
		return fechaPartida;
	}

	public void setFechaPartida(Date fechaPartida) {
		this.fechaPartida = fechaPartida;
	}

	public Date getFechaArribo() {
		return fechaArribo;
	}

	public void setFechaArribo(Date fechaArribo) {
		this.fechaArribo = fechaArribo;
	}

	public List<ServicioBean> getServiciosAdicionales() {
		return serviciosAdicionales;
	}

	public void setServiciosAdicionales(List<ServicioBean> serviciosAdicionales) {
		this.serviciosAdicionales = serviciosAdicionales;
	}

	public List<SolicitudDeCargaBean> getSolicitudesDeCarga() {
		return solicitudesDeCarga;
	}

	public void setSolicitudesDeCarga(List<SolicitudDeCargaBean> solicitudesDeCarga) {
		this.solicitudesDeCarga = solicitudesDeCarga;
	}

	public Date getFechaPrioridad() {
		return fechaPrioridad;
	}

	public void setFechaPrioridad(Date fechaPrioridad) {
		this.fechaPrioridad = fechaPrioridad;
	}

}
