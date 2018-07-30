package mx.edu.uacm.herencia.domain;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Entidad hija
 * @author Hugo Hernandez
 *
 */
@Entity
@DiscriminatorValue("CC")
public class CuentaCredito extends Cuenta implements Serializable{

	private double limiteCredito;
	
	private static final long serialVersionUID = 1L;

	public CuentaCredito() {
		super();
	}
	
	/**
	 * @return the limiteCredito
	 */
	public double getLimiteCredito() {
		return limiteCredito;
	}

	/**
	 * @param limiteCredito the limiteCredito to set
	 */
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
}
