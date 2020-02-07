package javaCode;

import java.util.HashMap;
import java.util.Map;

public class HasMapObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map<String, String> test=new HashMap <String,String>();
		
		test.put("key1", "value1");
		test.put("key2", "value2");
		test.put("key3", "value3");
		
		System.out.println(test.entrySet().toString());
	}
}
