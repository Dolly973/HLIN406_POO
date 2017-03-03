package TP3;

public class TestSacPostal {

	public static void main(String[] args) {

		String o = "Montpellier";
		String d = "Martinique";
		String cp = "NYPD";
		double p = 20;

		double v = 0.03;
		double v1 = 2/8;
		double v2 = 1/8;

		TauxRec t =  TauxRec.zero ;
		TauxRec t1 =  TauxRec.un ;
		TauxRec t2 =  TauxRec.deux ;

		SacPostal S1 = new SacPostal(0.5);
		ObjetPostal l1 = new Lettre(o, d, cp, p, v, t, false);
		System.out.println("Capacite restante "+ S1.getCapacite());
		System.out.println("je peux ajouter ? "+ S1.ajouter(l1));
		System.out.println("Capacite occupée "+ S1.capaciteRestante());
		System.out.println("Capacite restante "+ S1.getCapacite());
		System.out.println("Je retire "+ S1.retirer(l1));
		System.out.println("Capacite restante "+ S1.getCapacite());
		System.out.println("Capacite occupée "+ S1.capaciteRestante());

	}

}
