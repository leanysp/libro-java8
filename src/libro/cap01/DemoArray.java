package libro.cap01;

import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defino un array de 10 enteros}
		int arr[] = new int [10];
		
		//el sacanner para leer por teclado
		Scanner scanner = new Scanner(System.in);
		
		//leo el primer numero
		System.out.print("Ingrese un valor (0=>fin): ");
		int v = scanner.nextInt();
		
		int i = 0;
		
		//mientras v sea distinto de cero AND i sea menor que 10
		while(v!=0 && i<10){
			//asigna v en arr[i] y luego incremente el valor de i
			arr[i++]= v;
			
			//leo el siguiente valor
			System.out.print("Ingrese el siguiente valor (0=>fin): ");
			v= scanner.nextInt();
		}
		
		//recorro el array mostrando su contenido
		for(int j=0; j<i; j++){
			System.out.println(arr[j]);
		}

	}

}
