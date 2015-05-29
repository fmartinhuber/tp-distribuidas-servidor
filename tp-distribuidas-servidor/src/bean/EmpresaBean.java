package bean;
import java.util.List;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="Empresa")
public class EmpresaBean extends ClienteBean{

	private static final long serialVersionUID = 1L;
	
	private String razonSocial;
	@OneToOne
	@JoinColumn(name="idDireccion")
		private DireccionBean domicilioComercial;
	private String condici�nIVA;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idDireccionHabilitada")
		public List<DireccionBean> destinosHabilitados;
	
	
	
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

	public List<DireccionBean> getDestinosHabilitados() {
		return destinosHabilitados;
	}

	public void setDestinosHabilitados(List<DireccionBean> destinosHabilitados) {
		this.destinosHabilitados = destinosHabilitados;
	}
	
}
