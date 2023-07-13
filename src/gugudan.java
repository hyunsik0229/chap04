
public class gugudan {
	
	public static void main(String[] args) {
		int count =0;
		
		for(int x=1; x<=100;x++) {
			for(int y=1; y<=100;y++) {
				for(int z=1; z<=100;z++) {
					
					if(x*x + y*y ==z*z) {
						count++;
						
						System.out.printf("[%3d, %3d, %d]\n",x,y,z);
					}
					
				}
			}
		}
	}
	public static void main4(String[] args) {
		int count =0;
		
		for(int i=1; i<=100;i++) {
			for(int j=1; j<=100;j++) {
				for(int k=1; k<=100;k++) {
					
					count++;
					
					System.out.println(count);
					
				}
			}
		}
	}
	
	public static void main3(String[] args) {
		
		for(int i=1; i<10;i++) {
			for(int j = 1; j<10; j++) {
				
				System.out.printf("%d X %d = %d\n",i,j,i*j);
				
				
			}
			
		}
		
		
	}

	public static void main2(String[] args) {
		//구구단 중첩 for문
		
		for (int i = 1; i<10; i++)
			System.out.printf("1 X %d = %d\n",i,i);
	}

}
