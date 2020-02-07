package javaCode;

public class DublicateCharIn_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String ("Today is sunny day and snow");
		int l=s.length();
		System.out.println(l);
		int counter=0;
		for(int i=0; i<=l-1; i=i+1) {
			if(s.charAt(i)==('d')) {
				counter++;		
			}
		}
		System.out.println(counter);
	}
}
