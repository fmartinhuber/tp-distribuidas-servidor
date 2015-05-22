package bean;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="AdministradorVarios")
public class AdministradorVariosBean{
	
	@Id 
	@GeneratedValue( strategy = GenerationType.AUTO)
		private int idAdministradorVarios;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idCliente")
		private List<ClienteBean> clientes;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idSucursal")
		private List<SucursalBean> sucursales;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idEmpleado")
		private List<EmpleadoBean> empleados;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idVehiculo")
		private List<VehiculoBean> vehiculos;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idProveedor")
		private List<ProveedorBean> proveedores;
		
}
