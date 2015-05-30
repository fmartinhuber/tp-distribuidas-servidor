package bean;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Remito")
public class RemitoBean{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int idRemito;
	private Date fechaEnvio;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idCliente")
		private ClienteBean remitente;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idHabilitado")
		private HabilitadoBean destinatario;
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="idSucursal")
		private SucursalBean sucursalOrigen;
	private Integer nroSucursalDestino;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idItemRemito")
		private List<ItemRemitoBean> itemsRemito;
	
	
	
	public RemitoBean(int idRemito, Date fechaEnvio, ClienteBean remitente,
			HabilitadoBean destinatario, SucursalBean sucursalOrigen,
			Integer nroSucursalDestino, List<ItemRemitoBean> itemsRemito) {
		super();
		this.idRemito = idRemito;
		this.fechaEnvio = fechaEnvio;
		this.remitente = remitente;
		this.destinatario = destinatario;
		this.sucursalOrigen = sucursalOrigen;
		this.nroSucursalDestino = nroSucursalDestino;
		this.itemsRemito = itemsRemito;
	}

	public RemitoBean() {

	}

	public int getIdRemito() {
		return idRemito;
	}

	public void setIdRemito(int idRemito) {
		this.idRemito = idRemito;
	}

	public Date getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public ClienteBean getRemitente() {
		return remitente;
	}

	public void setRemitente(ClienteBean remitente) {
		this.remitente = remitente;
	}

	public HabilitadoBean getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(HabilitadoBean destinatario) {
		this.destinatario = destinatario;
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

	public List<ItemRemitoBean> getItemsRemito() {
		return itemsRemito;
	}

	public void setItemsRemito(List<ItemRemitoBean> itemsRemito) {
		this.itemsRemito = itemsRemito;
	}
	
}
