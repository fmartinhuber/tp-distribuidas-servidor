package bean;

import javax.persistence.*;

@Entity
@Table(name="Direccion")
public class DireccionBean
{
	@Id 
	@GeneratedValue( strategy = GenerationType.AUTO)
		private int idDireccion;
	private String pais;
	private String provincia;
	private String localidad;
	private int codigoPostal;
	private String calle;
	private int numero;
	private int piso;
	private String departamento;
}
