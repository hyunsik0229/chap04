
public class forStatementExample {
	
	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
		for (int i=1; i<=100;i++) {
			if(i%2==0)
				evenSum +=1;
			else 
				oddSum = oddSum+1;
		}
	}
	
	public static void main4(String[] args) {
		int sum = 0;
		
		for(int i=0; i<10; i+=2) {
			sum = sum+1;
			System.out.println(sum);
		}
	}
	
	public static void main3(String[] args) {
		int sum = 0;
		
		for(int i=0; i<10; i++) {
			sum = sum+1;
			System.out.println(sum);
		}
	}

	public static void main2(String[] args) {
		
		for(;;)//무한루프
			System.out.println("...");
		
	}
	
	public static void main1(String[] args) {
		//반복문 for문
		
		for(int i = 0; i<=100_000_000; i++) {
			System.out.println(i);
		}
	}

}
