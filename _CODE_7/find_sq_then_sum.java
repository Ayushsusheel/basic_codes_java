Write a Java Program to accept 10 numbers in an array and compute the square of each number. Print the sum of these numbers.


--->CODE:



import java.util.Scanner;
class arr_sum_sq
{
  public static void main (String[]args)
  {
    int num, sum = 0, sq;
    Scanner sc = new Scanner(System.in);
      System.out.print ("Enter no. of elements :");
      num = sc.nextInt ();
    int a[] = new int[num];
      System.out.println ("Enter all the elements:");
    for (int i = 0; i < num; i++)
      {
	a[i] = sc.nextInt ();
	sum = sum + a[i];
	sq = a[i] * a[i];
	System.out.println ("Square:" + sq);
      } System.out.println ("Sum:" + sum);
}
    
}
