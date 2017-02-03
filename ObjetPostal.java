package TP3;

public abstract class ObjetPostal {
//Les attributs
 private String origine;
 private String destination;
 private String codePostal;
 private double poids;
 private double volume;
 private TauxRec tauxRec;
 
//Constructeur

public ObjetPostal(){
origine=""; // on peut mettre null ou inconnu
destination="";
codePostal="";
poids=0;
volume=0;
tauxRec= null;
}

public ObjetPostal(String o, String d, String cp,double p,double v,TauxRec t){
origine=o;
destination=d;
codePostal=cp;
poids=p;
volume=v;
tauxRec=t;
}

// accesseurs 

public String getOrigine(){
	return origine;
	}
	
public void setOrigine(String o){
	origine=o;
	}
	
public String getDestination(){
	return destination;
	}
	
public void setDestination(String d){
	destination=d;
	}

public String getCodePostal(){
	return codePostal;
	}
	
public void setCodePostal(String cp){
	codePostal=cp;
	}

public double getPoids(){
	return poids;
	}
	
public void setPoids(double p){
	poids=p;
	}

public double getVolume(){
	return volume;
	}
	
public void setVolume(double v){
	volume=v;
	}
	
public TauxRec getTauxRec(){
	return tauxRec;
	}
	
public void setTauxRec(TauxRec t){
	tauxRec=t;
	}
// Methodes

public abstract double  TauxRemboursement();
public abstract double TarifAffranchissement();
public String toString(){
return origine+"/"+destination+"/"+codePostal+"/"+poids+"/"+volume+"/"+tauxRec;}
}


