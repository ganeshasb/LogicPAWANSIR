package LOGICAL;

public class Sum_Of_digits_in_number {

	public static void main(String[] args) {
		
		
		int num =111111;
		
		int sum=0;
		
    while(num>0) {
	
	int rr = num%10;
	sum = sum+rr;
	  num=num/10;
}
  
    System.out.println(sum);
	}

}
