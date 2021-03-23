import java.util.*;//-------------------------------------(or java.util.ArrayList)
class first 
{
    int a,b;
}
class second implements Cloneable
{
    int x,y;
    first object1=new first();
    public Object clone() throws CloneNotSupportedException
    {
       return super.clone(); 
    }
    
}
public class Main 
{
    public static void main(String []  argg) throws CloneNotSupportedException
    {
        second object2 =new second();
        object2.x=10;
        object2.y=20;
        object2.object1.a=10;
        object2.object1.b=100;
        
        second obj3=(second)object2.clone();
        
        obj3.object1.a=1000;
        System.out.println(obj3.x + " " + obj3.y + " " + obj3.object1.a + " " + obj3.object1.b);
       // System.out.println(object2.x +  " " + obj3.x + " " + obj3.object1.a + " " + object2.object1.a ) ;
        
    }
}










