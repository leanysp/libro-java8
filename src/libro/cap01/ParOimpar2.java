package libro.cap01;

import java.util.Scanner;

public class ParOimpar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un valor: ");
		int v = scanner.nextInt();
		
		//obtenemos el resto de dividir v por 2
		int resto = v%2;
		//utilizando un if in-line
		String mssg = (resto == 0) ? "es par": "es Impar";
		//muestro resultado
		System.out.println(v+ " "+ mssg);

	}

}
