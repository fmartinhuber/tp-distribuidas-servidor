package bean;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Servicio")
public class ServicioBean{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name="idServicio")
		private int idServicio;
	private String tipoServicio;
	private String denominacion;
	@OneToMany (cascade=CascadeType.ALL, mappedBy="servicios")
		private List<CostoBean> costos = new ArrayList<CostoBean>();
	@ManyToOne
	@JoinColumn(name="idViaje", nullable=false)
		private ViajeBean viajes_servicios;
	@ManyToOne
	@JoinColumn(name="idProveedor", nullable=false)
		private ProveedorBean proveedores;
	
	
	
	
	public int getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
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
