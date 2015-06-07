package bean;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue("ConRetiro")
@Table(name="SolicitudDeCargaConRetiro")
public class SolicitudDeCargaConRetiroBean extends SolicitudDeCargaBean{
	
	@OneToOne
	@JoinColumn(name="idDireccion", nullable=true)
		private DireccionBean domicilioCarga;
	private Date fechaRetiro;
	private String rangoHorario;
	
	
	
	public SolicitudDeCargaConRetiroBean(ClienteBean cliente,
			List<CargaBean> cargas, List<HabilitadoBean> habilitado,
			DireccionBean destino, Date fechaEntregaProbable,
			Date fechaEntregaMaxima, String manifiesto, String estadoSolicitud,
			DireccionBean domicilioCarga, Date fechaRetiro, String rangoHorario) {
		super(cliente, cargas, habilitado, destino, fechaEntregaProbable,
				fechaEntregaMaxima, manifiesto, estadoSolicitud);
		this.domicilioCarga = domicilioCarga;
		this.fechaRetiro = fechaRetiro;
		this.rangoHorario = rangoHorario;
	}
	
	public SolicitudDeCargaConRetiroBean() {
		
	}

	public DireccionBean getDomicilioCarga() {
		return domicilioCarga;
	}

	public void setDomicilioCarga(DireccionBean domicilioCarga) {
		this.domicilioCarga = domicilioCarga;
	}

	public Date getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(Date fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

	public String getRangoHorario() {
		return rangoHorario;
	}

	public void setRangoHorario(String rangoHorario) {
		this.rangoHorario = rangoHorario;
	}
	
}
