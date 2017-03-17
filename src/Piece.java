package TP6;

public abstract class Piece {
	protected double suffixe;
	//Constructeur
	public Piece(){;}
	public Piece(double s){
		this.suffixe=s;
	}
	//Accesseurs
	public double getSuffixe() {
		return suffixe;
	}
	public void setSuffixe(double suffixe) {
		this.suffixe = suffixe;
	}
	@Override
	public String toString() {
		return "Piece [suffixe=" + suffixe + "]";
	}
	
}
