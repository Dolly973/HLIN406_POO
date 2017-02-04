package TP3;
public class Lettre extends ObjetPostal{

//Attribut spécifique à une lettre
	private boolean urgence;
	
//Constructeur par défaut
 public Lettre(){
//Par defaut super() est appelé donc le constructeur de objet postal
	 urgence= (Boolean) null;
}
 //Constructeur
public Lettre(String o, String d, String cp,double p,double v,TauxRec t,boolean u){
super (o,d,cp,p,v,t);
this.urgence=u;
}
public boolean isUrgence(){
	return this.urgence;
	}
public void setUrgence(boolean u){
	this.urgence=u;
	}

public double tarifRemboursement() 
{
	double result=  0; 
	switch (this.tauxRec) 
	{
	case zero:
		result = 0 ;
		break;
	case un:
		result = 1.5 ;
		break;
	case deux:
		result = 15 ;
		break;
	default:
		result=  0;
		break;
	}
	return result;
}
@Override
public double tarifAffranchissement() {
	double result=  0.5; 
	
	
	switch (this.tauxRec) 
	{
	case zero:
		result += 0 ;
		break;
	case un:
		result += 0.5 ;
		break;
	case deux:
		result += 1.5 ;
		break;
	default:
		result +=  0;
		break;
	}
	
	
	if (this.urgence)
	{
		result += 0.3 ;
	}
	return result;
}
public String toString()
{
return codePostal+"/"+destination+"/"+tauxRec+"/"+urgence;}
}
