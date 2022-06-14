package unidad2;

import java.util.Scanner;

public class Color {

	public static void main(String[] args) {
		
		double r, g, b, y, i, q;
		Scanner sc = new Scanner(System.in);
		r=g=b=300.;
		while (r < 0. || r > 255.) {
			System.out.println("Introduzca componentes RGB:\nR -> ");
			r = sc.nextDouble();
		}
		while (g < 0. || g > 255.) {
			System.out.println("G -> ");
			g = sc.nextDouble();
		}
		while (b < 0. || b > 255.) {
			System.out.println("B -> ");
			b = sc.nextDouble();
		}
		y = 0.299*r + 0.587*g + 0.114*b;
		i = 0.596*r - 0.275*g - 0.321*b;
		q = 0.212*r - 0.528*g + 0.311*b;
		System.out.printf("Las componentes YIQ son:\nY -> %.2f", y);
		System.out.printf("\nI -> %.2f", i);
		System.out.printf("\nQ -> %.2f", q);
	}

}
