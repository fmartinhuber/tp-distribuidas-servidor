package bean;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="SolicitudDeCarga")
public class SolicitudDeCargaBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int idSolicitudDeCarga;
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
		private ClienteBean cliente;
	@OneToMany (cascade=CascadeType.ALL, mappedBy="solicitudesdecarga_carga")
		private List<CargaBean> cargas = new ArrayList<CargaBean>();
	@OneToMany (cascade=CascadeType.ALL, mappedBy="solicitudesdecarga_habilitado")
		private List<HabilitadoBean> habilitado = new ArrayList<HabilitadoBean>();
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
		private DireccionBean destino;
	private Date fechaEntregaProbable;
	private Date fechaEntregaMaxima;
	private String manifiesto;
	private String estadoSolicitud;
	@ManyToOne
	@JoinColumn(name="idSucursal", nullable=false)
		private SucursalBean sucursales_solicituddecarga;
	@ManyToOne
	@JoinColumn(name="idViaje", nullable=false)
		private ViajeBean viajes_solicitudes;
	
	
	public SolicitudDeCargaBean(ClienteBean cliente, List<CargaBean> cargas,
			List<HabilitadoBean> habilitado, DireccionBean destino,
			Date fechaEntregaProbable, Date fechaEntregaMaxima,
			String manifiesto, String estadoSolicitud) {
		super();
		this.cliente = cliente;
		this.cargas = cargas;
		this.habilitado = habilitado;
		this.destino = destino;
		this.fechaEntregaProbable = fechaEntregaProbable;
		this.fechaEntregaMaxima = fechaEntregaMaxima;
		this.manifiesto = manifiesto;
		this.estadoSolicitud = estadoSolicitud;
	}

	public SolicitudDeCargaBean() {
		
	}

	public int getIdSolicitudDeCarga() {
		return idSolicitudDeCarga;
	}

	public void setIdSolicitudDeCarga(int idSolicitudDeCarga) {
		this.idSolicitudDeCarga = idSolicitudDeCarga;
	}

	public ClienteBean getCliente() {
		return cliente;
	}

	public void setCliente(ClienteBean cliente) {
		this.cliente = cliente;
	}

	public List<CargaBean> getCargas() {
		return cargas;
	}

	public void setCargas(List<CargaBean> cargas) {
		this.cargas = cargas;
	}

	public List<HabilitadoBean> getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(List<HabilitadoBean> habilitado) {
		this.habilitado = habilitado;
	}

	public DireccionBean getDestino() {
		return destino;
	}

	public void setDestino(DireccionBean destino) {
		this.destino = destino;
	}

	public Date getFechaEntregaProbable() {
		return fechaEntregaProbable;
	}

	public void setFechaEntregaProbable(Date fechaEntregaProbable) {
		this.fechaEntregaProbable = fechaEntregaProbable;
	}

	public Date getFechaEntregaMaxima() {
		return fechaEntregaMaxima;
	}

	public void setFechaEntregaMaxima(Date fechaEntregaMaxima) {
		this.fechaEntregaMaxima = fechaEntregaMaxima;
	}

	public String getManifiesto() {
		return manifiesto;
	}

	public void setManifiesto(String manifiesto) {
		this.manifiesto = manifiesto;
	}

	public String getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}
	
}
