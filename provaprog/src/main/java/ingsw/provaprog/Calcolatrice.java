package ingsw.provaprog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calcolatrice {
	
	private static Logger logger = LogManager.getLogger(Calcolatrice.class);
	
	public int somma(int a, int b) {
		logger.debug("Eseguo la somma di " + a + " e " + b);
		return a + b;
	}
	
	public int prodotto(int a, int b) {
		logger.debug("Eseguo il prodotto di " + a + " e " + b);
		return a * b;
	}
	
	public int differenza(int a, int b) {
		logger.debug("Eseguo la differenza di " + a + " e " + b);
		return a - b;
	}
	
	public double quoziente(int a, int b) {
		logger.debug("Eseguo il quoziente di " + a + " e " + b);
		return (double) a / b;
	}
}
