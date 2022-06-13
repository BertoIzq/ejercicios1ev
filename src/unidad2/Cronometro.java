package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cronometro {

	public static void main(String[] args) throws IOException {
		
		System.out.printf("Introduzca nombre: ");
		double inicio = System.currentTimeMillis();
		BufferedReader reader;
		reader = new BufferedReader(new InputStreamReader(System.in));
		String nombre = reader.readLine();
		double fin = System.currentTimeMillis();
		double tiempo = (fin - inicio) / 1000.;
		System.out.printf("\nTiempo transcurrido: %.3f seg", tiempo);
		
	}

}
