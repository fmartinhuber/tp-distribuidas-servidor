package negocio;

import java.util.ArrayList;
import java.util.List;

import rmi.ICliente;
import bean.DireccionBean;
import bean.HabilitadoBean;
import bean.ParticularBean;
import dao.DireccionDao;
import dao.ParticularDao;
import dto.ClienteDto;
import dto.DireccionDto;
import dto.HabilitadoDto;
import dto.ParticularDto;

public class Particular extends Cliente implements ICliente{
	
	private String apellido;
	private String nombre;
	private Direccion direccion;
	
	public Particular(ParticularDto miParticularDto) {
		super(new ClienteDto(miParticularDto.getTipoDocumento(), miParticularDto.getNroDocumento()));
		this.apellido = miParticularDto.getApellido();
		this.nombre = miParticularDto.getNombre();
		this.direccion = this.particularDtoTOParticularNegocio_Direccion(miParticularDto.getDireccion());
	}
	
	public Particular() {
		
	}
	
	public void guardar(){
		ParticularBean miParticularBean = new ParticularBean();
		miParticularBean.setApellido(this.apellido);
		miParticularBean.setDireccionBean(particularNegocioTOParticularBean_Direccion(this.direccion));
		miParticularBean.setNombre(this.nombre);
		ParticularDao.getInstancia().guardar(miParticularBean);
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	//Este metodo pasa la lista DireccionDto a DireccionNegocio
	public Direccion particularDtoTOParticularNegocio_Direccion (DireccionDto direccionDto){
		Direccion dirneg = new Direccion ();
		dirneg.setCalle(direccionDto.getCalle());
		dirneg.setCodigoPostal(direccionDto.getCodigoPostal());
		dirneg.setDepartamento(direccionDto.getDepartamento());
		dirneg.setLocalidad(direccionDto.getLocalidad());
		dirneg.setNumero(direccionDto.getNumero());
		dirneg.setPais(direccionDto.getPais());
		dirneg.setPiso(direccionDto.getPiso());
		dirneg.setProvincia(direccionDto.getProvincia());
	return dirneg;
	}
	
	//Este metodo pasa la lista DireccionNegocio a DireccionBean
	public DireccionBean particularNegocioTOParticularBean_Direccion (Direccion direccionNegocio){
		DireccionBean dirbean = new DireccionBean();
		dirbean.setCalle(direccionNegocio.getCalle());
		dirbean.setCodigoPostal(direccionNegocio.getCodigoPostal());
		dirbean.setDepartamento(direccionNegocio.getDepartamento());
		dirbean.setLocalidad(direccionNegocio.getLocalidad());
		dirbean.setNumero(direccionNegocio.getNumero());
		dirbean.setPais(direccionNegocio.getPais());
		dirbean.setPiso(direccionNegocio.getPiso());
		dirbean.setProvincia(direccionNegocio.getProvincia());
	return dirbean;
	}
			
}
