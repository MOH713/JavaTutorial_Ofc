package practice_session;

public class Methods{
public int multiplyno(int a, int b) {
	int c=a*b;
	return c;
	}
public static void main(String[] args) {
	Methods b=new Methods();
	int ans=b.multiplyno(7,13);
	System.out.println("Multiplicaton is: " +ans);
	}
public class CallMethod{
	int val=100;
	int operation(int val) {
		val=val*10/100;
		return(val);
	}
}
	public static void main(String[] args) {
		CallMethod d= new CallMethod();
		System.out.println("before operation value of data is "+ d.val);
		d.operation(100);
		System.out.println("after operation value of data is "+d.val);
	}
	public class overloadMethod{
		public  void area(int b, int h) {
			System.out.println("area of triangle " +(1*b*h));
		}
	}
		public void area(int r) {
			System.out.println("area of circle: "+ (3.14*r*r));
		}
		public static void main(String[] args) {
			overloadMethod ob=new overloadMethod();
			ob.area(9,13);
			ob.area(7);
		}
	


}
 

