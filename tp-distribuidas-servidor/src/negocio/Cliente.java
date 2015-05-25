package negocio;

import java.util.ArrayList;
import java.util.List;

import rmi.ICliente;
import dao.ClienteDao;
import dto.ClienteDto;
import dto.HabilitadoDto;
import bean.ClienteBean;
import bean.HabilitadoBean;

public class Cliente implements ICliente{
	
	private String tipoDocumento;
	private String nroDocumento;
	
	//Asi estaba antes:
	//private List<HabilitadoBean> habilitados; 
	//Daro: La clase de negocio tiene que tener un bean como lista???, no deberia tener HabilitadoNEGOCIO???
	
	public Cliente (ClienteDto clienteDto) {
		this.tipoDocumento = clienteDto.getTipoDocumento();
		this.nroDocumento = String.valueOf(clienteDto.getNroDocumento());
		//Asi estaba antes, esta linea estaba comentada porque rompia:
		//this.habilitados = clienteDto.getHabilitados();
		//Daro: Aca como hacemos para pasar la lista de HabilitadosDTO a la lista de habilitadosNEGOCIO ???
	}
	
	public Cliente(){
	
	}
	
	/*public void guardar(){
		ClienteBean clienteBean = new ClienteBean (this.tipoDocumento, this.nroDocumento);
		ClienteDao.getInstancia().guardar(clienteBean);
	}*/
	
	public void guardar(){
		
	}
	
	public ClienteBean obtenerCliente(String dni) {
		return ClienteDao.getInstancia().obtener(dni); 
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
	
//Asi estaba antes	
/*
	public List<HabilitadoBean> getHabilitados() {
		return habilitados;
	}
	
	public void setHabilitados(List<HabilitadoBean> habilitados) {
		this.habilitados = habilitados;
	}

	public void guardar(){
		ClienteBean clienteBean = new ClienteBean (this.tipoDocumento, this.tipoDocumento, this.habilitados);
		ClienteDao.getInstancia().guardar(clienteBean);
	}
*/	

	//Este metodo pasa la lista HabilitadoDto a HabilitadoNegocio
	public List<Habilitado> clienteDtoTOClienteNegocio_Habilitado (List<HabilitadoDto> habilitadoDto){
		List<Habilitado> habilitadoNegocio = new ArrayList<Habilitado>();
		for (int i = 0; i < habilitadoDto.size(); i++){
			Habilitado habneg = new Habilitado (habilitadoDto.get(i).getTipoDocumento(), habilitadoDto.get(i).getNroDocumento(), habilitadoDto.get(i).getApellidoNombre());
			habilitadoNegocio.add(habneg);
		}
		return habilitadoNegocio;
	}
	
	//Este metodo pasa la lista HabilitadoNegocio a HabilitadoBean
	public List<HabilitadoBean> clienteNegocioTOClienteBean_Habilitado (List<Habilitado> habilitadoNegocio){
		List<HabilitadoBean> habilitadoBean = new ArrayList<HabilitadoBean>();
		for (int i = 0; i < habilitadoNegocio.size(); i++){
			HabilitadoBean habbea = new HabilitadoBean (habilitadoNegocio.get(i).getTipoDocumento(), habilitadoNegocio.get(i).getNroDocumento(), habilitadoNegocio.get(i).getApellidoNombre());
			habilitadoBean.add(habbea);
		}
		return habilitadoBean;
	}
}
