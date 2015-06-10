package negocio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public abstract class Viaje{
	
	private Sucursal sucursalOrigen;
	private Sucursal sucursalDestino;
	private Date fechaPartida;
	private Date fechaArribo;
	private List<Servicio> serviciosAdicionales;
	private List<SolicitudDeCarga> solicitudesDeCarga;
	private Date fechaPrioridad;
	
	public Viaje(){
		serviciosAdicionales = new ArrayList<Servicio> ();
		solicitudesDeCarga = new ArrayList<SolicitudDeCarga> ();
	}
	protected abstract float calcularPrecio();
	
	
	public Sucursal getSucursalOrigen() {
		return sucursalOrigen;
	}


	public void setSucursalOrigen(Sucursal sucursalOrigen) {
		this.sucursalOrigen = sucursalOrigen;
	}


	public Sucursal getSucursalDestino() {
		return sucursalDestino;
	}


	public void setSucursalDestino(Sucursal sucursalDestino) {
		this.sucursalDestino = sucursalDestino;
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


	public List<Servicio> getServiciosAdicionales() {
		return serviciosAdicionales;
	}


	public void setServiciosAdicionales(List<Servicio> serviciosAdicionales) {
		this.serviciosAdicionales = serviciosAdicionales;
	}


	public List<SolicitudDeCarga> getSolicitudesDeCarga() {
		return solicitudesDeCarga;
	}


	public void setSolicitudesDeCarga(List<SolicitudDeCarga> solicitudesDeCarga) {
		this.solicitudesDeCarga = solicitudesDeCarga;
	}


	public Date getFechaPrioridad() {
		return fechaPrioridad;
	}


	public void setFechaPrioridad(Date fechaPrioridad) {
		this.fechaPrioridad = fechaPrioridad;
	}


	public void addServicios(Servicio s)
	{
	
	}
}
