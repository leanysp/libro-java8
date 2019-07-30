package libro.cap01.cadenas;

public class Cadena5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//obtengo el milisegundo actual
		long hi = System.currentTimeMillis();
		
		//instancio un Stringbuffer inicialmente vacio
		StringBuffer sb=new StringBuffer();
		
		//voy a concatenar n caracteres
		int n=1000000;
		
		char c;
		for(int i=0; i<n; i++)
		{
			//obtengo caracteres entre 'A' y 'Z'
			c = (char)('A' + i%('Z'-'A'+1));
			
			//concateno el caracter en el stringBuffer
			sb.append(c);
		}
		
		//Obtengo el milisegundo actual
		long hf = System.currentTimeMillis();
		
		//muestro la cadena resultante
		System.out.println(sb.toString());
		
		//muestro la cantidad de milisegundos insumidos
		System.out.println((hf-hi)+" milisegundos");

	}

}
