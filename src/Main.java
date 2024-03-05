import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Operator(\"+\",\"-\",\"*\",\"/\"):");
        char operator=sc.next().charAt(0);
        System.out.println("Enter First Number: ");
        double a=sc.nextDouble();
        System.out.println("Enter Second Number: ");
        double b=sc.nextDouble();
        double ans = 0;
        switch(operator)
        {
            case'+':
                ans=a+b;
                break;
            case'-':
                ans=a-b;
                break;
            case'*':
                ans=a*b;
                break;
            case'/':
                ans=a/b;
                break;
            default:
                System.out.println("You enter wrong input");
        }
        System.out.print("Result-> ");
        System.out.print(a+" "+operator+" "+b+" = "+ans );

    }
}