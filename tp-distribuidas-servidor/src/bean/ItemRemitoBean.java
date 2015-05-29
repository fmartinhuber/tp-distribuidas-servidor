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
	
	public ItemRemitoBean(int cantidad, CargaBean carga) {
		this.cantidad = cantidad;
		this.carga = carga;
	}

	
	
}

