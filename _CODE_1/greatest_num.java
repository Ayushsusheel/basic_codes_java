import java.util.Scanner;
public class Main 
{
    
    public static void main(String[] aaa)
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(a>b && a>c)
          System.out.print(a + ": is greatest  of all");
       else if(b>a && b>c)
           System.out.print(b+ ": is greatest of all ");
       else 
           System.out.print( c +": is greatest of all" );
       
       
        
    }
}

