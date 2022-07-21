package practice_session;

public class Constructors {
int id;
String name;
void display() {
	System.out.println(id+" "+name);
}
}

public class ConstructorsDemo{
	public static void main(String[] args) {
		Constructors emp1=new Constructors();
		Constructors emp2=new Constructors();
		emp1.display();
		emp2.display();
	}
}
class std{
	int id;
	String name;

	std(int i, String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class paramConstrDemo(){
	public static void main(String[] args) {
		std std1=new std(2,"alexa");
		std std2=new std(10, "anima");
		std1.display();
		std2.display();
	}
}
