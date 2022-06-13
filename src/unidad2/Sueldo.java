package unidad2;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		
		System.out.printf("Sueldo base: ");
		Scanner sc = new Scanner(System.in);
		double sueldoBase = sc.nextDouble();
		sc = new Scanner(System.in);
		System.out.printf("Venta 1: ");
		double venta1 = sc.nextDouble();
		sc = new Scanner(System.in);
		System.out.printf("Venta 2: ");
		double venta2 = sc.nextDouble();
		sc = new Scanner(System.in);
		System.out.printf("Venta 3: ");
		double venta3 = sc.nextDouble();
		double sueldoTotal;
		sueldoTotal = sueldoBase + 0.1 * (venta1 + venta2 + venta3);
		System.out.printf("\nEl sueldo total es de %.2f euros", sueldoTotal);

	}

}
