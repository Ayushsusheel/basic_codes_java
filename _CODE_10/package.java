

------->First create a package a folder name as Balance..
        inside that folder create a new .java file named as Account
        
        

package Balance;
public class Account
{
  public void Display_Balance(int x)
   { 
      System.out.println("balance is:" + x );   
     
   }



}
---------------------------------------------------------------->till this code.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



 -->Now create a new .java file in which we'll be importing our user created package named as Balance 
  create a file named as importing_package_balance(as per your choice) in that pass int type of arguement 
 
 
  import Balance.*;

class importing_package_balance
{

  public static void main(String[] args)
    { 
       Account object=new Account();
       object.Display_Balance(10000); 
      

    }


}



----->NOTE!!!-
  1-compile package as ----------------------------->javac ./Balance/Account.java
  
  2-the package folder and the file in which we'll be importing our package should be at same location (i.e. same folder)
  
  3- compile the java file-->importing_package_balance in cmd as 
  --------->javac importing_package_balance
  --------->java importing_package_balance
  
  
 ------>OUTPUT---> balance is:10000
