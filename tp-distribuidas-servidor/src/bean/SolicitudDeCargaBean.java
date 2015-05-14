package bean;
import java.io.File;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class SolicitudDeCargaBean {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int idSolicitudDeCarga;
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
		private ClienteBean cliente;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idCarga")
		private List<CargaBean> cargas;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idHabilitado")
		private List<HabilitadoBean> habilitado;
	
	
	private DireccionBean destino;
	private Date fechaEntregaProbable;
	private Date fechaEntregaMaxima;
	private File manifiesto;
	private String estadoSolicitud;
	public void addCarga(CargaBean carga)
	{
	
	}
	
	private void nuevoDestinio(DireccionBean domicilio)
	{
	
	}
	
	private ClienteBean buscarCliente(int cuit)
	{
		return cliente;
	
	}
	
	public void actualizarEstado(String estado)
	{
	
	}
}
