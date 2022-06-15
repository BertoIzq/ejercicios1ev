package unidad3;

import java.io.*;
import java.util.*;

public class Hora {

	public static void main(String[] args) throws IOException {
		int h = -1, m = -1, s = -1;
		while (true) {
			System.out.println("Introduce hora (formato HH:MM:SS): ");
			Scanner time = new Scanner(System.in);
			String horuca = time.next();
			Scanner hora = new Scanner(horuca).useDelimiter("\\s*:\\s*");
			h = hora.nextInt();
			m = hora.nextInt();
			s = hora.nextInt();
			if (h > 23 || h < 0 || m > 59 || m < 0 || s > 59 || s < 0) {
				System.out.printf("\nHora invalida");
			}
			else break;
		}
		System.out.printf("\nLa hora del segundo siguiente es ");
		if (s == 59) {
			s = 0;
			m++;
		}
		if (m == 60) {
			m = 0;
			h++;
		}
		if (h == 24) {
			h = 0;
		}
		if (h < 10) 	System.out.printf("0%d:", h);
		else 			System.out.printf("%d:", h);
		if (m < 10) 	System.out.printf("0%d:", m);
		else 			System.out.printf("%d:", m);
		if (s < 10) 	System.out.printf("0%d", s);
		else 			System.out.printf("%d", s);
	}

}
