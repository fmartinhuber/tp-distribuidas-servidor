package bean;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="ViajeVehiculoContratado")
public class ViajeVehiculoContratadoBean extends ViajeBean{

	private static final long serialVersionUID = 1L;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idProveedor")
		private ProveedorBean proveedor;
	private boolean aereo;
	
	
	
	public ViajeVehiculoContratadoBean(SucursalBean sucursalOrigen,
			Integer nroSucursalDestino, Date fechaPartida, Date fechaArribo,
			List<ServicioBean> serviciosAdicionales,
			List<SolicitudDeCargaBean> solicitudesDeCarga, Date fechaPrioridad,
			ProveedorBean proveedor, boolean aereo) {
		super(sucursalOrigen, nroSucursalDestino, fechaPartida, fechaArribo,
				serviciosAdicionales, solicitudesDeCarga, fechaPrioridad);
		this.proveedor = proveedor;
		this.aereo = aereo;
	}

	public ViajeVehiculoContratadoBean() {
		
	}

	public ProveedorBean getProveedor() {
		return proveedor;
	}

	public void setProveedor(ProveedorBean proveedor) {
		this.proveedor = proveedor;
	}

	public boolean isAereo() {
		return aereo;
	}

	public void setAereo(boolean aereo) {
		this.aereo = aereo;
	}

}
