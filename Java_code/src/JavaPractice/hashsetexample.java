package JavaPractice;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String>hashset = new HashSet<String>();
hashset.add("Student1");
hashset.add("Student2");
hashset.add("Student3");
hashset.add("Student4");
hashset.add("Student5");
hashset.add("Student1");

System.out.println(hashset);
System.out.println(hashset.contains("Student1"));
hashset.remove("Student2");
System.out.println(hashset);
//hashset.removeAll(hashset);
//System.out.println(hashset);
 
Iterator<String > iterator = hashset.iterator();
while(iterator.hasNext()) {
System.out.println(iterator.next());

}
	}
}

	
