package test;

import negocio.Cliente;
import dto.ClienteDto;
import rmi.BusinessServer;

public abstract class MainRmiS {
	public static void main(String[] args) {

		//RMI + HBT
		new BusinessServer().publicarServicio();
		
		
		
		//Prueba dario, pegandole directamente al servidor sin pasar por rmi, para debugear entitys
		ClienteDto miClienteDto = new ClienteDto("dni", "34000000");
		Cliente miClienteNegocio = new Cliente(miClienteDto);
		miClienteNegocio.guardar();
	}

}
