package libro.cap01.cadenas;

public class Cadenas5b {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			long hi = System.currentTimeMillis();
			int n=1000000;
			
			String s="";
			char c;
			for(int i=0; i<n; i++)
			{
				c = (char)('A' + i % ('Z'-'A'+1));
				
				//concateno el caracter c utilizando el operador +
				s = s + c;
			}
			
			long hf = System.currentTimeMillis();
			System.out.println(s);
			System.out.println((hf-hi)+" milisegundos");
	}

}
