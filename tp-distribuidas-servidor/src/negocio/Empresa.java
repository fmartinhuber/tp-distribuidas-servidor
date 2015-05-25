package negocio;
import java.util.List;

import rmi.ICliente;
import dto.ClienteDto;

public class Empresa extends Cliente implements ICliente{
	
	private String razonSocial;
	private Direccion domicilioComercial;
	private String condici�nIVA;
	public List<Direccion> destinosHabilitados;
	
	public Empresa(ClienteDto clienteDto, String razonSocial, Direccion domicilioComercial, String condici�nIVA,
			List<Direccion> destinosHabilitados) {
		super(clienteDto);
		this.razonSocial = razonSocial;
		this.domicilioComercial = domicilioComercial;
		this.condici�nIVA = condici�nIVA;
		this.destinosHabilitados = destinosHabilitados;
	}
	
	public Empresa() {
		
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public Direccion getDomicilioComercial() {
		return domicilioComercial;
	}

	public void setDomicilioComercial(Direccion domicilioComercial) {
		this.domicilioComercial = domicilioComercial;
	}

	public String getCondici�nIVA() {
		return condici�nIVA;
	}

	public void setCondici�nIVA(String condici�nIVA) {
		this.condici�nIVA = condici�nIVA;
	}

	public List<Direccion> getDestinosHabilitados() {
		return destinosHabilitados;
	}

	public void setDestinosHabilitados(List<Direccion> destinosHabilitados) {
		this.destinosHabilitados = destinosHabilitados;
	}
	
}
