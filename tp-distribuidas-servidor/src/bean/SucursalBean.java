package bean;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Sucursal")
public class SucursalBean
{
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
		private int idSucursal;
		private Integer nroSucursal;
	@OneToOne (cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
		private DireccionBean domicilio;
	@OneToOne (cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
		private EmpleadoBean gerente;
	@OneToOne (cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
		private EmpleadoBean encargadoDeposito;
	@OneToOne (cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
		private EmpleadoBean encargadoDespacho;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idEmpleado")
		private List<EmpleadoBean> empleados;
	@OneToOne (cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
		private DepositoBean deposito;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idSucursal")
		private List<SolicitudDeCargaBean> SolicitudesDeCarga;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idVehiculo")
		private List<VehiculoBean> vehiculosDisponibles;
	
}
