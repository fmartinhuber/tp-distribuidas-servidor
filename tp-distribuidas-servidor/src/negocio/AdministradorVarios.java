package negocio;
import java.util.ArrayList;
import java.util.List;

import dto.ClienteDto;
import dto.DireccionDto;
import dto.EmpleadoDto;
import dto.SucursalDto;
import rmi.IAdministradorVarios;


public class AdministradorVarios implements IAdministradorVarios{
	
	private List<Cliente> clientes;
	private List<Sucursal> sucursales; 
	private List<Empleado> empleados;
	private List<Vehiculo> vehiculos;
	private List<Proveedor> proveedores;
	private List<Factura> facturas;
	private static AdministradorVarios instancia;
	
	public AdministradorVarios() {
		this.clientes = new ArrayList<Cliente>();
		this.sucursales = new ArrayList<Sucursal>();
		this.empleados = new ArrayList<Empleado>();
		this.vehiculos = new ArrayList<Vehiculo>();
		this.proveedores = new ArrayList<Proveedor>();
		this.setFacturas(new ArrayList<Factura>());
	}

	public static AdministradorVarios getInstancia(){
		if(instancia==null)
			return new AdministradorVarios();
		return instancia;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public List<Sucursal> getSucursales() {
		return sucursales;
	}
	public void setSucursales(List<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	public List<Proveedor> getProveedores() {
		return proveedores;
	}
	public void setProveedores(List<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}
	public void altaCliente(ClienteDto clienteDto) {
		//Se guarda en memoria
		System.out.println("Se agrego un cliente por RMI");
		Cliente cliente = new Cliente(clienteDto);
		clientes.add(cliente);
		//Se guarda en la base
		cliente.guardar();
	}
	public ClienteDto obtenerCliente(String dni) {
		return null;
	}
	public void altaDireccion(DireccionDto direccion) {
		
	}
	public void altaSucursal(SucursalDto sucursal) {
		
	}
	public void altaEmpleado(EmpleadoDto empleado) {
		
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	} 
	
	
	
}
