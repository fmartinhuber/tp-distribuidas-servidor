package negocio;
import java.util.ArrayList;
import java.util.List;

import bean.ProveedorBean;
import bean.SucursalBean;
import bean.VehiculoBean;
import dao.ProveedorDao;
import dao.SucursalDao;
import dao.VehiculoDao;
import dto.ProveedorDto;
import dto.ServicioDto;
import dto.SucursalDto;
import dto.VehiculoDto;
import dto.ViajeDto;
import rmi.IAdministradorViaje;


public class AdministradorViaje implements IAdministradorViaje {
	private List<Viaje> viajes;
	private List<Proveedor> proveedores;
	private List<Sucursal> sucursales;
	private List<Vehiculo> vehiculos;
	public static AdministradorViaje instancia;
	
	public List<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(List<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}

	public List<Sucursal> getSucursales() {
		return sucursales;
	}

	public void setSucursales(List<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	public static AdministradorViaje getInstancia(){
		if (instancia == null){
			return new AdministradorViaje();
		}
		return instancia;
	}
	
	public AdministradorViaje (){
		this.proveedores = new ArrayList <Proveedor>();
		this.sucursales = new ArrayList <Sucursal>();
		this.vehiculos = new ArrayList <Vehiculo>();
	}
	
	private List<Viaje> listarSolicitudesDeViajePorSucursal(Sucursal suc)
	{
		return viajes;
	
	}
	
	public void generarViaje(){
		
	}
	
	public List <Vehiculo> vehiculosDisponibilides(){
		List<Vehiculo> disponibles = new ArrayList<Vehiculo> ();
		for (int i=0;i<this.vehiculos.size();i++){
			Vehiculo vehiculo = this.vehiculos.get(i);
			if(verificarDisponibilidadVehiculo(vehiculo))
				vehiculos.add(vehiculo);
		}
		return disponibles;
	}
	
	
	public List<ViajeDto> listarSolicitudesDeViajePorSucursal(
			SucursalDto sucursal) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean verificarDisponibilidadVehiculo(Vehiculo vehiculo) {
		if (!vehiculo.isEnMantenimiento()){
			if(!vehiculo.isEnViaje()){
				if(vehiculo.getDisponibilidadVolumen() > 0){
					if(vehiculo.getDisponibilidadTara() > 0){
						return true;
					}
				}
			}
		}
		return false;
	}

	public ProveedorDto buscarProveedor(String cuit) {
		return Proveedor.obtenerProveedor(cuit);
		 
	}

	public List<ServicioDto> solicitarServicios() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ServicioDto> solicitarServiciosAdicionales() {
		// TODO Auto-generated method stub
		return null;
	}

	public void asignarVehiculo(ViajeDto viaje, VehiculoDto vehiculo) {
		// TODO Auto-generated method stub
		
	}

	public void creacionRemito() {
		// TODO Auto-generated method stub
		
	}

	public float calcularPrecio(ViajeDto viaje) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	public List<ProveedorDto> obtenerProveedores() {
		List <ProveedorBean> lista = ProveedorDao.obtenerProveedores();
		return Proveedor.listarBeanADto(lista);
	}

	public List<SucursalDto> obtenerSurcusales() {
		List <SucursalBean> lista = SucursalDao.obtenerSucursales();
		return Sucursal.listarBeanADto(lista);
	}

	public List<VehiculoDto> obtenerVehiculos() {
		List <VehiculoBean> lista = VehiculoDao.obtenerVehiculos();
		return Vehiculo.listarBeanADto(lista);
	}


}
