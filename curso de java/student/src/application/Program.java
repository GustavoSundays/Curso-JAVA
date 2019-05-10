package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("Note 1st trimester (until 30): ");
		student.note1 = sc.nextDouble();
		System.out.print("Note 2nd trimester (until 35): ");
		student.note2 = sc.nextDouble();
		System.out.print("Note 3rd trimester (until 35): ");
		student.note3 = sc.nextDouble();
		
		System.out.println(student);
						
		sc.close();
	}

}
