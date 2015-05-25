package bean;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

public abstract class ViajeBean{
	
	private SucursalBean sucursalOrigen;
	private SucursalBean sucursalDestino;
	private Date fechaPartida;
	private Date fechaArribo;
	private List<ServicioBean> serviciosAdicionales;
	private List<SolicitudDeCargaBean> solicitudesDeCarga;
	private Date fechaPrioridad;
	
	
}
