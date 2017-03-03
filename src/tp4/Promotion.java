package tp4;

import java.util.ArrayList;

public class Promotion {
	public int annee;
	private ArrayList <Etudiant> collection;

	//Constructeur par défaut
	public Promotion() {
		this.annee = 0;
		this.collection = null;
	}
	//Constructeur normal
	public Promotion(int annee) {
		this.annee = annee;
		collection = new ArrayList<Etudiant>();
	}
	//Getteurs et Setteurs
	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public ArrayList<Etudiant> getCollection() {
		return collection;
	}
	public void setCollection(ArrayList<Etudiant> collection) {
		this.collection = collection;
	}
	//Methodes
	public Etudiant getEtudiant(int i){
		return collection.get(i);
	}
	public int getNbrEtudiants(){
		return collection.size();
	}
	public void inscrire(Etudiant etu){
		this.collection.add(etu);
	}
	public int moyenneGenerale(){
		int M = 0;
		for(Etudiant etu : this.collection){
			M += etu.moyenne();
		}
		return M/this.getNbrEtudiants();
	}
	public void afficheResultats(){
		for(Etudiant etu : this.collection){
			System.out.println("affiche les résultats = "+ etu.ligneResultats());
		}
	}
	public Etudiant recherche(String nom){
		for (Etudiant etu : this.collection){
			if (etu.getNom().equals(nom))
			return etu;
		}
		return new Etudiant();
	}
		public  ArrayList<Etudiant> admis(){
		ArrayList<Etudiant> admis = new ArrayList<Etudiant>();
		for (Etudiant etu : this.collection){
			if (etu.moyenne()>= 10 )
				admis.add(etu);
		}
		return admis;
	}
	public ArrayList<Etudiant> nouveauxInscritsNonFrancophones(){
		ArrayList<Etudiant> nouveauxInscritsNonFrancophones = new ArrayList<Etudiant>();
		for (Etudiant etu : this.collection){
			if (etu.getCodePays().equals(CodePays.etrnonfr) && etu.getCodeIns().equals(CodeIns.inscription))
				nouveauxInscritsNonFrancophones.add(etu);
		}
		return nouveauxInscritsNonFrancophones;
	}
	//public ArrayList<Etudiant> leMajorDePromo(){
		//ArrayList<Etudiant> leMajorDePromo = new ArrayList<Etudiant>();
		//for (Etudiant etu : this.collection){
			//if (etu.)
		//}
	//}
	// partie prise sur un autres etudiant, pas tres bien comprise
	public int meilleur(ArrayList<Etudiant> A){
		int meilleur = 0;
		for(int i = 1; i < A.size(); i++)
			if(A.get(i).moyenne() > A.get(meilleur).moyenne()){
				meilleur = i; 
			}
		return meilleur;
	}

	public ArrayList<Etudiant> majors(int nb){
		ArrayList<Etudiant> promo = (ArrayList<Etudiant>)this.collection.clone();
		ArrayList<Etudiant> majors = new ArrayList<Etudiant>();
		for(int i = 0; i < nb && !promo.isEmpty(); i++){
			int meilleur = meilleur(promo);
			majors.add(promo.get(meilleur));
			promo.remove(meilleur);
		}
		return majors;
	}
@Override
public String toString() {
	return "Promotion [annee=" + annee + ", Nombres Etudiants=" + getNbrEtudiants()
	+"]";
}

}
