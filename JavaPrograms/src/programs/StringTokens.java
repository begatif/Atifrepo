package programs;

public class StringTokens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "   He is a very very good boy, isn't he?";
		String[] s1 = s.split("[\\S][\\W]");
		int t = s1.length;
		System.out.println(t);
		for(String i:s1)
		{
			System.out.println(i);
		}

	}

}
