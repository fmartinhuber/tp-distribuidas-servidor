package negocio;
import java.util.List;

import bean.SucursalBean;
import dto.EmpleadoDto;
import dto.RemitoDto;
import dto.SolicitudDeCargaDto;
import dto.SucursalDto;
import dto.VehiculoDto;
import dto.ViajeDto;
import rmi.ISucursal;



public class Sucursal implements ISucursal {
	private Integer nroSucursal;
	private Direccion domicilio;
	private Empleado gerente;
	private Empleado encargadoDeposito;
	private Empleado encargadoDespacho;
	private List<Empleado> empleados;
	private Deposito deposito;
	private List<SolicitudDeCarga> SolicitudesDeCarga;
	private List<Vehiculo> vehiculosDisponibles;
	
	
	public Integer getNroSucursal() {
		return nroSucursal;
	}
	public void setNroSucursal(Integer nroSucursal) {
		this.nroSucursal = nroSucursal;
	}
	public Direccion getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Direccion domicilio) {
		this.domicilio = domicilio;
	}
	public Empleado getGerente() {
		return gerente;
	}
	public void setGerente(Empleado gerente) {
		this.gerente = gerente;
	}
	public Empleado getEncargadoDeposito() {
		return encargadoDeposito;
	}
	public void setEncargadoDeposito(Empleado encargadoDeposito) {
		this.encargadoDeposito = encargadoDeposito;
	}
	public Empleado getEncargadoDespacho() {
		return encargadoDespacho;
	}
	public void setEncargadoDespacho(Empleado encargadoDespacho) {
		this.encargadoDespacho = encargadoDespacho;
	}
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	public Deposito getDeposito() {
		return deposito;
	}
	public void setDeposito(Deposito deposito) {
		this.deposito = deposito;
	}
	public List<SolicitudDeCarga> getSolicitudesDeCarga() {
		return SolicitudesDeCarga;
	}
	public void setSolicitudesDeCarga(List<SolicitudDeCarga> solicitudesDeCarga) {
		SolicitudesDeCarga = solicitudesDeCarga;
	}
	public List<Vehiculo> getVehiculosDisponibles() {
		return vehiculosDisponibles;
	}
	public void setVehiculosDisponibles(List<Vehiculo> vehiculosDisponibles) {
		this.vehiculosDisponibles = vehiculosDisponibles;
	}
	public void nuevaSolicitud() {
		// TODO Auto-generated method stub
		
	}
	public List<ViajeDto> consultaSolicitudesSinViaje() {
		// TODO Auto-generated method stub
		return null;
	}
	public void designarEncargado(EmpleadoDto empleado) {
		// TODO Auto-generated method stub
		
	}
	public void designarEncargadoDespacho(EmpleadoDto empleado) {
		// TODO Auto-generated method stub
		
	}
	public void generarSolicitudCarga(SolicitudDeCargaDto solicitudDeCarga) {
		// TODO Auto-generated method stub
		
	}
	public void recepcionPedido(RemitoDto remito) {
		// TODO Auto-generated method stub
		
	}
	public List<VehiculoDto> obtenerVehiculosDisponibles() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<SucursalDto> obteneSucursales() {
		// TODO Auto-generated method stub
		return null;
	}
	public static List<SucursalDto> listarBeanADto(List<SucursalBean> lista) {
		// TODO Auto-generated method stub
		return null;
	}
	}
