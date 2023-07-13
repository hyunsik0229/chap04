
public class ifStatusExample {
	
	public static void main(String[] args) {
		
		int jungsu = (int)(Math.random()*51+50);
		
		char grade = 'F';
		
		
		System.out.println(jungsu);
		
		if(90<jungsu && jungsu<=100) {
			grade = 'A';
		}else if(80<jungsu && jungsu<=90) {
			grade = 'B';
		}else if(70<jungsu && jungsu<=80) {
			grade = 'C';
		}else if(60<jungsu && jungsu<=70) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println(jungsu);
		
		if(90<=jungsu) {
			grade = 'A';
		}else if (80<=jungsu) {
			grade = 'B';
		}
	}
	
	public static void main7(String[] args) {
		int num = (int)(Math.random()*100-50);
		
		if(num>0)
			System.out.println("양수");
		else 
			System.out.println("0또는 음수");
		
		System.out.println("num = " + num);
	}
	
	public static void main6(String[] args) {
		int num = (int) (Math.random()*100 - 50);
		
		System.out.println(num);
	}
	
	public static void main5(String[] args) {
		int num = 95;
		
		if (num%2 == 0) {
			System.out.println("########");
			System.out.println("짝수 입니다");
			System.out.println("########");
		}
		else
			System.out.println("홀수 입니다");
	}
	
	
	public static void main4(String[] args) {
		int num = 95;
		
		if (num%2 == 0)
			System.out.println("짝수 입니다");
		else
			System.out.println("홀수 입니다");
	}
	
	public static void main3(String[] args) {
		int num = 100;
		
		if(num%2==0) {
			System.out.println("짝수 입니다 num =" + num);
		}else {
			System.out.println("홀수 입니다 num = "+ num);
		}
	}

	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("aa");
		
		int num = 99;
		
		if(num%3 == 0) {
			System.out.println("if문수행됨");
		}
		System.out.println("프로그램 끝");
	}

}
