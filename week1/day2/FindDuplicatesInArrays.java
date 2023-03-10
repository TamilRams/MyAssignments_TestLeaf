package week1.day2;

import java.util.Arrays;

public class FindDuplicatesInArrays {
	
	int a[]= {1,4,7,3,8};
	
	int b;

	
	public static void main(String[] args) {
		int num[]= {2,5,7,7,5,9,2,3};
		//OP 2,5,7
		//Arrays.sort(num);
		
		//2 2 3 5 5 7 7 9
		
		for(int i=0;i<num.length-1;i++)
		{
			
			for(int j=i+1;j<num.length-1;j++)// 0 1  0 2  0 3  0 4
			
			{
				if(num[i]==num[j])
				{
					System.out.println("Duplicates numbers  : "+num[i]);
					
				}
			}
		
			
		}
		
	
		
		
		
	}

}
