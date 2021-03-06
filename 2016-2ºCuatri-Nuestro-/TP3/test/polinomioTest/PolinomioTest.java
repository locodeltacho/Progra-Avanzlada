package polinomioTest;

import org.junit.Test;

import junit.framework.Assert;
import polinimio.Polinomio;

@SuppressWarnings("deprecation")
public class PolinomioTest {

	double[] c1 = {4,2,3};	  // grado 2.
	Polinomio p1 = new Polinomio( c1 , c1.length - 1 );  //4*2�+2*2+3

	double[] c2 = {2,0,5,-3}; // grado 4.
	Polinomio p2 = new Polinomio( c2 , c2.length - 1 ); //2*2�+0*2�+5*2-3
	
	double[] c3 = {2,3,4,-5,1,2,-8,12,3,2,0,4,-13}; //  grado 12.
	Polinomio p3 = new Polinomio( c3 , c3.length - 1 ); //2*2^12+3*2^11+4*2^10-5*2^9+1*2^8+2*2^7-8*2^6+12*2^5+3*2^4+2*2�+0*2�+4*2-13
	
	@Test
	public void polinomioEvaluarSucesivas(){

		///Polinomio 1///
		Assert.assertEquals( 23.0  , p1.evaluarMSucesivas(2) );	//p1(2) = 23
		Assert.assertEquals( 345.0 , p1.evaluarMSucesivas(9) );	//p1(9) = 345

		///Polinomio 2///
		Assert.assertEquals( 23.0   , p2.evaluarMSucesivas(2) ); // p2(2) = 23
		Assert.assertEquals( 1500.0 , p2.evaluarMSucesivas(9) ); // p2(9) = 1500
		
		///Polinomio 3///
		Assert.assertEquals( 16315.0, p3.evaluarMSucesivas(2) ); // p2(2) = 23
		Assert.assertEquals( 671061377831.0 , p3.evaluarMSucesivas(9) ); // p2(9) = 1500
		
	}

	@Test
	public void polinomioEvaluarRecursiva(){	

		///Polinomio 1///
		Assert.assertEquals( 23.0  , p1.evaluarRecursiva(2) );	//p1(2) = 23
		Assert.assertEquals( 345.0 , p1.evaluarRecursiva(9) );	//p1(9) = 345

		///Polinomio 2///
		Assert.assertEquals( 23.0   , p2.evaluarRecursiva(2) ); // p2(2) = 23
		Assert.assertEquals( 1500.0 , p2.evaluarRecursiva(9) ); // p2(9) = 1500
	
		///Polinomio 3///
		Assert.assertEquals( 16315.0, p3.evaluarRecursiva(2) ); // p2(2) = 23
		Assert.assertEquals( 671061377831.0 , p3.evaluarRecursiva(9) ); // p2(9) = 1500
		
	}
/*
  	@Test
	public void polinomioEvaluarRecursivaPar(){	

		///Polinomio 1///
		Assert.assertEquals( 23.0  , p1.evaluarRecursivaPar(2) );	//p1(2) = 23
		Assert.assertEquals( 345.0 , p1.evaluarRecursivaPar(9) );	//p1(9) = 345

		///Polinomio 2///
		Assert.assertEquals( 23.0   , p2.evaluarRecursivaPar(2) ); // p2(2) = 23
		Assert.assertEquals( 1500.0 , p2.evaluarRecursivaPar(9) ); // p2(9) = 1500
		
		///Polinomio 3///
		Assert.assertEquals( 16315.0, p3.evaluarRecursivaPar(2) ); // p2(2) = 23
		Assert.assertEquals( 671061377831.0 , p3.evaluarRecursivaPar(9) ); // p2(9) = 1500
	}
  	@Test
	public void polinomioEvaluarProgDinamica(){	

		///Polinomio 1///
		Assert.assertEquals( 23.0  , p1.evaluarProgDinamica(2) );	//p1(2) = 23
		Assert.assertEquals( 345.0 , p1.evaluarProgDinamica(9) );	//p1(9) = 345

		///Polinomio 2///
		Assert.assertEquals( 23.0   , p2.evaluarProgDinamica(2) ); // p2(2) = 23
		Assert.assertEquals( 1500.0 , p2.evaluarProgDinamica(9) ); // p2(9) = 1500
		
		///Polinomio 3///
		Assert.assertEquals( 16315.0, p3.evaluarProgDinamica(2) ); // p2(2) = 23
		Assert.assertEquals( 671061377831.0 , p3.evaluarProgDinamica(9) ); // p2(9) = 1500
	}
  	@Test
	public void polinomioEvaluarMejorada(){	
	
		///Polinomio 1///
		Assert.assertEquals( 23.0  , p1.evaluarMejorada(2) );	//p1(2) = 23
		Assert.assertEquals( 345.0 , p1.evaluarMejorada(9) );	//p1(9) = 345

		///Polinomio 2///
		Assert.assertEquals( 23.0   , p2.evaluarMejorada(2) ); // p2(2) = 23
		Assert.assertEquals( 1500.0 , p2.evaluarMejorada(9) ); // p2(9) = 1500
		
		///Polinomio 3///
		Assert.assertEquals( 16315.0, p3.evaluarMejorada(2) ); // p2(2) = 23
		Assert.assertEquals( 671061377831.0 , p3.evaluarMejorada(9) ); // p2(9) = 1500
	}
*/
	@Test
	public void polinomioEvaluarPow(){	
		
		///Polinomio 1///
		Assert.assertEquals( 23.0  , p1.evaluarPow(2) );	//p1(2) = 23
		Assert.assertEquals( 345.0 , p1.evaluarPow(9) );	//p1(9) = 345
		
		///Polinomio 2///
		Assert.assertEquals( 23.0   , p2.evaluarPow(2) ); // p2(2) = 23
		Assert.assertEquals( 1500.0 , p2.evaluarPow(9) ); // p2(9) = 1500
		
		///Polinomio 3///
		Assert.assertEquals( 16315.0, p3.evaluarPow(2) ); // p2(2) = 23
		Assert.assertEquals( 671061377831.0 , p3.evaluarPow(9) ); // p2(9) = 1500
	}
}

