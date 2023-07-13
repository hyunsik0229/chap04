
public class Exercis4_13 {
	
	public static void main(String[] args) {
		
		String value = "12o34";
		char ch = ' ';
		boolean isnumber = true;
		
		for(int i=0; i<value.length(); i++) {
			ch = value.charAt(i);
			if(isnumber)
				System.out.println(value + "숫자임");
			else
				System.out.println(value + "dksla");
		}
		
		
	}
}
