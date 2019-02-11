package programs;

public class StringCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
		int i = 144;
      
        compareSubString(s,i);
        
    }
    
    public static void compareSubString(String s, int i)
        {
            String minStr = "z";
            String maxStr = "a";
            int b = s.length();
            for (int j=0; j<b-i+1 ;j++)
            {
                String s1 = s.substring(j, j+i);

                if(minStr.compareToIgnoreCase(s1)>0 )
                {
                    minStr = s1;
                }
                if(maxStr.compareToIgnoreCase(s1)<0)
                    maxStr = s1;	
            }
            System.out.println(maxStr);
            System.out.println(minStr);
        }

}
