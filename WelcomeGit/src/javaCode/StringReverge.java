package javaCode;

public class StringReverge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String real=new String("we are going to BD");
		int l=real.length();
		
		String reverge="";
		
		for(int i=l-1;i>=0; i--) {
			reverge=reverge+real.charAt(i);
			}
		System.out.println(reverge);
	}
}
