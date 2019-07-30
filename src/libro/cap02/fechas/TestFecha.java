package libro.cap02.fechas;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f = new Fecha(2,10,1970);
		
		f.setDia(2);
		f.setMes(10);
		f.setAnio(1970);
		
		//imprimo el dia
		System.out.println(f.getDia());
		
		//imprimo el mes
		System.out.println(f.getMes());
		
		//imprimo el anio
		System.out.println(f.getAnio());
		
		//imprimo la fecha
		System.out.println(f);

	}

}
