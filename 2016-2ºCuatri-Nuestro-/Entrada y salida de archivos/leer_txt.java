import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class leer_txt {

	/* este programa lee un archivo con el siguiente formato:
	   primera linea un entero n que indica la cantidad de numeros siguientes  que debo leer
	   seguido por  n numeros tipo  double
    */

	public static void main(String[] args) throws FileNotFoundException {
	
		String miPath = "\\gus\\programas\\workspace\\";
		Scanner sc = new Scanner(new File(miPath+"complejos.txt"));
		
		double [] vec = new double[sc.nextInt()]; // vector para almacenar la lectura
		
		for (int i = 0; i < vec.length ; i++) {
			vec[i] =sc.nextDouble() ;
			System.out.println( vec[i]);
		}
		
		sc.close();

	}

}
