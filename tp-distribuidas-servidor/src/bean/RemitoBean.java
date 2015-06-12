package bean;
import java.util.ArrayList;
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
	@JoinColumn(name="idCliente", nullable=false)
		private ClienteBean remitente;
		private String destinatario;
	@OneToOne (cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
		private SucursalBean sucursalOrigen;
	@OneToOne (cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
		private SucursalBean sucursalDestino;
	@OneToMany (cascade=CascadeType.ALL, mappedBy="remitos")
		private List<ItemRemitoBean> itemsRemito = new ArrayList<ItemRemitoBean>();
	
	
}
