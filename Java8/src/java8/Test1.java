package java8;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,5,6,3};
int b[]=new int [a.length];
//
//int count=0;
//int count2=0;
//for(int i=0;i<a.length;i++)
//{
//	if(a[i]==0)
//	{
//		b[i]=a[i];
//		count++;
//	}
//}
//for(int i=0;i<a.length;i++)
//{
//	if(a[i]==1)
//	{
//		b[count++]=a[i];
//	}
//}
//
//for(int i=0;i<b.length;i++)
//{
//	System.out.println(b[i]);
//}

int even = 0,odd=0;
for(int i=0;i<a.length;i++)
{
	if(a[i]%2==0)
	{
		//System.out.println(a[i]);
	b[i]=a[i];
	//System.out.println(b[i]);
	even++;
	//System.out.println(even);
	
	}
}

for(int j=0;j<a.length;j++)
{
	if(a[j]%2!=0)
	{
		b[even++]=a[j];
		
	}
}
for(int z=0;z<b.length;z++)
	{
		System.out.println(b[z]);
	}






	}

}
