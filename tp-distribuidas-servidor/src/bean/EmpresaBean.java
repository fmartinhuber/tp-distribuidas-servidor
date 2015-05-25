package bean;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Empresa")
public class EmpresaBean extends ClienteBean{
	
	private String razonSocial;
	@OneToOne
	@JoinColumn(name="idDireccion")
		private DireccionBean domicilioComercial;
	private String condiciónIVA;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idDireccionHabilitada")
		public List<DireccionBean> destinosHabilitados;
	
	
	
	public EmpresaBean(String tipoDocumento, String nroDocumento, List<HabilitadoBean> habilitados) {
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

	public String getCondiciónIVA() {
		return condiciónIVA;
	}

	public void setCondiciónIVA(String condiciónIVA) {
		this.condiciónIVA = condiciónIVA;
	}

	public List<DireccionBean> getDestinosHabilitados() {
		return destinosHabilitados;
	}

	public void setDestinosHabilitados(List<DireccionBean> destinosHabilitados) {
		this.destinosHabilitados = destinosHabilitados;
	}
	
}
