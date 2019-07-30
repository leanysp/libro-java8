package libro.cap02.fechas;

import java.util.Scanner;

public class TestFecha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		//el usuario ingresa los datos de la fecha
		System.out.print("Ingrese fecha1 (dia,mes y anio): ");
		int dia=scanner.nextInt();
		int mes= scanner.nextInt();
		int anio = scanner.nextInt();
		
		//creo un objeto de la clase Fecha
		Fecha f2 = new Fecha(dia,mes,anio);
		//el usuario ingresa los datos de la fecha
		System.out.print("Ingrese fecha1 (dia,mes y anio): ");
		dia=scanner.nextInt();
		mes= scanner.nextInt();
		anio = scanner.nextInt();
		
		

	}

}
