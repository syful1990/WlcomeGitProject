package javaCode;

import java.util.ArrayList;
import java.util.HashSet;

public class DublicateValueInArrayLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String> ();
		obj.add("syful");
		obj.add("Islam");
		obj.add("Authi");
		obj.add("syful");
		obj.add("Opu");
		
		HashSet<String> findDuplicate=new HashSet<String> ();
		
		for(String st: obj) {
			if(findDuplicate.add(st)==false) {
				System.out.println(st);
			}
		}

	}

}
