A Java code that converts int to Integer,
converts Integer to String,
converts String to int, 
converts int to String,
converts String to Integer
converts Integer to int.



public class Main 
{
    public static void main(String[]argsssss)
    {
      int a=10;
      Integer I=new Integer(a);//-----------------------------------------------[WRAPPING]
      System.out.println("int to INT--->" + I);
      
      Integer B=100;
      String s=String.valueOf(B);//------------------------------------------------------[CONVERSION]
      System.out.println("INT TO STRING--->" + s);
      
      String S="100";//HELLO
      int c=Integer.parseInt(s);//------------------------------------------------------[CONVERSION]
      System.out.println("STRING TO int----->" + 100 +  c  );
    
       int d=100;
       String ss=String.valueOf(d);//------------------------------------------------------[CONVERSION]
       System.out.println("int to STRING--->" + 100 + ss);
       
       String sss="100";
       Integer iii=Integer.parseInt(sss);//------------------------------------------------------[CONVERSION]
       System.out.println("STRING TO INTEGER---->" + iii);
       
      // int q=100;
      // Integer w=new Integer(q);
       int wwww=I.intValue();//---------------------------------------------------------------------[UN-WRAPPING]
       System.out.println("INTEGER TO int----->" + wwww);
      
      
      
      
        
        
        
    }
}



  
  
[desired-----output]-------------------------->
  
  
int to INT--->10                                                                                                                
INT TO STRING--->100                                                                                                            
STRING TO int----->100100                                                                                                       
int to STRING--->100100                                                                                                         
STRING TO INTEGER---->100                                                                                                       
INTEGER TO int----->10                                                                                                          
                                                                                                                                
  


