package bean;

import java.util.List;

import javax.persistence.*;

public class ParticularBean extends ClienteBean
{
	public ParticularBean(String tipoDocumento, String nroDocumento,
			List<HabilitadoBean> habilitados) {
		super(tipoDocumento, nroDocumento);
		// TODO Auto-generated constructor stub
	}
	private String apellido;
	private String nombre;
	private DireccionBean domicilio;
}
