package tp1.MesPremieresClasses;
import java.io.*;
import java.util.Scanner;

public class TestScanner
{
  public static void main(String[] a)
  {
    Scanner sc =new Scanner(System.in);

    //java.util.InputMismatchException
    /*
    while (i == -1)
    {
      
    try { 
    	System.out.print("un entier ? ");
    	i = sc.nextInt();   	
    	}
    catch (Exception e) {
    		System.out.println(e); 
    	}
    }
    */

    System.out.print("un entier ? ");
	int i = sc.nextInt();  
    System.out.print("entier lu : "+i+"\n");

    System.out.print("une chaine ? ");
    String s = sc.next();
    System.out.print("chaine lue : "+s+"\n");

    System.out.print("un flottant ? ");
    float f = sc.nextFloat();
    System.out.print("flottant lu : "+f+"\n");

    System.out.print("un double ? ");
    double d = sc.nextDouble();
    System.out.print("double lu : "+d+"\n");

    System.out.print("un caractere ? ");
    s = sc.next();
    while (s.length()>1)
    {
      System.out.print("vous n'avez pas entré un caractère\n");
      s = sc.next();
    }
    char c=s.charAt(0);
    System.out.print("caractere lu : "+c+"\n");

    System.out.print("un booléen ? ");
    boolean b = sc.nextBoolean();
    System.out.print("booléen lu : "+b+"\n");
  }
}
