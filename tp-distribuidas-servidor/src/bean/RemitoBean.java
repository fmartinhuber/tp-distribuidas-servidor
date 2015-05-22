package bean;
import java.util.Date;

import java.util.List;
import javax.persistence.*;

public class RemitoBean
{
	private Object numeroRemito;
	private Date fechaEnvio;
	private ClienteBean remitente;
	private HabilitadoBean destinatario;
	private SucursalBean sucursalOrigen;
	private SucursalBean sucursalDestino;
	private List<ItemRemitoBean> itemsRemito;

	
}
