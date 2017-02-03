package TP3;
public class Lettre extends ObjetPostal{

private boolean urgence;
 public Lettre(){
 origine=""; // on peut mettre null ou inconnu
destination="";
codePostal="";
poids=0;
volume=0;
tauxRec= null;
urgence= null;
}
public Lettre(String o, String d, String cp,double p,double v,TauxRec t,boolean u){
origine=o;
destination=d;
codePostal=cp;
poids=p;
volume=v;
tauxRec=t;
urgence=u;
}
public boolean getUrgence(){
	return urgence;
	}
public void setUrgence(boolean u){
	urgence=u;
	}
private double tauxRemboursement(){
}
private double tarifAffranchissement(){
}
public String toString(){
return codePostal+"/"+destination+"/"+tauxRec+"/"+urgence;}
}