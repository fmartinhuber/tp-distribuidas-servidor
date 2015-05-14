package dao;

import java.util.List;

import dto.ProveedorDto;
import dto.ServicioDto;
import dto.SucursalDto;
import dto.VehiculoDto;
import dto.ViajeDto;
import rmi.IAdministradorViaje;

public class AdministradorViajeDao {

	public List<ViajeDto> listarSolicitudesDeViajePorSucursal(
			SucursalDto sucursal) {
		// TODO Auto-generated method stub
		return null;
	}

	public void generarViaje() {
		// TODO Auto-generated method stub

	}

	public boolean verificarDisponibilidadVehiculo() {
		// TODO Auto-generated method stub
		return false;
	}

	public ProveedorDto buscarProveedor() {
		// TODO Auto-generated method stub
		return null;
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

}
