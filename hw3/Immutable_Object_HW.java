import java.util.Scanner;
public class Immutable_Object_HW 
{
  public static void main(String[]args) 
  {
	  /***************PART 1*****************************/
	  double fahrenheit;
	  double centigrd;
	  fahrenheit=(float)98.6;
	  centigrd= (float)(5.0/9.0)*(fahrenheit-32);
	 System.out.print(" Temperature in Fahrenheit: "+fahrenheit+"\n");
	 System.out.println("Tempurature in Centigrade: "+centigrd);
	 int i=0;
	 while(i<=40.0)
	 {
		 System.out.println("The temperature in Fahrenheit for i is "+(i-32)*(5.0/9));
		 i+=4;
	 }
	 
	 
	 for(int j=0; j<=40.0;j+=4) 
	 {
		 System.out.println("The temperature in Fahrenheit for j is "+(j-32)*(5.0/9));
	 }
    
	  
  }
  /****************PART 2*********************************/
  public static void stopChecking() 
  {
	  Scanner sc= new Scanner(System.in);
	 String[][] myArrs={{"Honda","Toyota","Nissan"},{"Pancakes","Omlet","Mushroom"}};
	 boolean isIn;
	 String inptWrds;
	 System.out.println("Enter a Word");
	 inptWrds=sc.nextLine();
	 for(int i=0; i<myArrs.length;i++) 
	 { 
		 for(int j=0; j<i; i++) 
		 {
			 
		 }
	 }
  }
   
}
