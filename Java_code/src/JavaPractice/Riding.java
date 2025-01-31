package JavaPractice;

class stunting{
	
public void gear() {
	for (int i=0; i<5;i++) {
		System.out.println(i);
	}}
	public void breaks() {
		System.out.println("breaked");}
		public static int  next(int a, int b) {
			return a+b;
			
			
		}
	
}

public class Riding extends stunting {
	
	@Override
	public void breaks() {
		System.out.println("break failure");
	}
	

	public static void main(String[] args) {
	 System.out.println(next(1, 4));
	 
	}

}
