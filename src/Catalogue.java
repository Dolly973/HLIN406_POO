package TP5;

import java.util.ArrayList;

public class Catalogue{
	private ArrayList <NoticeBibliographique> liste;

	public Catalogue(){
	}
	public Catalogue(ArrayList<NoticeBibliographique> liste) {
		this.liste = liste;
	}
	public void ajouter(NoticeBibliographique n){
		if (! liste.contains(n)){
			liste.add(n);
		}
	}
	public NoticeBibliographique cherche(String Is){
		int i;
		for(i=0; i<liste.size();i++){
			if (liste.get(i).iSBN.equals(Is))
			{ return liste.get(i); }
		}
		return null;
	}
}

