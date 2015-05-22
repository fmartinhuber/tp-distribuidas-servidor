package bean;

import javax.persistence.*;

public class ItemRemitoBean{
	private int cantidad;
	private CargaBean carga;
	
	public ItemRemitoBean(int cantidad, CargaBean carga) {
		super();
		this.cantidad = cantidad;
		this.carga = carga;
	}

	
	
}

