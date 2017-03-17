package TP5;

import java.util.ArrayList;

public class Exemplaire {
	private boolean emprunt;
	private Etat etat;
	private boolean enReparation;
	private ArrayList <Abonne> abonne;

	//Constructeur
	public Exemplaire(){
		this.emprunt = false;
		this.enReparation =false;
		this.etat = null;
	}
	public Exemplaire( boolean emp, Etat e, boolean eR){
		this.emprunt= emp;
		this.enReparation = eR;
		this.etat = e;
	}
	
	//Accesseurs
	public boolean isEmprunt() {
		return emprunt;
	}
	public void setEmprunt(boolean emprunt) {
		this.emprunt = emprunt;
	}
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	public boolean isEnReparation() {
		return enReparation;
	}
	public void setEnReparation(boolean enReparation) {
		this.enReparation = enReparation;
	}
	public ArrayList<Abonne> getAbonne() {
		return abonne;
	}
	public void setAbonne(ArrayList<Abonne> abonne) {
		this.abonne = abonne;
	}
	
	
	
	//Methodes
public boolean emprunte(Abonne a){
	return true;
}
public boolean rendre(){
	return false;
}
public boolean disponible(){
	return true;
}
public boolean mettreReparation(){
	return true;
}
public boolean mettreAJour(){
	return false;
}
}

