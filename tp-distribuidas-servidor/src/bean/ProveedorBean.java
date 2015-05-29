package bean;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Proveedor")
public class ProveedorBean
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int idProveedor;
	
	private String tipoDocumento;
	private int numeroDocumento;
	private String razonSocial;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idDireccion")
		private DireccionBean domicilioComercial;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idServicio")
		private List<ServicioBean> serviciosProvistos;
	
}
