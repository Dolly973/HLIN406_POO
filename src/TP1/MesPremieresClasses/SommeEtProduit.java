package TP1.MesPremieresClasses;

import java.util.Scanner;

public class SommeEtProduit {
  public static void main(String[] a) throws java.io.IOException
  {
    double x, y;
    if (a.length > 0)
    {
      x = Double.valueOf(a[0]);
      y = Double.valueOf(a[1]);
    }
    else
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("entrez deux doubles ");
      x = sc.nextDouble();
      y = sc.nextDouble();
    }
      double somme = x+y;
      double produit = x*y;
      System.out.println("somme = "+somme+" produit = "+produit);
   }

}
