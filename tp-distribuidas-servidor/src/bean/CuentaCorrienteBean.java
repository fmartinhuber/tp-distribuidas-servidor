package bean;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="CuentaCorriente")
public class CuentaCorrienteBean{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer idCuentaCorriente;
	private float saldo;
	private Integer numero;
	@OneToMany (cascade=CascadeType.ALL, mappedBy="cuentascorrientes")
		private List<MovimientoBean> movimientos = new ArrayList<MovimientoBean>();
	
	
	
	public CuentaCorrienteBean(float saldo, Integer numero,	List<MovimientoBean> movimientos) {
		this.saldo = saldo;
		this.numero = numero;
		this.movimientos = movimientos;
	}
	
	public CuentaCorrienteBean() {
		
	}

	public Integer getIdCuentaCorriente() {
		return idCuentaCorriente;
	}

	public void setIdCuentaCorriente(Integer idCuentaCorriente) {
		this.idCuentaCorriente = idCuentaCorriente;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public List<MovimientoBean> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<MovimientoBean> movimientos) {
		this.movimientos = movimientos;
	}
	
}
