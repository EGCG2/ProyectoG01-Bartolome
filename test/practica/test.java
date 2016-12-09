package practica;

import org.junit.Test;
import static org.junit.Assert.*;

public class test {

	   @Test
	   public void sumaPositivos() {
	      System.out.println("Sumando dos números positivos ...");
	      
	      Integer primerNumero = 2;
	      Integer segundoNumero = 3;
	      Integer resultado = operation.suma(primerNumero, segundoNumero);
	      
	      assertTrue(resultado==5);
	   }
	   
	   
	   
	   @Test
	   public void restaPositivos() {
	      System.out.println("Restando dos números positivos ...");
	      
	      Integer primerNumero = 3;
	      Integer segundoNumero = 2;
	      Integer resultado = operation.resta(primerNumero, segundoNumero);
	      
	      assertTrue(resultado==1);
	   }

	} 