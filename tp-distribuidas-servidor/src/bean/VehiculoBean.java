package bean;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Vehiculo")
public class VehiculoBean{
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
		private int idVehiculo;
	
	private String dominio;
	private String marca;
	private String modelo;
	private int anio;
	private int cedulaVerde;
	private Date vencimientoCedulaVerde;
	private float peso;
	private float tara;
	private float volumenDeCarga;
	private String caracteristicas;
	private String PlanMantenimientoBean;
	private float disponibilidadVolumen;
	private float disponibilidadTara;
	private float capacidadDisponible;
	private boolean enMantenimiento;
	private boolean enViaje;
	
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
	public int getCedulaVerde() {
		return cedulaVerde;
	}
	public void setCedulaVerde(int cedulaVerde) {
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
	public boolean isEnViaje() {
		return enViaje;
	}
	public void setEnViaje(boolean enViaje) {
		this.enViaje = enViaje;
	}
	public boolean isEnMantenimiento() {
		return enMantenimiento;
	}
	public void setEnMantenimiento(boolean enMantenimiento) {
		this.enMantenimiento = enMantenimiento;
	}
	public String getPlanMantenimientoBean() {
		return PlanMantenimientoBean;
	}
	public void setPlanMantenimientoBean(String planMantenimientoBean) {
		PlanMantenimientoBean = planMantenimientoBean;
	}
	
}
