package java8;
import java.util.*;
import java.util.Map.Entry;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ameramerartg";
int count=0;

TreeMap<Character,Integer> freq=new TreeMap<Character,Integer>();

for(int i=0;i<s.length();i++)
{
	char c=s.charAt(i);
	
	if(freq.containsKey(c))
	{
		freq.put(c, freq.get(c)+1);
	}
	else
	{
		freq.put(c,1);
	}
}
for (Map.Entry<Character, Integer> e : freq.entrySet())
{
	
	if(e.getValue()==2)
	{
		count++;
   
	}
	
System.out.println("Key: " + e.getKey()
+ " Value: " + e.getValue());


	
}
}



	

}
