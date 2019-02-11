package programs;

//import java.util.stream.Collectors;

public class CamelCaseMethod {

	/**
	 * Write simple camel case method (camel_case function in PHP) for strings. All words must have their first letter capitalized without spaces.

		For instance:

		"hello case".camelCase() => HelloCase
		"camel case word".camelCase() => CamelCaseWord
		Don't forget to rate this kata! Thanks :)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		camelCase(" hi there how are you? ");
	}
	
	
	public static String camelCase(final String s1) {
        // your code here
		if(s1 != "")
		{
			String [] parts= s1.trim().split(" "); 
			int l = parts.length;
			StringBuffer sb1;
			StringBuffer sb2 = new StringBuffer() ;
			for (int i=0; i<l;i++)
			{
				sb1 = new StringBuffer(parts[i]);
				sb1.replace(0,1,String.valueOf(sb1.charAt(0)).toUpperCase());
				sb2.append(sb1);		
			}
			
	        return sb2.toString();
		}
		else
			return "";
    }

}
