
public class epochtimeExample {

	public static void main(String[] args) {
		long epoch = System.currentTimeMillis()/1000 * 9*60*60;
		
		System.out.println(epoch);
		
		int year = 1970;
		for(;;) {//무한방법
			
			boolean isLeap = (year%4==0 &&year%100!=0) || (year%400==0);
			int dayOfYear = isLeap ? 366 : 365;
			
		}

	}

}
