package javaCode;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=12345;
		int rev=0;
		
		while(number>0) {
			rev=rev*10+number%10;
			number=number/10;
		}
		System.out.println(rev);
	}
}
