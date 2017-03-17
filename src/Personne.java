package TP5;

public class Personne {

	private String nom;
	private String prenom;
	private Type role;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Type getRole() {
		return role;
	}
	public void setRole(Type role) {
		this.role = role;
	}
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personne(String nom, String prenom, Type role) {
		this.nom = nom;
		this.prenom = prenom;
		this.role = role;
	}
	
}
