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
@Override
public String toString() {
	return "Promotion [annee=" + annee + ", Nombres Etudiants=" + getNbrEtudiants()
	+"]";
}

}
