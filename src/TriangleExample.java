
public class TriangleExample {
	
	public static void main(String[] args) {


		for( int i=5; i>=1;i--) {
			for(int k = 5; k >=i ; k--) {
				System.out.print(" ");
			}
			for(int j=1; j <=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main2(String[] args) {


		for( int i=1; i<=5;i++) {
			{				
				for(int k=5; k>=i; k--) {
					System.out.print(" ");
				}			
				for(int j=1; j <=i;j++) {
					
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void main3(String[] args) {


		for( int i=5; i>=1;i--) {
			for(int j=1; j <=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main1(String[] args) {


		for( int i=1; i<=5;i++) {
			for(int j=1; j <=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
