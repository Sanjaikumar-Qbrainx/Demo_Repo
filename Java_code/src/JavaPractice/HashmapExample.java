package JavaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

public class HashmapExample {

	public static void main(String[] args) {
		
HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
hashmap.put(4, "1");
hashmap.put(2, "2");
hashmap.put(3, "3");
hashmap.put(1, "4");

System.out.println("First" +hashmap);
//add full duplicate map 
HashMap<Integer, String> duplicatekey = new  HashMap<Integer, String>();
duplicatekey.putAll(hashmap);
System.out.println("Duplicate key"+ duplicatekey);

duplicatekey.clear();
System.out.println(duplicatekey);

System.out.println(hashmap.containsKey(1));
System.out.println(hashmap.containsValue("Employee4"));
System.out.println(hashmap.clone());
System.out.println(hashmap.isEmpty());
//print only keys 
System.out.println(hashmap.keySet());
//print key and value
System.out.println(hashmap.entrySet());
System.out.println(hashmap.get(2));

}
	
	}


