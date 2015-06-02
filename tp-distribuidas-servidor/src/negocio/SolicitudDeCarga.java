package negocio;

import java.io.File;
import java.util.Date;
import java.util.List;

import dto.CargaDto;
import dto.ClienteDto;
import dto.DireccionDto;
import rmi.ISolicitudDeCarga;

public class SolicitudDeCarga implements ISolicitudDeCarga{
	
	private Cliente cliente;
	private List<Carga> cargas;
	private List<Habilitado> habilitados;
	private Direccion direccion;
	private Date fechaEntregaProbable;
	private Date fechaEntregaMaxima;
	private String manifiesto;
	private String estadoSolcitud;
	
	public SolicitudDeCarga (Cliente cliente, List<Carga> cargas, 
			List<Habilitado> habilitados, Direccion direccion, Date fechaEntregaProbable, 
			Date fechaEntregaMaxima, String manifiesto, String estadoSolcitud) {
		this.cliente = cliente;
		this.cargas = cargas;
		this.habilitados = habilitados;
		this.direccion = direccion;
		this.fechaEntregaProbable = fechaEntregaProbable;
		this.fechaEntregaMaxima = fechaEntregaMaxima;
		this.manifiesto = manifiesto;
		this.estadoSolcitud = estadoSolcitud;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(List<Carga> cargas) {
		this.cargas = cargas;
	}

	public List<Habilitado> getHabilitados() {
		return habilitados;
	}

	public void setHabilitados(List<Habilitado> habilitados) {
		this.habilitados = habilitados;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Date getFechaEntregaProbable() {
		return fechaEntregaProbable;
	}

	public void setFechaEntregaProbable(Date fechaEntregaProbable) {
		this.fechaEntregaProbable = fechaEntregaProbable;
	}

	public Date getFechaEntregaMaxima() {
		return fechaEntregaMaxima;
	}

	public void setFechaEntregaMaxima(Date fechaEntregaMaxima) {
		this.fechaEntregaMaxima = fechaEntregaMaxima;
	}

	public String getManifiesto() {
		return manifiesto;
	}

	public void setManifiesto(String manifiesto) {
		this.manifiesto = manifiesto;
	}

	public String getEstadoSolcitud() {
		return estadoSolcitud;
	}

	public void setEstadoSolcitud(String estadoSolcitud) {
		this.estadoSolcitud = estadoSolcitud;
	}

	public void agregarCarga(CargaDto carga) {
		// TODO Auto-generated method stub
		
	}

	public void nuevoDestino(DireccionDto domicilio) {
		// TODO Auto-generated method stub
		
	}

	public ClienteDto buscarCliente(int cuit) {
		// TODO Auto-generated method stub
		return null;
	}

	public void actualizarEstado(String estado) {
		// TODO Auto-generated method stub
		
	}

}
