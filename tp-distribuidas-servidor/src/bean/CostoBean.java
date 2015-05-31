package bean;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="Costo")
public class CostoBean{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int idCosto;
	private float tarifa;
	private String unidadTarifa;
	private Date vigencia;
	private String condicionPago;
	
	@ManyToOne
	@JoinColumn(name="idServicio", nullable=false)
		private ServicioBean servicios;

	
	
	public CostoBean(int idCosto, float tarifa, String unidadTarifa,
			Date vigencia, String condicionPago, ServicioBean servicios) {
		super();
		this.idCosto = idCosto;
		this.tarifa = tarifa;
		this.unidadTarifa = unidadTarifa;
		this.vigencia = vigencia;
		this.condicionPago = condicionPago;
		this.servicios = servicios;
	}

	public CostoBean() {
		
	}

	public int getIdCosto() {
		return idCosto;
	}

	public void setIdCosto(int idCosto) {
		this.idCosto = idCosto;
	}

	public float getTarifa() {
		return tarifa;
	}

	public void setTarifa(float tarifa) {
		this.tarifa = tarifa;
	}

	public String getUnidadTarifa() {
		return unidadTarifa;
	}

	public void setUnidadTarifa(String unidadTarifa) {
		this.unidadTarifa = unidadTarifa;
	}

	public Date getVigencia() {
		return vigencia;
	}

	public void setVigencia(Date vigencia) {
		this.vigencia = vigencia;
	}

	public String getCondicionPago() {
		return condicionPago;
	}

	public void setCondicionPago(String condicionPago) {
		this.condicionPago = condicionPago;
	}

	public ServicioBean getServicios() {
		return servicios;
	}

	public void setServicios(ServicioBean servicios) {
		this.servicios = servicios;
	}
	
}
