package TP5;

import java.util.ArrayList;

public class NoticeBibliographique {

	protected String iSBN;
	private String titre;
	private String sousTitre;
	private ArrayList <Personne> contributeur;
	private Public publique;
	private ArrayList <Exemplaire> exemplaire;
	
	public void setExemplaire(ArrayList<Exemplaire> exemplaire) {
		this.exemplaire = exemplaire;
	}
	public NoticeBibliographique(){
		this.iSBN = "";
		this.titre = "";
		this.sousTitre = "";
		this.contributeur = null;
		this.publique = null;
		this.exemplaire = null;
	}
	public NoticeBibliographique(String is, String t, String ssT, Public p){
		this.iSBN = is;
		this.titre = t;
		this.sousTitre = ssT ;
		contributeur = new ArrayList <Personne>();
		this.publique = p;
		exemplaire = new ArrayList <Exemplaire>();
	}
	public String getISBN() {
		return iSBN;
	}
	public void setISBN(String is) {
		this.iSBN = is;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getSousTitre() {
		return sousTitre;
	}
	public void setSousTitre(String sousTitre) {
		this.sousTitre = sousTitre;
	}
	public Public getPublique() {
		return publique;
	}
	public void setPublique(Public publique) {
		this.publique = publique;
	}
	public ArrayList<Exemplaire> getExemplaire() {
		return exemplaire;
	}
	public boolean estDisponible(){
		return false;
		
	}
}
