Write a program to accept 10 student’s marks in an array, arrange it into ascending order, convert into the following grades and print marks and grades in the tabular form. 

Between 40 and 50 : PASS 
Between 51 and 75 : MERIT 
 	and above : DISTINCTION





---->CODE:




import java.util.Arrays;
 import java.util.Scanner;
 class grade 
 {
 public static void main(String [] args) 
 {
 Scanner sc=new Scanner(System.in);
 int Marks[]=new int[10];
 System.out.println("Enter Marks of Students");
 for(int i=0;i<10;i++)
 {
 Marks[i]=sc.nextInt();
 }
 Arrays.sort(Marks);
 System.out.println("Marks and grades of each student after sorting:");
 for(int i=0;i<10;i++) 
 {
 if(Marks[i]>=40&&Marks[i]<=50)
 {
 System.out.println(Marks[i]+" "+"PASS");
 }
 else if(Marks[i]>50&&Marks[i]<=75)
 {
 System.out.println(Marks[i]+" " +"MERIT");
 }
 else if(Marks[i]>75)
 {
 System.out.println(Marks[i]+" "+"DISTINCTION");
 }
 else 
      System.out.println(Marks[i]+ " " + "FAIL");
 }
 }
 }
 
 
 
 
 
 --------------------------------------T H A N K Y O U ---------------------------------------
