
public class Exercis4_3 {
	
	public static void main(String[] args) {
	//1 + (1+2)+(1+2+3).....(1+...+10)
		int totalSum =0;
		
		for (int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++)
				totalSum+=j;
		}
		System.out.println(totalSum);
	}
}
