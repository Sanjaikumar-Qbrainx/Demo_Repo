package JavaPractice;
//static keyword no need to create object if we use static
public class statics {
//public static  void run() {
//	for (int i = 0;i<5;i++) {
//		System.out.println("running");
//	}
//}
	//static variable
	
	static int num;
	String name;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stubru
		statics s=new statics();
		System.out.println(s.num=1000);
		System.out.println(s.name="soap");
		s.name();
		s.num();
		
		statics s1 = new statics();
		 System.out.println(s1.num=7000);
		System.out.println(s1.name="paul");
		s1.name();
		s1.num();  
		
	}
	private void num() {
		// TODO Auto-generated method stub
		
	}
	private void name() {
		// TODO Auto-generated method stub
		
	}

}
