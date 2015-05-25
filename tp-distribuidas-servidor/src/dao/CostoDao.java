package dao;
import java.util.Date;

public class CostoDao
{
	private float tarifa;
	private String unidadTarifa;
	private Date vigencia;
	private String condicionPago;
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
