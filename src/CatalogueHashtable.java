package TP5;

import java.util.HashMap;

public class CatalogueHashtable {
	private HashMap<String,NoticeBibliographique> listeNotice = new HashMap<>();

	public CatalogueHashtable() {
		;
	}

	//ajouter une notice
	public void ajoute (NoticeBibliographique not)
	{listeNotice.put(not.getISBN(),not);}
	//Recherche
	public NoticeBibliographique recherche(String isbn)
	{ return listeNotice.get(isbn);}
	//si on veut faire un "parcours total" ex: recherche a partir d'un nom d'auteur >>keyset collection des clefs >>values collections des valeurs
}


