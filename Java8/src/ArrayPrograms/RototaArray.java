package ArrayPrograms;

import java.util.Arrays;

public class RototaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,2,6,8,1};
		int i,j, k=0;
		int count=0;
	int start=1; 
	int end=5;
		//rotate left array
		while(start<end)
		{
			int temp=a[0];//7
		for(i=0;i<a.length-1;i++)
		{
			
		a[i]=a[i+1];
		//count++;
		}
		a[i]=temp;
		start++;
		}
		//rottaet array right side
		while(start<end)
		{
			int temp1=a.length-1;//7
		for(i=a.length-1;i>=0;i--)
		{
			
		a[i]=a[i-1];
		//count++;
		}
		a[i]=temp1;
		start++;
		}
		
		
		System.out.println(Arrays.toString(a));
	}

}
