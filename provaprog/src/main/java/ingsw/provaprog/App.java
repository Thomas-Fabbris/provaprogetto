package ingsw.provaprog;

import java.text.DecimalFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	
    public static void main(String[] args) {
    	int a = 4;
    	int b = 7;
        Calcolatrice c = new Calcolatrice();
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Programma Calcolatrice\n");
        System.out.println(a + " + " + b + " = " + c.somma(a, b));
        System.out.println(a + " - " + b + " = " + c.differenza(a, b));
        System.out.println(a + " * " + b + " = " + c.prodotto(a, b));
        System.out.println(a + " / " + b + " = " + df.format(c.quoziente(a, b)));
    }
    
}
