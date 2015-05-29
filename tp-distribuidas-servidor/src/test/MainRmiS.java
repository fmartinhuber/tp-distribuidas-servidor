package test;

import negocio.Cliente;
import negocio.Particular;
import dao.DireccionDao;
import dto.ClienteDto;
import dto.DireccionDto;
import dto.ParticularDto;
import rmi.BusinessServer;

public abstract class MainRmiS {
	public static void main(String[] args) {

		//RMI + HBT
		new BusinessServer().publicarServicio();
		
		
		
		//Prueba dario, pegandole directamente al servidor sin pasar por rmi, para debugear entitys
		DireccionDto miDireccionDto = new DireccionDto("Argentina", "Buenos Aires", "Parque Chacabuco", 1440, "Las casas", 7090, 4, "4B");
		ParticularDto miParticularDto = new ParticularDto("dni", "34108511", "Nieto", "Dario", miDireccionDto);
		Particular miParticularNegocio = new Particular(miParticularDto);
		miParticularNegocio.guardar(miParticularDto.getTipoDocumento(), miParticularDto.getNroDocumento());
		
		//Cliente no existe, es heredado por Particular y Empresa, cambio todo para que persista Empleados y Particulares
		/*
		ClienteDto miClienteDto = new ClienteDto("dni", "34000000");
		Cliente miClienteNegocio = new Cliente(miClienteDto);
		miClienteNegocio.guardar();
		*/
	}

}
