package JavaPractice;

/*public class conditions {
	boolean isempty=true;
	

	public static void main(String[] args) {
		conditions c = new conditions();
		if(c.isempty) {
			System.out.println("Fillthecup");}
			else {
				System.out.println("dont fill");
			}
		}}*/


public class conditions{
	String name ="san2jai";
			public void guessname() {
				
		if (name.equals("sanjai")){
		System.out.println("Matching");
			} 
		else if(name.equals("micheal")){
					System.out.println("Not matching");
		}else if(name.equals("Henry")) {
			System.out.println("Notmatching");
		}else 
			System.out.println("not guessed");
			
			
		}
			public static void main(String[] args) {
				conditions c = new conditions();
				c.guessname();
}}