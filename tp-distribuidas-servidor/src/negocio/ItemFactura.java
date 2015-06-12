package negocio;

public class ItemFactura {

	private SolicitudDeCarga SolicitudDeCarga;
	
	private Costo costo;


	public SolicitudDeCarga getSolicitudDeCarga() {
		return SolicitudDeCarga;
	}

	public void setSolicitudDeCarga(SolicitudDeCarga solicitudDeCarga) {
		SolicitudDeCarga = solicitudDeCarga;
	}

	public Costo getCosto() {
		return costo;
	}

	public void setCosto(Costo costo) {
		this.costo = costo;
	} 
}
