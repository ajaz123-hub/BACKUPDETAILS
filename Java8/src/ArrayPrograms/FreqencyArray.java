package ArrayPrograms;

public class FreqencyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] a = { 2, 3, 3, 2, 1 };
	    int check=0;
		int ch1='a';
		
		System.out.println(ch1);
		int[] freq=new int[a.length];
		int[] ch=new int[freq.length];
		
		for(int count:a)
		{
			freq[count]++;
			//System.out.println(freq[count]);
			
		}
		
		//to find all frequency
		for(int i=0;i<freq.length;i++)
		{
			
			
			if(freq[i]>0)
			{
				System.out.println(freq[i]+" "+i);
			}
		}
	}
}

	/* to find unique
	for(int i=0;i<freq.length;i++)
	{
		
		
		if(freq[i]>1)
		{
			System.out.println(i +" "+freq[i]);
		}
	}*/

/* to find repeated
for(int i=0;i<freq.length;i++)
{
	
	
	if(freq[i]>1)
	{
		System.out.println(i +" "+freq[i]);
	}
}*/

/* to find second higest frequecy count
for(int i=0;i<freq.length;i++)
{
	
	
	if(freq[i]>1)
	{
	check++;
		System.out.println(i +" "+freq[i]);
	}
	if(check==1)
	{

		System.out.println(i +" "+freq[i]);
	}
}*/

/*for(int j=i+1;j<a.length;j++)
{
	if(freq[i]<freq[j])
	{
		temp=freq[i];
		freq[i]=freq[j];
		freq[j]=temp;
	}
}*/
