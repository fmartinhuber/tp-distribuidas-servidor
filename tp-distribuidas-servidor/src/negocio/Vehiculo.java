package negocio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bean.VehiculoBean;
import dto.VehiculoDto;
import rmi.IVehiculo;

public class Vehiculo implements IVehiculo{
	private String dominio;
	private String marca;
	private String modelo;
	private int anio;
	private String cedulaVerde;
	private Date vencimientoCedulaVerde;
	private float peso;
	private float tara;
	private float volumenDeCarga;
	private String caracteristicas;
	private float disponibilidadVolumen;
	private float disponibilidadTara;
	private float capacidadDisponible;
	private boolean enMantenimiento;
	private boolean enViaje;
	//Sirve tanto a de agenda a futuro como de historial
	private List <Viaje> agenda;
	
	public Vehiculo (){
		this.agenda = new ArrayList <Viaje>();
	}
	
	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getCedulaVerde() {
		return cedulaVerde;
	}

	public void setCedulaVerde(String cedulaVerde) {
		this.cedulaVerde = cedulaVerde;
	}

	public Date getVencimientoCedulaVerde() {
		return vencimientoCedulaVerde;
	}

	public void setVencimientoCedulaVerde(Date vencimientoCedulaVerde) {
		this.vencimientoCedulaVerde = vencimientoCedulaVerde;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getTara() {
		return tara;
	}

	public void setTara(float tara) {
		this.tara = tara;
	}

	public float getVolumenDeCarga() {
		return volumenDeCarga;
	}

	public void setVolumenDeCarga(float volumenDeCarga) {
		this.volumenDeCarga = volumenDeCarga;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public float getDisponibilidadVolumen() {
		return disponibilidadVolumen;
	}

	public void setDisponibilidadVolumen(float disponibilidadVolumen) {
		this.disponibilidadVolumen = disponibilidadVolumen;
	}

	public float getDisponibilidadTara() {
		return disponibilidadTara;
	}

	public void setDisponibilidadTara(float disponibilidadTara) {
		this.disponibilidadTara = disponibilidadTara;
	}

	public float getCapacidadDisponible() {
		return capacidadDisponible;
	}

	public void setCapacidadDisponible(float capacidadDisponible) {
		this.capacidadDisponible = capacidadDisponible;
	}

	public void generarPlanMantenimiento()
	{
	
	}
	
	public float avancePlanMantenimiento()
	{
		return anio;
	
	}

	public boolean isEnMantenimiento() {
		return enMantenimiento;
	}

	public void setEnMantenimiento(boolean enMantenimiento) {
		this.enMantenimiento = enMantenimiento;
	}

	public boolean isEnViaje() {
		return enViaje;
	}

	public void setEnViaje(boolean enViaje) {
		this.enViaje = enViaje;
	}
	
	
	public static List <VehiculoDto> listarBeanADto(List <VehiculoBean> listaBean){
		List <VehiculoDto> listaDto = new ArrayList <VehiculoDto>();
		for(int i=0;i<listaBean.size();i++){
			VehiculoBean vehiculoBean = listaBean.get(i);
			VehiculoDto vehiculoDto = 
					new VehiculoDto(vehiculoBean.getDominio(), vehiculoBean.getMarca(), vehiculoBean.getModelo(), vehiculoBean.getAnio(), vehiculoBean.getCedulaVerde(),
					vehiculoBean.getVencimientoCedulaVerde(), vehiculoBean.getPeso(), vehiculoBean.getTara(), vehiculoBean.getVolumenDeCarga(), vehiculoBean.getCaracteristicas(),
					vehiculoBean.getDisponibilidadVolumen(), vehiculoBean.getDisponibilidadTara(), vehiculoBean.getCapacidadDisponible(), vehiculoBean.isEnMantenimiento(), vehiculoBean.isEnViaje());
					vehiculoDto.setAnio(listaDto.get(i).getAnio());
			listaDto.add(vehiculoDto);
		}
		return listaDto;
	}

	public List <Viaje> getHistorial() {
		return agenda;
	}

	public void setHistorial(List <Viaje> historial) {
		this.agenda = historial;
	}


}
