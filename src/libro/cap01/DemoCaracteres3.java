package libro.cap01;

public class DemoCaracteres3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		for(int i = 'A'; i<= 'Z'; i++){
			//para asignar un int en un char debemos "castear"
			c = (char) i;
			System.out.println(c);
		}

	}

}
