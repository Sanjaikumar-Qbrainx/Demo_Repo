package JavaPractice;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistexample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> one = new LinkedList<String>();
one.add("Employee1");
one.add("Employee2");
one.add("Employee3");
one.add("Employee4");
System.out.println(one);
one.addFirst("Employee0");
one.addLast("Employee5");
System.out.println(one);
System.out.println(one.getFirst());
System.out.println(one.getLast());
System.out.println(one.get(0));
System.out.print("Remove" +one.removeFirst());
System.out.println("Remove" +one.removeLast());


//poll also delete first element
//one.poll();
//System.out.println(one);
//one.pollLast();
//System.out.println(one);
 one.removeFirstOccurrence("Employee1");
 System.out.println("occurence"+one);
 one.removeLastOccurrence("Employee4");
 System.out.println(one);
	
	for(String s :one) {
		System.out.println(s);
		
//for(int i=0; i<one.size();i++) {
//	System.out.println();
//}
	}
	}
	
}
