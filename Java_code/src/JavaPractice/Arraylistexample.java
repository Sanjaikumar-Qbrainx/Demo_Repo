package JavaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylistexample {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> alpha = new ArrayList<String>();
		alpha.add("Iphone");
		alpha.add("Vivo");
		alpha.add("Samsung");
		System.out.println(alpha);

		System.out.println(alpha.get(1));
		System.out.println(alpha.indexOf("Viv"));
		System.out.println(alpha.lastIndexOf("Samsung"));

		List <String> beta= new ArrayList<String>();
		beta.addAll(alpha);
		System.out.println(beta);
		beta.clear();
		System.out.println(beta);
		//alpha.remove(0);
		//System.out.println(alpha);
		alpha.remove("Samsung");
		System.out.println(alpha);
		alpha.add(null);
		System.out.println(alpha);
		alpha.set(0, "Iphone 15");
		for (String Objectrefname : alpha) {
			System.out.println("final"+Objectrefname);
		System.out.println("-----------------------------");
			//using for loop
			//for(int i=0;i<alpha.size();i++);

			//	alpha.get(i);	
//		}

	ListIterator<String > list1= alpha.listIterator();
			while(list1.hasNext()) {
			System.out.println(list1.next());
			}
			while(list1.hasPrevious()) {
			System.out.println(list1.previous());
			
			
			}

		}

	}
}




