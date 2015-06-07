package bean;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Empresa")
@Table(name="Empresa")
public class EmpresaBean extends ClienteBean{
	
	private String razonSocial;
	@OneToOne
	@JoinColumn(name="idDireccion", nullable=true)
		private DireccionBean domicilioComercial;
	private String condici�nIVA;
	/*@OneToMany (cascade=CascadeType.ALL, mappedBy="empresas")
		public List<DireccionBean> destinosHabilitados = new ArrayList<DireccionBean>();*/
	
	
	
	public EmpresaBean(String tipoDocumento, String nroDocumento) {
		super(tipoDocumento, nroDocumento);
	}
	
	public EmpresaBean() {
		
	}
		
	public void addDestino(DireccionBean domicilio){
	
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public DireccionBean getDomicilioComercial() {
		return domicilioComercial;
	}

	public void setDomicilioComercial(DireccionBean domicilioComercial) {
		this.domicilioComercial = domicilioComercial;
	}

	public String getCondici�nIVA() {
		return condici�nIVA;
	}

	public void setCondici�nIVA(String condici�nIVA) {
		this.condici�nIVA = condici�nIVA;
	}

	/*public List<DireccionBean> getDestinosHabilitados() {
		return destinosHabilitados;
	}

	public void setDestinosHabilitados(List<DireccionBean> destinosHabilitados) {
		this.destinosHabilitados = destinosHabilitados;
	}*/
	
}
