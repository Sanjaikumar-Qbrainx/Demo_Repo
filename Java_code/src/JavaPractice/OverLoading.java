package JavaPractice;

public class OverLoading {
	

int in(int a, int b) {
	return  a+b;}
	
	int in(int a,int b, int c) {
		return a+b+c;
	}
		float in(float a, float b) {
			return a+b;
		}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverLoading over = new OverLoading();
System.out.println(over.in(1, 2, 2));
System.out.println(over.in(2, 2));


	}

}
