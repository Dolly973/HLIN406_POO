package TP4;



public class TestPromotion {


	public TestPromotion() {

	}

	public static void main(String[] args) {


		Promotion Promo = new Promotion(2016);
		Etudiant Etu1 = new Etudiant("Valide", 1993, TP4.CodeIns.inscription, TP4.CodePays.etrfr, 10, 7, 16);
		Etudiant Etu2 = new Etudiant("Loic",1992, TP4.CodeIns.reinscription, TP4.CodePays.etrnonfr, 18,14,15);
		Etudiant Etu3 = new Etudiant("Dolly",1993, TP4.CodeIns.reinscription, TP4.CodePays.fr, 8,4,11);
		Etudiant Etu4 = new Etudiant("Camille",1993, TP4.CodeIns.inscription, TP4.CodePays.etrnonfr, 8,14,11);
		Promo.inscrire(Etu1);
		Promo.inscrire(Etu2);
		Promo.inscrire(Etu3);
		Promo.inscrire(Etu4);
		
		System.out.println("Promo = " +Promo);
		System.out.println("Etudiant numéro 0 = "+ Promo.getEtudiant(0));
		System.out.println("Etudiant numéro 1 = "+ Promo.getEtudiant(1));
		System.out.println("Moyenne Générale de la promo = "+ Promo.moyenneGenerale());
		Promo.afficheResultats();
		System.out.println("Etudiants admis :"+ Promo.admis());
		System.out.println("Nouveaux et non francophones :"+ Promo.nouveauxInscritsNonFrancophones());
		System.out.println("Major de promo :"+ Promo.majors(3));
	}
	

}
