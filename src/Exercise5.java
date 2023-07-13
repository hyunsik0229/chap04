
public class Exercise5 {
	
	public static void main(String[] args) {
		System.out.println("3번");
		for (int i=0;i<5;i++) {
			for(int j=0; j<5-i;j++) {
				System.out.print("*");
			}
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main2(String[] args) {
		System.out.println("1번");
		for (int i=0;i<5;i++) {
			for(int j=0; j<i+1;j++) {
				System.out.print("*");
			}
			for(int k=0; k<4-i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main1(String[] args) {


		for(int x=0; x<=20; x++)
			for(int y=0; y<=10; y++)
				if(4*x + 5*y == 60)
					System.out.printf("(%d,%d)\n",x,y);

	}

}
