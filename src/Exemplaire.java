package TP5;

public class Exemplaire {
	private boolean empruntE;
	private Etat etat;
	private boolean enReparation;

	public Exemplaire(){
		this.empruntE = null != null ;
		this.enReparation = null != null;
		this.etat = null;
	}
	public Exemplaire( boolean emp, Etat e, boolean eR){
		this.empruntE= emp;
		this.enReparation = eR;
		this.etat = e;
	}
public boolean emprunte(){
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
