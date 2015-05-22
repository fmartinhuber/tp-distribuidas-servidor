package bean;

import javax.persistence.*;

@Entity
@Table(name="Dimension")
public class DimensionBean{
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
		private int idDimension;
	private float alto;
	private float ancho;
	private float profundidad;
	private float peso;
	private float volumen;
		
	public DimensionBean(float alto, float ancho, float profundidad, float peso, float volumen) {
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.peso = peso;
		this.volumen = volumen;
	}

	public DimensionBean (){
		
	}

	public int getIdDimension() {
		return idDimension;
	}

	public void setIdDimension(int idDimension) {
		this.idDimension = idDimension;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public float getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getVolumen() {
		return volumen;
	}

	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}

}
