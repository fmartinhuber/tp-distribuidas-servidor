package bean;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Servicio")
public class ServicioBean{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int idServicio;
	private String tipoServicio;
	private String denominacion;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idCosto")
		private List<CostoBean> costos;
	
	public ServicioBean(String tipoServicio, String denominacion, List<CostoBean> costos) {
		super();
		this.tipoServicio = tipoServicio;
		this.denominacion = denominacion;
		this.costos = costos;
	}
	
	public ServicioBean() {
		
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public List<CostoBean> getCostos() {
		return costos;
	}

	public void setCostos(List<CostoBean> costos) {
		this.costos = costos;
	}

}
