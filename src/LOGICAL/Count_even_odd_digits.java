package LOGICAL;

public class Count_even_odd_digits {

	public static void main(String[] args) {
		
		
		
		int num = 222222;
		int even_count= 0;
		int odd_count=0;
		
		
		
		while(num>0) {
			
			
			int rem = num%10;
			if (rem%2==0) {
				
	         even_count++;
				
				
			}
			else {
				odd_count++;
			}
			
			num=num/10;
		}
		
		System.out.println("total even " +even_count);
		

		System.out.println("odd even " +odd_count);
	}

}
