package week1.day1;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnum =0;
				int secondnum = 1;
				int sum = 0;
		System.out.println(firstnum);
		System.out.println(secondnum);
		
		//for (firstnum=0;firstnum<=21;)
		for (int i=1;i<11;i++)
		{
			//0+1
			sum =firstnum+secondnum;
			System.out.println(sum);
			firstnum = secondnum;
			secondnum = sum;
			
//			if (sum==56) {break;
//				
//			}
//			
			
			
		}
	}

}
