
public class Employee {
	int empid;
	String empname;
	float sal;
	
	public void init() {
		empid=101;
		empname="vishnu";
		sal=25000.0f;
		
	}
	public void setdetail(int id, String name, float salary ) {
		empid=id;
		empname=name;
		sal=salary;
		
	}
	public void displaydetail() {
		System.out.println("id:"+empid+"\n"+"Name: "+empname+"\n"+"Salary:"+sal);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.init();
		e.displaydetail();
		e.setdetail(102, "Sreeju", 40000.0f);
		e.displaydetail();
		
	}

}
