package ArrayPrograms;

import java.util.Arrays;

public class SegregatezeroEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,4,5,6,0,0,1,0,0,1,0};
int count=0;

for(int i=0;i<a.length;i++)
{
	if(a[i]!=0)
	{
		count++;
	}
}

for(int i=0;i<count;i++)
{
	a[i]=a[i];
}
for(int i=count;i<a.length;i++)
{
	a[i]=0;
}
System.out.println(Arrays.toString(a));
	}

}
