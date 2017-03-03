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
		if(obj.getVolume()<= capacite){ 
			this.contenu.add(obj);
			this.setCapacite(capacite - obj.getVolume());
		}
		else b = false;
		return b;
	}
	public boolean retirer(ObjetPostal obj){
		boolean b = this.contenu.remove(obj);
		if (b)  {this.setCapacite(this.capacite + obj.getVolume());
		}
		return b;
	}
	public double capaciteRestante(){
		return this.capaciteMax - this.capacite;
	}
	public double valeurRemboursement(){

		return 0;

	}
