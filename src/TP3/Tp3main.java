package TP3;

public class Tp3main {

	public Tp3main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		String o = "Montpellier";
		String d = "Martinique";
		String cp = "NYPD";
		double p = 20;

		double v = 1;
		double v1 = 2/8;
		double v2 = 1/8;

		TauxRec t =  TauxRec.zero ;
		TauxRec t1 =  TauxRec.un ;
		TauxRec t2 =  TauxRec.deux ;

		ObjetPostal lettre = new Lettre(o, d, cp, p, v, t, false) ;
		System.out.println("lettre : " +lettre);
		System.out.println("TarifAffranchissement : " +lettre.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +lettre.tarifRemboursement());

		ObjetPostal lettre1 = new Lettre(o, d, cp, p, v, t1, false) ;
		System.out.println("lettre1 : " +lettre1);
		System.out.println("TarifAffranchissement : " +lettre1.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +lettre1.tarifRemboursement());

		ObjetPostal lettre2 = new Lettre(o, d, cp, p, v, t2, false) ;
		System.out.println("lettre2 : " +lettre2);
		System.out.println("TarifAffranchissement : " +lettre2.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +lettre2.tarifRemboursement());



		ObjetPostal lettre0 = new Lettre(o, d, cp, p, v, t, true) ;
		System.out.println("lettre0 : " +lettre0);
		System.out.println("TarifAffranchissement : " +lettre0.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +lettre0.tarifRemboursement());

		ObjetPostal lettre10 = new Lettre(o, d, cp, p, v, t1, true) ;
		System.out.println("lettre10 : " +lettre10);
		System.out.println("TarifAffranchissement : " +lettre10.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +lettre10.tarifRemboursement());

		ObjetPostal lettre20 = new Lettre(o, d, cp, p, v, t2, true) ;
		System.out.println("lettre20 : " +lettre20);
		System.out.println("TarifAffranchissement : " +lettre20.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +lettre20.tarifRemboursement());



		String c = "pomme lambi pain" ;
		double vd = 20 ;

		ObjetPostal colis =  new Colis(o, d, cp, p, v, t, c, vd) ;
		System.out.println("colis : " +colis);
		System.out.println("TarifAffranchissement : " +colis.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +colis.tarifRemboursement());

		ObjetPostal colis0t1 =  new Colis(o, d, cp, p, v, t1, c, vd) ;
		System.out.println("colis0t1 : " +colis0t1);
		System.out.println("TarifAffranchissement : " +colis0t1.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +colis0t1.tarifRemboursement());

		ObjetPostal colis0t2 =  new Colis(o, d, cp, p, v, t2, c, vd) ;
		System.out.println("colis0t2 : " +colis0t2);
		System.out.println("TarifAffranchissement : " +colis0t2.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +colis0t2.tarifRemboursement());


		ObjetPostal colis1 =  new Colis(o, d, cp, p, v1, t, c, vd) ;
		System.out.println("colis1 : " +colis1);
		System.out.println("TarifAffranchissement : " +colis1.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +colis1.tarifRemboursement());

		ObjetPostal colis1t1 =  new Colis(o, d, cp, p, v1, t1, c, vd) ;
		System.out.println("colis1t1 : " +colis1t1);
		System.out.println("TarifAffranchissement : " +colis1t1.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +colis1t1.tarifRemboursement());

		ObjetPostal colis1t2 =  new Colis(o, d, cp, p, v1, t2, c, vd) ;
		System.out.println("colis1t2 : " +colis1t2);
		System.out.println("TarifAffranchissement : " +colis1t2.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +colis1t2.tarifRemboursement());


		ObjetPostal colis2 =  new Colis(o, d, cp, p, v2, t, c, vd) ;
		System.out.println("colis2 : " +colis2);
		System.out.println("TarifAffranchissement : " +colis2.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +colis2.tarifRemboursement());

		ObjetPostal colis2t1 =  new Colis(o, d, cp, p, v2, t1, c, vd) ;
		System.out.println("colis2t1 : " +colis2t1);
		System.out.println("TarifAffranchissement : " +colis2t1.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +colis2t1.tarifRemboursement());

		ObjetPostal colis2t2 =  new Colis(o, d, cp, p, v2, t2, c, vd) ;
		System.out.println("colis2t2 : " +colis2t2);
		System.out.println("TarifAffranchissement : " +colis2t2.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +colis2t2.tarifRemboursement());

		String  dE =" le 01 janvier 2017";
		Emballage e = Emballage.PosteLaponaise;
		Emballage e1 = Emballage.Autre;

		ObjetPostal colisExpress =  new ColisExpress(o, d, cp, p, v2, t, c, vd, dE,e) ;
		System.out.println("colisExpress : " +colisExpress);
		System.out.println("TarifAffranchissement : " +colisExpress.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +colisExpress.tarifRemboursement());
		
		ObjetPostal colisExpress1 =  new ColisExpress(o, d, cp, p, v2, t, c, vd, dE,e1) ;
		System.out.println("colisExpress : " +colisExpress1);
		System.out.println("TarifAffranchissement : " +colisExpress1.tarifAffranchissement());
		System.out.println("TarifRemboursement : " +colisExpress.tarifRemboursement());
	}

}
