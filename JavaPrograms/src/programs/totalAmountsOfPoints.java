//Our football team finished the championship. The result of each match look like "x:y". Results of all matches are recorded in the array.
//
//For example: ["3:1", "2:2", "0:1", ...]
//
//Write a function that takes such list and counts the points of our team in the championship. Rules for counting points for each match:
//
//if x>y - 3 points
//if x<y - 0 point
//if x=y - 1 point
//Notes:
//
//there are 10 matches in the championship
//0 <= x <= 4
//0 <= y <= 4
package programs;


public class totalAmountsOfPoints {
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"3:3", "4:2","2:5"};
		System.out.println(points(a));
	}
	
	public static int points(String[] games) {
	      //implement me
		int b = 0;
		for(int i = 0; i<games.length; i++)
		{
			
			char[] a =  games[i].toCharArray() ; 
			if (a[0]>a[2]) 
				 b= b + 3;
			else if (a[0]<a[2])
				 b = b ;
			else 
				 b = b + 1;
				
		}
		
		return b;
		
		
	    }

}
