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
@DiscriminatorValue("CD")
public class CuentaDebito extends Cuenta implements Serializable{

	private double cargoPorDescubierto;
	
	private static final long serialVersionUID = 1L;

	public CuentaDebito() {
		super();
	}

	/**
	 * @return the cargoPorDescubierto
	 */
	public double getCargoPorDescubierto() {
		return cargoPorDescubierto;
	}

	/**
	 * @param cargoPorDescubierto the cargoPorDescubierto to set
	 */
	public void setCargoPorDescubierto(double cargoPorDescubierto) {
		this.cargoPorDescubierto = cargoPorDescubierto;
	}
	
	/*
	 * moreunit 3.1.1
	 * ctrl+j crear prueba
	 * ctrl+r correr prueba
	 */
}
