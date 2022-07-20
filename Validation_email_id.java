package practice_session;
import java.util.ArrayList;
import java.util.Scanner;
public class Validation_email_id {
public static void main(String[] args) {
	//array list to store email ids
	ArrayList<String>emailid=new ArrayList<String>();
	int a=0;
	emailid.add("abc.first@abc.com");
	emailid.add("def.second@def.com");
	emailid.add("ghi.third@ghi.com");
	emailid.add("jkl.fourth@jkl.com");
	emailid.add("mno.fivth@mno.com");
	//string to take input from user
	String echeck =null;
	System.out.println("enter the email id to search");
	Scanner in=new Scanner(System.in);
	echeck=in.nextLine();
	
	//for loop to access value store in array string list
	for(String eloop:emailid);{
		if(eloop.equals(echeck)) {
			System.out.println(eloop+"is present");
			a=1;
			break;
		}
	}
	//a is flag to check if value was present inlist or not
	if(a==0) {
		System.out.println("not present");
	}
	
}
}
