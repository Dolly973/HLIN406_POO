package tp1.Application;

//package 08_Application;

import java.util.Scanner;

public class Divisions{


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.print("un entier  e1? ");
    int e1 = sc.nextInt();
    System.out.print("un entier  e2? ");
    int e2 = sc.nextInt();
    System.out.print("un Flottant  f1? ");
    float f1 = sc.nextFloat();
      System.out.print("un Flottant  f2? ");
    float f2 =sc.nextFloat();
    int divisionEntier = e1/e2;
    float divisionFlottant = f1/f2;
    System.out.println("Division Entier ="+divisionEntier+" Division Flottant = "+divisionFlottant);
  }
  }
