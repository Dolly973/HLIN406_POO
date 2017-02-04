package TP3;

public class ColisExpress extends Colis
{
	//Les attributs
	private String dateEnvoi;
	private static int numeroColisExpress=0;
	private Emballage emballage;
	private int numColi;
	private String numColiString;
	
	//Constructeur par défaut
	public ColisExpress()
	{
	this.dateEnvoi = "";
	ColisExpress.numeroColisExpress = 0;
	this.emballage = null;
	}
	//Constructeur normal
	public ColisExpress(String o, String d, String cp,double p,double v, TauxRec t, String c, double vd, String dE, Emballage e)
	{
		super(o,d,cp,p,v,t,c,vd);
		this.dateEnvoi = dE;
		this.numColi = ColisExpress.numeroColisExpress++;
		this.numColiString = "2016"+this.numColi ;
		this.emballage = e;
	}
	//Les accesseurs
	public String getdateEnvoi()
	{
		return this.dateEnvoi;
	}
	public void setdateEnvoi(String dE)
	{
		this.dateEnvoi = dE;
	}
	public static int getNumeroColisExpress()
	{
		return ColisExpress.numeroColisExpress;
	}
	public static void  setNumeroColisExpress(int nCE)
	{
		ColisExpress.numeroColisExpress = nCE;
	}
	public Emballage getEmbalage()
	{
		return this.emballage;
	}
	public void setEmballage(Emballage e)
	{
		this.emballage = e;
	}
	public void setPoids(double p)
	{
		if( p > 30) 
			{
			System.err.println("Le poids doit être inférieure à 30");
			}
		else
		{
			this.poids = p ;
		}
	}
	//Les Méthodes 
	public double tarifAffranchissement()
	{
		double result= 30; 
			
			System.out.println("ColisExpresss tarifAffranchissement : " + result);
			switch (this.emballage) 
			{
			case PosteLaponaise:
				result += 3 ;
				break;
			case Autre:
				result += 0 ;
				break;
			default:
				result +=  0;
				break;
			}
			return result;
	}
	public String toString()
	{
		return codePostal+"/"+destination+"/"+tauxRec+"/"+volume+"/"+valeurDec+"/"+poids+"/"+numColiString;
	}
	public int getNumColi() {
		return numColi;
	}
	
	public String getNumColiString() {
		return numColiString;
	}


}
