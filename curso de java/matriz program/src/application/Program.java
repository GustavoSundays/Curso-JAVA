package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas: ");
		int n = sc.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		int m = sc.nextInt();
		
		int[][] matriz = new int[n][m];
		
		for(int i=0;i<n; i++) {
			System.out.println("Digite os "+m+" n�meros da linha "+i+"("+(i+1)+"): ");
			for(int j=0;j<m; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite um n�mero: ");
		int x = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(x == matriz[i][j]) {
					System.out.println("Posi��o: "+i+","+j);
					if(!((i-1)<0)) {
						System.out.println("N�mero de cima: "+matriz[i-1][j]);
					}
					
					if(!((i+1)>n)) {
						System.out.println("N�mero de baixo: "+matriz[i+1][j]);
					}
					
					if(!((j-1)<0)) {
						System.out.println("N�mero da esquerda: "+matriz[i][j-1]);
					}
					
					if(!((j+1)>m)) {
						System.out.println("N�mero da direita: "+matriz[i][j+1]);
						break;
					}
				}
			}
		}
		
		
		
		
		sc.close();
	}
}
