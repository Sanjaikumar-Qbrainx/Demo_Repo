package JavaPractice;

import java.security.spec.PSSParameterSpec;

public class Paraconst {
String employee_name;
int employee_id;
public Paraconst(String name,int id) {
	employee_name=name;
	employee_id=1;
	
}
public void neww() {
	System.out.println("Emp name" +  employee_name+" empid "+employee_id);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Paraconst post =new Paraconst("Mark", 0);
post.neww();


	}

}
