package bean;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="ViajeVehiculoPropio")
public class ViajeVehiculoPropioBean extends ViajeBean{
	
	private static final long serialVersionUID = 1L;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idVehiculo")
		private VehiculoBean vehiculo;
	
	
}
