
public class Sample implements Cloneable
{
int rollno;  
String name;  
  
public Sample(int rollno,String name)
{  
this.rollno=rollno;  
this.name=name;  
}  
  
public Object clone()throws CloneNotSupportedException
{  
return super.clone();  
}  

  
public static void main(String args[])
{  
try
{  
Sample obj=new Sample(01,"A Y U S H ");  
  
Sample obj2=(Sample)obj.clone();  
  
System.out.println(obj.rollno+" "+obj.name);  
System.out.println(obj2.rollno+" "+obj2.name);  
  
}
catch(CloneNotSupportedException E)
{
    System.out.println("ERROR" + E);
    
}  
  
}  
}
