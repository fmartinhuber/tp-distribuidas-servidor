package bean;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Propio")
@Table(name="ViajeVehiculoPropio")
public class ViajeVehiculoPropioBean extends ViajeBean{
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idVehiculo")
		private VehiculoBean vehiculo;

	
	public ViajeVehiculoPropioBean(SucursalBean sucursalOrigen,
			Integer nroSucursalDestino, Date fechaPartida, Date fechaArribo,
			List<ServicioBean> serviciosAdicionales,
			List<SolicitudDeCargaBean> solicitudesDeCarga, Date fechaPrioridad,
			VehiculoBean vehiculo) {
		super(sucursalOrigen, nroSucursalDestino, fechaPartida, fechaArribo,
				serviciosAdicionales, solicitudesDeCarga, fechaPrioridad);
		this.vehiculo = vehiculo;
	}


	public ViajeVehiculoPropioBean() {
		
	}


	public VehiculoBean getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(VehiculoBean vehiculo) {
		this.vehiculo = vehiculo;
	}
	
}
