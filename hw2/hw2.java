public class HW2
{
  public static void main(String[]args)
  {
	int[] numArr={9,12,4,6,18,27,};
     int sum =m1(numArr);
     System.out.print(sum);
  }

    public int m1 (int[]arr)
  	{
	 int sum=0;
             for(int i=0;i<=arr.length;i++)
	     {
               if(arr[i]>i &&arr[i]%9==0)
	       {
                  sum+=arr[i];
	       }
	     }
		return sum;

  	}
 

} 
