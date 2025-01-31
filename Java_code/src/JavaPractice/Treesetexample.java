package JavaPractice;

import java.util.Iterator;
import java.util.TreeSet;
//naturally sorting in ascending order
public class Treesetexample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer> treeset = new TreeSet<Integer>();
treeset.add(10);
treeset.add(9);
treeset.add(7);
treeset.add(5);
System.out.println(treeset);
System.out.println(treeset.first());
System.out.println(treeset.headSet(9));
System.out.println(treeset.tailSet(7));
System.out.println(treeset.subSet(5, 9));
//if comparator returns null if sorting is natural default order :null
//System.out.println(treeset.comparator());

// what ever list values  we give it will display one higher value of input
System.out.println(treeset.higher(7));
System.out.println(treeset.lower(7));
System.out.println(treeset.pollFirst());
System.out.println(treeset);

//System.out.println(treeset.descendingIterator());
Iterator<Integer> iterator = treeset.iterator();
while(iterator.hasNext()) {
System.out.println(iterator.next());


}
Iterator< Integer> iterator2 = treeset.descendingIterator();

while (iterator2.hasNext()) {
	System.out.println(iterator2.next());
}
	}

	}
