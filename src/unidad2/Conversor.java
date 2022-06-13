package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversor {

	public static void main(String[] args) 
		throws IOException 
	{
		System.out.println("Introduzca euros: ");	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String numero = reader.readLine();
			double euros, dolares;
			euros = Double.parseDouble(numero);
			dolares = 1.2*euros;
			System.out.printf("\n%.2f euros = %.2f dolares", euros, dolares);
	}
}


