package Strings;

public class Reversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "how are you"+" ";


char ch;
String word="";
String rev="";

for(int i=0;i<s.length();i++)
{
	
	ch=s.charAt(i);
	if(ch!=' ')
	{
		word=word+ch;
		
	}
	else
	{
		rev=word+" "+rev;
		word=" ";
	}

}
System.out.println(rev);
	}

}
