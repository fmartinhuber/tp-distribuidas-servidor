package negocio;

public class Habilitado{
	
	private String tipoDocumento;
	private String nroDocumento;
	private String apellidoNombre;
	
	public Habilitado (String tipoDocumento, String nroDocumento, String apellidoNombre) {
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.apellidoNombre = apellidoNombre;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getApellidoNombre() {
		return apellidoNombre;
	}

	public void setApellidoNombre(String apellidoNombre) {
		this.apellidoNombre = apellidoNombre;
	}	
	
}
