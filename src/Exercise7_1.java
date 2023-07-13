import java.util.Scanner;

public class Exercise7_1 {
	
	public static void main(String[] args) {
		

		boolean run = true;
		int balance =0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("============");
			System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
			System.out.println("============");
			System.out.print("선택");
			
			int menu = scanner.nextInt();
			System.out.println("menu=" + menu);
			
			switch(menu) {
			case 1:{
				System.out.print("금액");
				int money = scanner.nextInt();
				balance += money;
				break;
			}
			case 2:{
				System.out.print("금액");
				int money = scanner.nextInt();
				balance -= money;			
				break;
			}
			case 3:
				System.out.println("잔고 : " + balance);
				break;
			case 4:
				run = false;
				break;
			}

		}
		
		//System.out.println("프로그램종료");
	}

}
