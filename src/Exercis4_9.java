
public class Exercis4_9 {
	
	public static void main(String[] args) {
		
		String str = "12345";
		
		for (int i=0; i<str.length(); i ++) {
			char ch = str.charAt(i);
			int sum = 0;
			sum = sum + ch;
			
			
			System.out.println("sum = "+ sum);
		}
	}
}
