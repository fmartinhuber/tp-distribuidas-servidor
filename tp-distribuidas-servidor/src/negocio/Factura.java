package negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
	private Date fecha; 
	private Cliente cliente; 
	private List <ItemFactura> items; 
	private Costo costo;
	private Factura(){
		items = new ArrayList <ItemFactura>();
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<ItemFactura> getItems() {
		return items;
	}
	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}
	public Costo getCosto() {
		return costo;
	}
	public void setCosto(Costo costo) {
		this.costo = costo;
	}
	
}
