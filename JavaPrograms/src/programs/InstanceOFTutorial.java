package programs;

import java.util.ArrayList;
import java.util.Scanner;

class Student{}
class Rockstar{}
class Hacker{}
public class InstanceOFTutorial{

	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
	      Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt();
	      for(int i=0; i<t; i++){
	         String s=sc.next();
	         if(s.equals("Student"))mylist.add(new Student());
	         if(s.equals("Rockstar"))mylist.add(new Rockstar());
	         if(s.equals("Hacker"))mylist.add(new Hacker());
	      }
	      System.out.println(count(mylist));

	}
 
	   static String count(ArrayList mylist){
	      int a = 0,b = 0,c = 0;
	      for(int i = 0; i < mylist.size(); i++){
	         Object element=mylist.get(i);
	         if(element.equals("Student"))
	            a++;
	         if(element.equals("Rockstar"))
	            b++;
	         if(element.equals("Hacker"))
	            c++;
	      }
	      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
	      return ret;
	   }

}