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
	/*@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="idSucursal")
		private SucursalBean sucursalDestino;*/
	
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idItemRemito")
		private List<ItemRemitoBean> itemsRemito;

	
}
