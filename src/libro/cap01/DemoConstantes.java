package libro.cap01;

import java.util.Scanner;

public class DemoConstantes {
	//definimos las constantes
	public static final int LUNES = 1;
	public static final int MARTES = 2;
	public static final int MIERCOLES = 3;
	public static final int JUEVES = 4;
	public static final int VIERNES = 5;
	public static final int SABADO = 6;
	public static final int DOMINGO = 7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un d�a de la semana(numero): ");
		int v = scanner.nextInt();
		
		String dia;
		
		switch(v){
		case LUNES:
			dia = "Lunes";
			break;
		case MARTES:
			dia = "Martes";
			break;
		case MIERCOLES:
			dia = "Miercoles";
			break;
		case JUEVES:
			dia = "Jueves";
			break;
		case VIERNES:
			dia = "Viernes";
			break;
		case SABADO:
			dia = "S�bado";
			break;
		case DOMINGO:
			dia = "Domingo";
			break;
			default:
				dia= "Ingrese un n�mero v�lido entre 1 y 7. ";
		};
		
		System.out.println(dia);
	}

}
