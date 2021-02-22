import java.util.Scanner;
class fibbo 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.");
    int number=sc.nextInt();
    int a=0,b=1;
   
    for(int i =0;i<number;i++)
    {
         System.out.print(a + " " );
        int sum=a+b;
        a=b;
        b=sum;
        
    }
  }
 
}

 
