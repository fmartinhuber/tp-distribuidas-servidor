package bean;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Deposito")
public class DepositoBean{
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
		private int idDeposito;
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="idDeposito")
		private List<CargaBean> cargas;
	
	
	
	public DepositoBean(int idDeposito, List<CargaBean> cargas) {
		this.idDeposito = idDeposito;
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

	public List<CargaBean> getCargas() {
		return cargas;
	}

	public void setCargas(List<CargaBean> cargas) {
		this.cargas = cargas;
	}
	
}
