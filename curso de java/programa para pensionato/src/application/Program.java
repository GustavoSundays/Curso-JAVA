package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;


public class Program {
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.printf("How many rooms will be rented? ");
		int n = sc.nextInt();
		Rent[] vect = new Rent[10];
		
		for (int i=0; i<n; i++) {
			System.out.println(); 
			System.out.println("Rent #"+ (i+1));
			sc.nextLine();
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<vect.length; i++) {
			if(vect[i] != null) {				
				System.out.println(i+": "+vect[i]);
			}
		}
  
		
		sc.close();
		
	}
}
