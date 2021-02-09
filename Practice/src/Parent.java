
public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Lets do a sum by calling a method from another class");
		Sum s= new Sum();
		s.addition();
		
		Difference d= new Difference();
		d.subtract();
		System.out.println("Differnce is "+ d.subtract());
	}

}
