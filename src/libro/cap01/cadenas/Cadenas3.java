package libro.cap01.cadenas;

public class Cadenas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Esto Es Una Cadena de Caracteres";
		
		String s1= s.substring(0,7);
		String s2= s.substring(8,11);
		
		//toma desde el caracter 8 hasta el final
		String s3 = s.substring(8);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
