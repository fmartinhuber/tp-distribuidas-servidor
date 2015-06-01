package bean;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Deposito")
public class DepositoBean{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int idDeposito;
	private String nombreDeposito;
	@OneToMany (cascade=CascadeType.ALL, mappedBy="depositos")
		private List<CargaBean> cargas = new ArrayList<CargaBean>();
	
	
	
	public DepositoBean(int idDeposito, String nombreDeposito, List<CargaBean> cargas) {
		this.idDeposito = idDeposito;
		this.nombreDeposito = nombreDeposito;
		this.cargas = cargas;
	}
	
	public DepositoBean() {
	
	}

	public int getIdDeposito() {
		return idDeposito;
	}

	public void setIdDeposito(int idDeposito) {
		this.idDeposito = idDeposito;
	}

	public String getNombreDeposito() {
		return nombreDeposito;
	}

	public void setNombreDeposito(String nombreDeposito) {
		this.nombreDeposito = nombreDeposito;
	}

	public List<CargaBean> getCargas() {
		return cargas;
	}

	public void setCargas(List<CargaBean> cargas) {
		this.cargas = cargas;
	}
	
}
