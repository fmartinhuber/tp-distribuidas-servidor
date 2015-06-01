package bean;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.mapping.Array;

@Entity
@Table(name="Sucursal")
public class SucursalBean{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int idSucursal;
	private Integer nroSucursal;
	private String nombreSucursal;
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
	@OneToMany (cascade=CascadeType.ALL, mappedBy="sucursales_empleado")
		private List<EmpleadoBean> empleados = new ArrayList<EmpleadoBean>();
	@OneToOne (cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
		private DepositoBean deposito;
	@OneToMany (cascade=CascadeType.ALL, mappedBy="sucursales_solicituddecarga")
		private List<SolicitudDeCargaBean> SolicitudesDeCarga = new ArrayList<SolicitudDeCargaBean>();
	@OneToMany (cascade=CascadeType.ALL, mappedBy="sucursales_vehiculos")
		private List<VehiculoBean> vehiculosDisponibles = new ArrayList<VehiculoBean>();
	
	
	
	public SucursalBean(int idSucursal, Integer nroSucursal,
			String nombreSucursal, DireccionBean domicilio,
			EmpleadoBean gerente, EmpleadoBean encargadoDeposito,
			EmpleadoBean encargadoDespacho, List<EmpleadoBean> empleados,
			DepositoBean deposito,
			List<SolicitudDeCargaBean> solicitudesDeCarga,
			List<VehiculoBean> vehiculosDisponibles) {
		this.idSucursal = idSucursal;
		this.nroSucursal = nroSucursal;
		this.nombreSucursal = nombreSucursal;
		this.domicilio = domicilio;
		this.gerente = gerente;
		this.encargadoDeposito = encargadoDeposito;
		this.encargadoDespacho = encargadoDespacho;
		this.empleados = empleados;
		this.deposito = deposito;
		SolicitudesDeCarga = solicitudesDeCarga;
		this.vehiculosDisponibles = vehiculosDisponibles;
	}
	
	public SucursalBean() {

	}

	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}

	public Integer getNroSucursal() {
		return nroSucursal;
	}

	public void setNroSucursal(Integer nroSucursal) {
		this.nroSucursal = nroSucursal;
	}

	public String getNombreSucursal() {
		return nombreSucursal;
	}

	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}

	public DireccionBean getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(DireccionBean domicilio) {
		this.domicilio = domicilio;
	}

	public EmpleadoBean getGerente() {
		return gerente;
	}

	public void setGerente(EmpleadoBean gerente) {
		this.gerente = gerente;
	}

	public EmpleadoBean getEncargadoDeposito() {
		return encargadoDeposito;
	}

	public void setEncargadoDeposito(EmpleadoBean encargadoDeposito) {
		this.encargadoDeposito = encargadoDeposito;
	}

	public EmpleadoBean getEncargadoDespacho() {
		return encargadoDespacho;
	}

	public void setEncargadoDespacho(EmpleadoBean encargadoDespacho) {
		this.encargadoDespacho = encargadoDespacho;
	}

	public List<EmpleadoBean> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<EmpleadoBean> empleados) {
		this.empleados = empleados;
	}

	public DepositoBean getDeposito() {
		return deposito;
	}

	public void setDeposito(DepositoBean deposito) {
		this.deposito = deposito;
	}

	public List<SolicitudDeCargaBean> getSolicitudesDeCarga() {
		return SolicitudesDeCarga;
	}

	public void setSolicitudesDeCarga(List<SolicitudDeCargaBean> solicitudesDeCarga) {
		SolicitudesDeCarga = solicitudesDeCarga;
	}

	public List<VehiculoBean> getVehiculosDisponibles() {
		return vehiculosDisponibles;
	}

	public void setVehiculosDisponibles(List<VehiculoBean> vehiculosDisponibles) {
		this.vehiculosDisponibles = vehiculosDisponibles;
	}
	
}
