import java.util.Scanner;

public class Recursion{

  public static void printFib(int a,int b,int n){
    if(n==0){
        return;
    }
    int c=a+b;
    System.out.println(c);
    printFib(b, c, n-1);

  }  
public static void main(String[] args) {
    int a=0,b=1;
 
  int n;
  Scanner input = new Scanner(System.in);
  System.out.println("Enter Number: ");
  n=input.nextInt();
  System.out.println(a);
  System.out.println(b);
  printFib(a, b, n-2);
  input.close();
 }



}