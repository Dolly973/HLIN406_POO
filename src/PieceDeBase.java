package TP6;

public class PieceDeBase extends Piece{
protected static int prefixe;
protected double prix;
protected double dureeGarantie;
protected double dureeFabrication;
//Constructeurs
public PieceDeBase() {
	super();
	this.prix = 0;
	this.dureeGarantie = 0;
	this.dureeFabrication = 0;
	
	// TODO Auto-generated constructor stub
}
public PieceDeBase(double s,double prix, double dureeGarantie, double dureeFabrication) {
	super(s);
	this.prix = prix;
	this.dureeGarantie = dureeGarantie;
	this.dureeFabrication = dureeFabrication;
}
//Accesseurs
public static int getprefixe() {
	return prefixe;
}

public static void setprefixe() {
	PieceDeBase.prefixe = 00;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public double getDureeGarantie() {
	return dureeGarantie;
}
public void setDureeGarantie(double dureeGarantie) {
	this.dureeGarantie = dureeGarantie;
}
public double getDureeFabrication() {
	return dureeFabrication;
}
public void setDureeFabrication(double dureeFabrication) {
	this.dureeFabrication = dureeFabrication;
}
@Override
public String toString() {
	return "PieceDeBase [prix=" + prix + ", dureeGarantie=" + dureeGarantie + ", dureeFabrication=" + dureeFabrication
			+ ", suffixe=" + suffixe + ", getPrix()=" + getPrix() + ", getDureeGarantie()=" + getDureeGarantie()
			+ ", getDureeFabrication()=" + getDureeFabrication() + ", getSuffixe()=" + getSuffixe() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
