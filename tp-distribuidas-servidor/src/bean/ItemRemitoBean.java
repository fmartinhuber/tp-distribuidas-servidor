package bean;

import javax.persistence.*;

@Entity
@Table(name="ItemRemito")
public class ItemRemitoBean{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int idItemRemito;
	private int cantidad;
	@OneToOne
	@JoinColumn(name="idCarga")
		private CargaBean carga;
	
	
	
	public ItemRemitoBean(int idItemRemito, int cantidad, CargaBean carga) {
		super();
		this.idItemRemito = idItemRemito;
		this.cantidad = cantidad;
		this.carga = carga;
	}
	
	public ItemRemitoBean() {

	}

	public int getIdItemRemito() {
		return idItemRemito;
	}

	public void setIdItemRemito(int idItemRemito) {
		this.idItemRemito = idItemRemito;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public CargaBean getCarga() {
		return carga;
	}

	public void setCarga(CargaBean carga) {
		this.carga = carga;
	}	
	
}

