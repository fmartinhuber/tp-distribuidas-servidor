package bean;
import java.util.List;

import javax.persistence.*;

public class EmpresaBean extends ClienteBean{
	
	private String razonSocial;
	private DireccionBean domicilioComercial;
	private String condici�nIVA;
	public List<DireccionBean> destinosHabilitados;
	
	public EmpresaBean(String tipoDocumento, String nroDocumento, List<HabilitadoBean> habilitados) {
		super(tipoDocumento, nroDocumento);
	}
		
	public void addDestino(DireccionBean domicilio){
	
	}
}
