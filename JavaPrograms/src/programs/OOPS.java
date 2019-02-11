package programs;
class A {
	int x = 10;

	public A() {
		System.out.println("inside A:");
//		int t;       
//	    System.out.println(t); 
	}
}

class B extends A{
	int x = 20;
	public B() {
		System.out.println("inside B:");
	}
	void print() {
		System.out.println("print: "+super.x);
		}
}

public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new A();
		System.out.println(10*20 + "GeeksQuiz");
	    System.out.print("GeeksQuiz" + 10*20);
		//obj1.print();
	}

}
