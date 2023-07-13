
public class SwitchExample {
	
	public static void main(String[] args) {
		char ch = (char)(Math.random()*10 + 'A');
		
		switch(ch) {
		case 'A':
			System.out.println("모음");
			break;
		}
	}
	
	public static void main3(String[] args) {
		int num = (int)(Math.random()*5);

		char ch = '모';
		switch (num) {
		case 0:
			ch = '도';
			break;
		case 1:
			ch = '게';
			break;
		case 2:
			ch = '걸';
			break;
		case 3:
			ch = '윷';
			break;
		case 4:
			ch = '모';
			break;
		}
		System.out.println(ch);
	}

	public static void main2(String[] args) {
		int num = (int)(Math.random()*5);
		
		char ch = '모';
		if(num ==0)
			ch = '도';
	}

}
