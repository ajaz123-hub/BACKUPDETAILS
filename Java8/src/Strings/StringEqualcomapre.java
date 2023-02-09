package Strings;

public class StringEqualcomapre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="mohdamer";
//		String s2="mohdamer";
//		int count=0;
//		char[] c1 = s1.toCharArray();
//		char[] c2 = s2.toCharArray();
//		for(int i=0;i<c1.length;i++)
//		{
//			for(int j=0;j<c1.length;j++)
//			{
//				if(c1[i]!=c2[j])
//				{
//					count++;
//					break;
//				}
//				else
//				{
//					//System.out.println(" equal");
//					
//					
//				}
//			}
//			
//		}
//		if(count==1)
//		{
//			System.out.println("equal");
//		}
//		
		
		int i,flag=1,len1,len2;
		String s1="amfer";
		String s2="amer";
		

		len1=s1.length();
		len2=s2.length();

		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();

    	    	if(len1==len2)
    		{	
    			for(i=0;i<len1;i++)
    			{
        			if(str1[i]!=str2[i])
        			{
            				flag=0;
	                		break;
				}
        		}
		}
 	 	else
    		{
    			flag=0; 
   		}	
	    	if(flag==1)
    		{
 	        	System.out.println("The two string are EQUAL!!!");
        		System.out.println(s1+" = "+s2);
    		}

    		else
    		{
 	        	System.out.println("The two string are NOT EQUAL!!!");
        		System.out.println(s1+" != "+s2);
    		}
	}

}
