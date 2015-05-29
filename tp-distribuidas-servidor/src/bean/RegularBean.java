package bean;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="Empresa_Regular")
public class RegularBean extends EmpresaBean{

	private static final long serialVersionUID = 1L;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idCuentaCorriente")
		private CuentaCorrienteBean cuentaCorriente;
	private String modoPago;
	private float montoAutorizacion;
	
	public RegularBean(String tipoDocumento, String nroDocumento, CuentaCorrienteBean cuentaCorriente, 
			String modoPago, float montoAutorizacion) {
		super(tipoDocumento, nroDocumento);
		this.cuentaCorriente = cuentaCorriente;
		this.modoPago = modoPago;
		this.montoAutorizacion = montoAutorizacion;
	}

	public CuentaCorrienteBean getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setCuentaCorriente(CuentaCorrienteBean cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}

	public String getModoPago() {
		return modoPago;
	}

	public void setModoPago(String modoPago) {
		this.modoPago = modoPago;
	}

	public float getMontoAutorizacion() {
		return montoAutorizacion;
	}

	public void setMontoAutorizacion(float montoAutorizacion) {
		this.montoAutorizacion = montoAutorizacion;
	}

}
