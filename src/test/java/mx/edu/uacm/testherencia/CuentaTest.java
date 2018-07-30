package mx.edu.uacm.testherencia;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mx.edu.uacm.herencia.HibernateJpaHerenciaSingleTableApplication;
import mx.edu.uacm.herencia.domain.CuentaCredito;
import mx.edu.uacm.herencia.domain.CuentaDebito;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes =HibernateJpaHerenciaSingleTableApplication.class)
public class CuentaTest {

	//public static final Logger log = Logger.getLogger(CuentaTest.class);
	
	@PersistenceContext
	private EntityManager em;

	@Test
	@Transactional
	@Rollback(false)
	public void testGuardarCuenta() {

		//log.debug("");
		CuentaCredito cuentaCredito = new CuentaCredito();
		cuentaCredito.setTitular("Ernesto Maya");
		cuentaCredito.setBalance(70000);
		cuentaCredito.setTipoInteres(0.20);
		cuentaCredito.setLimiteCredito(80000);

		CuentaDebito cuentaDebito = new CuentaDebito();
		cuentaDebito.setTitular("Ernesto Maya");
		cuentaDebito.setBalance(3000);
		cuentaDebito.setCargoPorDescubierto(6.2);
		
		em.persist(cuentaCredito);
		em.persist(cuentaDebito);
		
		
	}

}
/*
Herencia simple table en este mecanismo lo que hariamos seria 
hacer toda la jerarquia de herencias, va ser trasladada a una sola
tabla 
*/