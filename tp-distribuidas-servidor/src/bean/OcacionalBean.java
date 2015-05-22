package bean;

import java.util.List;

import javax.persistence.*;

public class OcacionalBean extends EmpresaBean
{

	public OcacionalBean(String tipoDocumento, String nroDocumento,
			List<HabilitadoBean> habilitados) {
		super(tipoDocumento, nroDocumento, habilitados);
		// TODO Auto-generated constructor stub
	}
}
