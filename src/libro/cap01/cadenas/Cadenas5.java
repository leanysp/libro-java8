package libro.cap01.cadenas;

public class Cadenas5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Un buen libro de java, un buen material";
		
		int pos1=s.indexOf("buen"); //retorna 3		
		int pos2= s.lastIndexOf("buen");//retorna 26
		
		System.out.println(pos1);
		System.out.println(pos2);

	}

}
