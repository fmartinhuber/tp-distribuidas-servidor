package bean;
import java.util.List;

import javax.persistence.*;

public class CuentaCorrienteBean{
	private float saldo;
	private int numero;
	private List<MovimientoBean> movimientos;
}
