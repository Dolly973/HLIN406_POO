public class Catalogue{
private HashMap<String,NoticeBiblio> listeNotices = new Hashmap<>();
//ajouter une notice
public void ajoute (NoticeBiblio not)
{listeNotice.put(not.getiSBN(),not);}
//Recherche
public NoticeBiblio recherche(String isbn)
{ returnlisteNotice.get(isbn);}
//si on veut faire un "parcours total" ex: recherche a partir d'un nom d'auteur >>keyset collection desclefs >>values collections des valeurs
}
