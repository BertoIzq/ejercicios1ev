package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {

	public static void main(String[] args) throws IOException {
		
		double matesEx, mates1, mates2, mates3, matesMed;
		double fisicaEx, fisica1, fisica2, fisicaMed;
		double quimicaEx, quimica1, quimica2, quimica3, quimicaMed;
		double media;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("\nMatematicas");
		System.out.printf("\n\tExamen: ");
		String examenMates = reader.readLine();
		matesEx = Double.parseDouble(examenMates);
		System.out.printf("\tTarea 1: ");
		String t1Mates = reader.readLine();
		mates1 = Double.parseDouble(t1Mates);
		System.out.printf("\tTarea 2: ");
		String t2Mates = reader.readLine();
		mates2 = Double.parseDouble(t2Mates);
		System.out.printf("\tTarea 3: ");
		String t3Mates = reader.readLine();
		mates3 = Double.parseDouble(t3Mates);
		matesMed = 0.9 * matesEx + (mates1 + mates2 + mates3) / 3. * 0.1;
		System.out.printf("\t\tMedia: %.2f", matesMed);
		
		System.out.printf("\nFisica");
		System.out.printf("\n\tExamen: ");
		String examenFisica = reader.readLine();
		fisicaEx = Double.parseDouble(examenFisica);
		System.out.printf("\tTarea 1: ");
		String t1Fisica = reader.readLine();
		fisica1 = Double.parseDouble(t1Fisica);
		System.out.printf("\tTarea 2: ");
		String t2Fisica = reader.readLine();
		fisica2 = Double.parseDouble(t2Fisica);
		fisicaMed = 0.8 * fisicaEx + (fisica1 + fisica2) / 2. * 0.2;
		System.out.printf("\t\tMedia: %.2f", fisicaMed);
		
		System.out.printf("\nQuimica");
		System.out.printf("\n\tExamen: ");
		String examenQuim = reader.readLine();
		quimicaEx = Double.parseDouble(examenQuim);
		System.out.printf("\tTarea 1: ");
		String t1Quim = reader.readLine();
		quimica1 = Double.parseDouble(t1Quim);
		System.out.printf("\tTarea 2: ");
		String t2Quim = reader.readLine();
		quimica2 = Double.parseDouble(t2Quim);
		System.out.printf("\tTarea 3: ");
		String t3Quim = reader.readLine();
		quimica3 = Double.parseDouble(t3Quim);
		quimicaMed = 0.85 * quimicaEx + (quimica1 + quimica2 + quimica3) / 3. * 0.15;
		System.out.printf("\t\tMedia: %.2f", quimicaMed);
		media = (matesMed + fisicaMed + quimicaMed) / 3.;
		System.out.printf("\nMEDIA TOTAL: %.2f", media);
		
		
	}

}
