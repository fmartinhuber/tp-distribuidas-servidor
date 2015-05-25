package rmi;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import negocio.AdministradorVarios;
import negocio.AdministradorViaje;


public class BusinessServer {

	
	
	public void publicarServicio(){
		
		try {
			
			IAdministradorVarios administradorV = AdministradorVarios.getInstancia();
			IAdministradorViaje administradorViaje = AdministradorViaje.getInstancia();
			System.out.println(IAdministradorVarios.class.toString());
			System.out.println(IAdministradorVarios.class.getProtectionDomain().getCodeSource().getLocation().toString());
			
			//propiedad para enlazar un archivo de texto "java.policy" con la propiedad de java. 
			System.setProperty("java.security.policy", "java.policy");
			System.setProperty("java.rmi.server.codebase", IAdministradorVarios.class.getProtectionDomain().getCodeSource().getLocation().toString());
	        
			if(System.getSecurityManager() == null) {
				//Establece un sistema de seguridad. 
	            //System.setSecurityManager(new SecurityManager());
	        } 
			
			//genera un "stub", STUB trabaja como si fuera un proxy. Exporta el objeto calculable. 
			//Se define el STUB. 
			IAdministradorVarios stubAdmVarios = (IAdministradorVarios) UnicastRemoteObject.exportObject(administradorV, 0);
			IAdministradorViaje stubAdmViaje = (IAdministradorViaje) UnicastRemoteObject.exportObject(administradorViaje, 0);
			//POne en memoria a la registry de RMI. 
			//Sirve para publicar servicios. 
			//Si el registry ya existe, se debe usar el GetRegistry. 
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			//Hace la union entre el objeto y el nombre. (servicio de nombrado) 
			//bind y rebind hacen lo mismo. Rebind registra con un nombre el objeto, pero si el nombre existe lo reemplaza. 
			Naming.rebind("//localhost/AdministradorVarios", stubAdmVarios);
			Naming.rebind("//localhost/AdministradorViaje", stubAdmViaje);
			verVinculos();
		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}
	}
	public void verVinculos() {
        try {
      	  String[] vinculos = Naming.list( "" );
      	  System.out.println(InetAddress.getLocalHost().getHostAddress());
      	  for ( int i = 0; i < vinculos.length; i++ ){
      		System.out.print( "\n"+vinculos[i] );
      	  }
        }
        catch (Exception e) {
      	  e.printStackTrace();
        }
     }
    
    public void cerrar() {
		try {
			Naming.unbind("AdministradorVarios");
			Naming.unbind("AdministradorViaje");
		} catch (Exception e) {
		} finally {
			System.exit(0);
		}
    }

}