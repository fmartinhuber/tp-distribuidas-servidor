package bean;
import java.util.Date;

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
	
	
	
	public CostoBean(float tarifa, String unidadTarifa, Date vigencia, 	String condicionPago) {
		this.tarifa = tarifa;
		this.unidadTarifa = unidadTarifa;
		this.vigencia = vigencia;
		this.condicionPago = condicionPago;
	}

	public CostoBean() {
		
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

}
