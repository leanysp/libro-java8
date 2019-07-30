package libro.cap01;

import java.util.Scanner;

public class DemoArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dias[]={"lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un día de la semana(número: )");
		int v = scanner.nextInt();
		
		if(v <= dias.length){
			//los array se enumeran desde cero
			System.out.print(dias[v-1]);
		}else{
			System.out.println("Día incorrecto...");
		}

	}

}
