package bean;
import java.util.Date;

import javax.persistence.*;

public class SolicitudDeCargaConRetiroBean extends SolicitudDeCargaBean{
	private DireccionBean domicilioCarga;
	private Date fechaRetiro;
	private String rangoHorario;
}
