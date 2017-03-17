package TP5;

import java.util.ArrayList;

public class Abonne extends Personne{

	private String numeroAbonne;
	private ArrayList <Exemplaire>exemplaireEmprunter;
	
	public Abonne(){;}
	public Abonne(String n){
		this.numeroAbonne= n;
	}
	public String getNumeroAbonne() {
		return numeroAbonne;
	}
	public void setNumeroAbonne(String num) {
		this.numeroAbonne = num;
	}
	public void emprunte(Exemplaire e){
		if (exemplaireEmprunter.size()<5 && e.emprunte(this))
		{exemplaireEmprunter.add(e);}
	}
	public boolean rendre(Exemplaire e )
}

