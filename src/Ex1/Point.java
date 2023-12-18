package Ex1;

public class Point {
    char nom;
    double abscisse;

    public Point(char nom, double abscisse){
        this.nom = nom;
        this.abscisse = abscisse;
    }
    public void method(){

        System.out.println("Le point "+ nom +" se trouve à l'abscisse "+abscisse);
    }
    public void translate(double arg){
        abscisse+=arg ;
    }
}
