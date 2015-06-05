package bean;

import javax.persistence.*;

@Entity
@Table(name="Direccion")
public class DireccionBean{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer idDireccion;
	private String pais;
	private String provincia;
	private String localidad;
	private int codigoPostal;
	private String calle;
	private int numero;
	private int piso;
	private String departamento;
	@ManyToOne
	@JoinColumn(name="idEmpresa")//, nullable=false) //Rompe al poner null nose porque, safamos asi, despues ver
		private EmpresaBean empresas;
	
	
	
	public Integer getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public EmpresaBean getEmpresas() {
		return empresas;
	}
	public void setEmpresas(EmpresaBean empresas) {
		this.empresas = empresas;
	}


	
}
