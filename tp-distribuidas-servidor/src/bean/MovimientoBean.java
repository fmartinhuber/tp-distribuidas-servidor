package bean;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Movimiento")
public class MovimientoBean{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int idMovimiento;
	private int valor;
	private String estado;
	private String concepto;
	private Date fecha;
	@ManyToOne
	@JoinColumn(name="idCuentaCorriente", nullable=false)
		private CuentaCorrienteBean cuentascorrientes;
	
	
	
	public MovimientoBean(int idMovimiento, int valor, String estado,
			String concepto, Date fecha, CuentaCorrienteBean cuentascorrientes) {
		super();
		this.idMovimiento = idMovimiento;
		this.valor = valor;
		this.estado = estado;
		this.concepto = concepto;
		this.fecha = fecha;
		this.cuentascorrientes = cuentascorrientes;
	}

	public MovimientoBean() {
		
	}

	public int getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public CuentaCorrienteBean getCuentascorrientes() {
		return cuentascorrientes;
	}

	public void setCuentascorrientes(CuentaCorrienteBean cuentascorrientes) {
		this.cuentascorrientes = cuentascorrientes;
	}
		
}
