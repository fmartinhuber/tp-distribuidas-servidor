package test;

import rmi.BusinessServer;

public abstract class MainRmiS {
	public static void main(String[] args) {

		//RMI + HBT
		new BusinessServer().publicarServicio();
		
	}

}
