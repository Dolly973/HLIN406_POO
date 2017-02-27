package tp3;

public class Colis extends ObjetPostal 
{
//Les attributs
	private String contenu;
	protected double valeurDec;
	
	//Constructeur
public Colis(){ //constructeur par défaut
	this.contenu ="";
	this.valeurDec= 0;
//super() est appelé par défaut
}
public Colis(String o, String d, String cp,double p,double v,TauxRec t, String c, double vd)
{
	super(o,d,cp,p,v,t);
	this.contenu = c;
	this.valeurDec= vd;
}
// Accesseurs
public String getContenu()
{
	return this.origine;
}
public void setContenu(String c)
{
	this.contenu= c;
}
public double getValeurDec()
{
	return valeurDec;
}
public void setValeurDec(double vd)
{
	this.valeurDec = vd;
}
//Les méthodes
public double tarifRemboursement()
{
	double result=  0; 
	switch (this.tauxRec) 
	{
	case zero:
		result = 0 ;
		break;
	case un:
		result = 0.1 * this.valeurDec ;
		break;
	case deux:
		result = 0.5 * this.valeurDec ;
		break;
	default:
		result=  0;
		break;
	}
	return result;
}
public double tarifAffranchissement()
{
double result=  2; 
	
	
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
	if (this.poids > 1/8)
	{
		result += 3 ;
	}
	return result;
}
public String toString()
{
	return codePostal+"/"+destination+"/"+tauxRec+"/"+volume+"/"+valeurDec;
}
}
