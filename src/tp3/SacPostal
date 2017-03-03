package TP3;

import java.util.ArrayList;

public class SacPostal {

	private ArrayList<ObjetPostal> contenu;
	private double capaciteMax; //en m³
	private double capacite; //en m³

	public SacPostal() {
		this.capaciteMax = 0.5;
		this.capacite = capaciteMax - 0.05;
	}
	public SacPostal( double cMx) {
		contenu = new ArrayList<ObjetPostal>();
		this.capaciteMax = cMx;
		this.capacite = cMx - 0.05;
	}
	public double getCapaciteMax() {
		return capaciteMax;
	}
	public void setCapaciteMax(double cMx) {
		this.capaciteMax = cMx;
	}
	public double getCapacite() {
		return capacite;
	}
	public void setCapacite(double capacite) {
		this.capacite = capacite;
	}

	public boolean ajouter(ObjetPostal obj){
		boolean b = true;
		double v = obj.getVolume();
		if(v<= capacite){ 
			this.contenu.add(obj);
			this.setCapacite(capacite - v);	
		}
		else b = false;
		return b;
	}
	public 
	public double valeurRemboursement(){

		return 0;

	}

}
