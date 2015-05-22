package bean;

import java.util.List;

import javax.persistence.*;

public class RegularBean extends EmpresaBean
{
	public RegularBean(String tipoDocumento, String nroDocumento,
			List<HabilitadoBean> habilitados) {
		super(tipoDocumento, nroDocumento, habilitados);
		// TODO Auto-generated constructor stub
	}
	private CuentaCorrienteBean cuentaCorriente;
	private String modoPago;
	private float montoAutorizacion;
	public boolean verificarMonto(float valor)
	{
		return false;
	
	}
}
