package JavaPractice;

interface one{
	public void fight1();
}
interface two{
	public void fight2();
}
 class num implements one,two {
	 public void fight1() {
		 System.out.println("ufc");
	 }
	 public void fight2() {
		 System.out.println("wwe");
	 }
	
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num n = new num();
		n.fight1();
		n.fight2();
		

	}

}
