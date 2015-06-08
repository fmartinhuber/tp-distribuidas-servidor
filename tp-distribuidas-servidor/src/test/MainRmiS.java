package test;

import negocio.Particular;
import dto.DireccionDto;
import dto.ParticularDto;
import rmi.BusinessServer;

public abstract class MainRmiS {
	public static void main(String[] args) {

		//RMI + HBT
		new BusinessServer().publicarServicio();
		
		
		//SI QUERES PROBAR COMO FUNCIONA DESCOMENTA ESTA PARTE
		
		//Prueba by Daro, pegandole directamente al servidor sin pasar por rmi, para debugear entitys, esto funciona bien
		DireccionDto miDireccionDto = new DireccionDto("Argentina", "Buenos Aires", "Flores", 1440, "Rivadavia", 7090, 4, "4B");
		ParticularDto miParticularDto = new ParticularDto("dni", "12345678", "Perez", "Juan", miDireccionDto);
		Particular miParticularNegocio = new Particular(miParticularDto);
		miParticularNegocio.guardar(miParticularDto.getTipoDocumento(), miParticularDto.getNroDocumento());
		
		//OJO!, si haces inserts hardcodeados desde el codigo como este antes de insertar los valores por sql en la BD puede haber inconsistencias
		
	}

}
