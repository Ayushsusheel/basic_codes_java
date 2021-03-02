import java.util.Scanner;
public class Main 
{
    public static void main(String[]agg)
    {
        //Scanner sc=new Scanner(System.in);
        //System.out.println("enter no");
        
        //int number=sc.nextInt();
        //int num2=sc.nextInt();
        
        System.out.println("ur table from 1 to 10  is --->");
        for(int outer=1;outer<=10;outer++)//-----------------------------------------(outer<=25) it will execute the statement till 25//
        {   //int aa=o;
                    for(int inner=1;inner<=10;inner++)
                    {
                           int j=1;
                              //int k=1;
                           j=inner*outer;
                            // k=i*num2;
                          System.out.print( " "  +  "  "  +  j  + "   " + "  ");
                          //System.out.println(k);
            

                     }
        System.out.println();
        }
    }
    
    
}

output is in this format--->
  
  ur table from 1 to 10 is --->                                                                                                                
   1        2        3        4        5        6        7        8        9        10                                          
   2        4        6        8        10        12        14        16        18        20                                     
   3        6        9        12        15        18        21        24        27        30                                    
   4        8        12        16        20        24        28        32        36        40                                   
   5        10        15        20        25        30        35        40        45        50                                  
   6        12        18        24        30        36        42        48        54        60                                  
   7        14        21        28        35        42        49        56        63        70                                  
   8        16        24        32        40        48        56        64        72        80                                  
   9        18        27        36        45        54        63        72        81        90                                  
   10        20        30        40        50        60        70        80        90        100                                
                                                                                                                                
                                                                                                                                
...Program finished with exit code 0                                                                                            
Press ENTER to exit console.  ----------------------------->when we run this code on online compiler.
  
  
  
  if we want from 1 to 25 simply increment the value then the output is like->
    
    
    ur table is --->                                                                                                                
   1        2        3        4        5        6        7        8        9        10                                          
   2        4        6        8        10        12        14        16        18        20                                     
   3        6        9        12        15        18        21        24        27        30                                    
   4        8        12        16        20        24        28        32        36        40                                   
   5        10        15        20        25        30        35        40        45        50                                  
   6        12        18        24        30        36        42        48        54        60                                  
   7        14        21        28        35        42        49        56        63        70                                  
   8        16        24        32        40        48        56        64        72        80                                  
   9        18        27        36        45        54        63        72        81        90                                  
   10        20        30        40        50        60        70        80        90        100                                
   11        22        33        44        55        66        77        88        99        110                                
   12        24        36        48        60        72        84        96        108        120                               
   13        26        39        52        65        78        91        104        117        130                              
   14        28        42        56        70        84        98        112        126        140                              
   15        30        45        60        75        90        105        120        135        150                             
   16        32        48        64        80        96        112        128        144        160                             
   17        34        51        68        85        102        119        136        153        170                            
   18        36        54        72        90        108        126        144        162        180                            
   19        38        57        76        95        114        133        152        171        190                            
   20        40        60        80        100        120        140        160        180        200                           
   21        42        63        84        105        126        147        168        189        210                           
   22        44        66        88        110        132        154        176        198        220                           
   23        46        69        92        115        138        161        184        207        230                           
   24        48        72        96        120        144        168        192        216        240                           
   25        50        75        100        125        150        175        200        225        250      
    
    
    
    
    
    
