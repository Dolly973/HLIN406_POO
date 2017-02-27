package tp4;



public class TestPromotion {


	public TestPromotion() {
	
	}

	public static void main(String[] args) {
	
		
		Promotion Promo = new Promotion(2016);
		Etudiant Etu1 = new Etudiant("Valide", 1993, tp4.CodeIns.inscription, tp4.CodePays.etrfr, 10, 7, 16);
		Etudiant Etu2 = new Etudiant("Loic",1992, tp4.CodeIns.reinscription, tp4.CodePays.fr, 18,14,15);
		
		Promo.inscrire(Etu1);
		Promo.inscrire(Etu2);
		
		System.out.println("Promo = " +Promo);
		System.out.println("Etudiant numéro 0 = "+ Promo.getEtudiant(0));
		System.out.println("Etudiant numéro 1 = "+ Promo.getEtudiant(1));
		System.out.println("Moyenne Générale de la promo = "+ Promo.moyenneGenerale());
Promo.afficheResultats();
	}

}
