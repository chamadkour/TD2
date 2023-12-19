package Ex3;

public class Livre {
    String titre;
    String auteur;
    double prix;
    int annee;
    public Livre(){
    }
    public Livre(String titre){
        this();
        this.titre= titre;
    }
    public Livre(String titre, String auteur){
        this(titre);
        this.auteur=auteur;
    }
    public Livre(String titre,String auteur,double prix){
        this(titre,auteur);
        this.prix=prix;
    }
    public Livre(String titre,String auteur,double prix,int annee){
        this(titre,auteur,prix);
        this.annee=annee;
    }

    public String getTitre(){
        return titre;
    }
    public String getAuteur(){
        return auteur;
    }
    public double getPrix(){
        return prix;
    }
    public int getAnnee(){
        return annee;
    }

    public Livre(Livre livre1){
        this(livre1.getTitre(),livre1.getAuteur(),livre1.getPrix(),livre1.getAnnee());
    }
    public void setTitre(String titre){
        this.titre=titre;
    }
    public void setAuteur(String auteur){
        this.auteur=auteur;
    }
    public void setPrix(double prix){
        this.prix=prix;
    }
    public void setAnnee(int annee){
        this.annee=annee;
    }

    public String toString(){
        return "le livre "+titre+" ecrit par "+auteur+" en "+annee+ " vaut "+prix;
    }
}
