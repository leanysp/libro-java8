package libro.cap01;

import java.util.Scanner;

public class PrimerosNumeros2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un valor ");
		
		int n = scanner.nextInt();
		
		int i = 1;
		
		do{
			System.out.println(i);
			i++;
		}while(i<=n);

	}

}
