package TP2;

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

	public Etudiant(String leNom, int d, CodeIns ci, CodePays cp, float n1, float n2, float n3){
	nom=leNom;
	this.dateDeNaissance = d;
	this.codePays = cp;
	this.codeIns = ci;
	this.age = 2017 - this.dateDeNaissance;
	this.note1 = n1;
	this.note2 = n2;
	this.note3 = n3;
	}
	public String getNom(){
		return nom;
	}
	public String getcodeIns(){
		return this.codeIns;
	}
	public String getcodePays(){
		return this.codePays;
	}

	public float moyenne(){
		double moyenne=(note1+note2+note3)/3;
		return moyenne; 
	}
	public String mention(){
	double M = this.moyenne;
		String mention = "";
	if (M >= 12) {
	mention = "Mention assez Bien";
	}
	if (M >= 14) {
	mention = "Mention bien";
	}
	if (M >= 16) {
	mention = "Mention tres bien";
	}
		}

//public String toString(){
//	return "nom"+getNom()+"age"+getAge()+"dateDeNaissance"+getDateDeNaissance()+"codeIns"+getCodeIns+"codePays"+get
}