package tp4;

public class TestEtudiant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public TestEtudiant(){	
		//}
		Etudiant Dolly = new Etudiant("Valide Dolores", 1993, tp4.CodeIns.inscription, tp4.CodePays.etrfr, 18, 7, 16);
		
		System.out.println("Etudiant " + Dolly.ligneResultats());
		System.out.println("Mention= " + Dolly.mention());
	}

}
