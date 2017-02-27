package tp4;

public class Etudiant
{
	//Les attributs
	private String nom; //nom de l'étudiant
	private int dateDeNaissance; //date de naissance
	private CodeIns codeIns; // code inscription
	private CodePays codePays;
	private float note1;
	private float note2;
	private float note3;
	private int age;

	//Constructeurs
	public Etudiant(String nomEtu, int dEtu, CodeIns ciEtu, CodePays cpEtu, float n1, float n2, float n3){
		nom = nomEtu;
		dateDeNaissance = dEtu;
		codePays = cpEtu;
		codeIns = ciEtu;
		age = 2017 - dEtu;
		note1 = n1;
		note2 = n2;
		note3 = n3;
	}
	public Etudiant() {
		nom = "NotFound";
	}
	//Accesseurs5444
	//Retourne le nom de l'etudiant
	public String getNom(){
		return nom;
	}
	//Retourne le code d'inscription
	public CodeIns getCodeIns(){
		return codeIns;
	}
	//Retourne le type d'etudiant
	public CodePays getCodePays(){
		return codePays;
	}
	//Retourne la date de naissance de l'etudiant
	public int getDateDeNaissance(){
		return dateDeNaissance;
	}
	// Mutateurs
	//Definit le nom de l'etudiant
	public void setNom(String nomEtu){
		nom = nomEtu;
	}
	//Definit sa date de naissance
	public void setDateDeNaissance(int dEtu){
		dateDeNaissance = dEtu;
	}
	//Definit son age
	public void setAge(int aEtu){
		age = aEtu;
	}
	//Definit son code d'inscription
	public void setCodeIns(CodeIns ciEtu){
		codeIns = ciEtu;
	}
	//Definit son code de pays
	public void setCodePays(CodePays cpEtu){
		codePays = cpEtu;
	}
	// Methodes
	//Calcul de la moyenne
	public  double moyenne(){
		double moyenne=(note1+note2+note3)/3;
		return moyenne;
	}
	public String mention(){
		double M = moyenne();
		String mention= "";
		if (M >= 12) {
			mention = "Mention assez Bien";
		}
		if (M >= 14) {
			mention = "Mention bien";
		}
		if (M >= 16) {
			mention = "Mention tres bien";
		}
		return mention;
	}
	public String ligneResultats(){
		return "Nom = " + nom + " Moyenne = "+ moyenne()+ " Mention = " + mention();
	}
	public String toString(){
		return "Nom = " + nom + " age = " + age + " Né le = "+ dateDeNaissance + " codeIns = " + codeIns + " codePays= " + codePays;
	}
}
