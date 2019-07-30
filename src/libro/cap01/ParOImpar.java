package libro.cap01;

import java.util.Scanner;

public class ParOImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.print("Ingrese un valor: ");
		int v = scanner.nextInt();
		
		//obtenemos el resto de dividir v por 2
		int resto = v%2;
		//para preguntar por igual utilizamos ==
		if(resto == 0){
			System.out.println(v+ " es par");
		}else{
			System.out.println(v+ " es impar");
		}

	}

}
