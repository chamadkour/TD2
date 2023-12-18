package Ex2;

public class Point {
    char nom;
    double abscisse;
    double ordonnee;

    public Point(){
    }
     public Point(char nom,double abscisse,double ordonnee){
        this.nom =nom;
        this.abscisse= abscisse;
        this.ordonnee=ordonnee;
     }
    public char getName(){
        return nom;
    }
    public void setName(char nom){
        this.nom= nom;
    }

    public double getAbscisse(){
        return abscisse;
    }
    public void setAbscisse(double abscisse){
        this.abscisse=abscisse;
    }
    public double getOrdonnee(){
        return ordonnee;
    }
    public void setOrdonnee(double ordonnee){
        this.ordonnee=ordonnee;
    }

    public double Norme(){
        double distance=Math.sqrt(this.abscisse*this.abscisse+this.ordonnee*this.ordonnee);
        return distance;
    }
}
