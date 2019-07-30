package libro.cap01;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Ingrese un día de la semana(número entre 1 y 7): ");
		int v = scanner.nextInt();

		String dia;
		switch (v) {
		case 1:
			dia = "Lunes";
			break;
		case 2:
			dia = "Martes";
			break;
		case 3:
			dia = "Miercoles";
			break;
		case 4:
			dia = "Jueves";
			break;
		case 5:
			dia = "Viernes";
			break;
		case 6:
			dia = "Sádado";
			break;
		case 7:
			dia = "Domingo";
			break;
			default:
				dia= "dia incorrecto... El valor debe ser entre 1 y 7.";
		}
		System.out.println(dia);

	}

}
