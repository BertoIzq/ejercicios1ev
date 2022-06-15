package unidad3;

import java.util.*;
import java.io.*;

public class Bisiesto {

	public static void main(String[] args) {
		
		System.out.println("Introduce año: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int resto4, resto100, resto400;
		resto4 = year%4;
		resto100 = year%100;
		resto400 = year%400;
		
		if ((resto4 == 0 && resto100 > 0) || resto400 == 0) {
			System.out.println("El año es bisiesto");
		}
		else {
			System.out.println("El año NO es bisiesto");			
		}
		
	}

}
