package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
			
			float prezzoKm = 0.21F;
			
			Scanner in = new Scanner(System.in);
			
			System.out.print("Quanti chilometri vuoi percorrere?");
			
			int numeroChilometri = in.nextInt();
			
			System.out.println("Quanti anni hai?");
			
			int age = in.nextInt();
	
			in.close();
			
			if(age > 65)
			{
				prezzoKm -= prezzoKm * 0.4;
				
			} else if (age < 18)
			{
				prezzoKm -= prezzoKm * 0.2;
			}
			
			float prezzoBiglietto = prezzoKm * numeroChilometri;
			
			System.out.println("Il prezzo del biglietto è: " + prezzoBiglietto + "€");
			
	}
}
