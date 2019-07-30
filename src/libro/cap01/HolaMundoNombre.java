package libro.cap01;

import java.util.Scanner;

public class HolaMundoNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese su nombre:");
		String nom = scanner.next();
		int edad= scanner.nextInt();
		double altura = scanner.nextDouble();
		System.out.println("Nombre:"+nom
				+" Edad:"+edad
				+" Altura:"+altura);

	}

}
