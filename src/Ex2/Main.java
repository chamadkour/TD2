package Ex2;

public class Main {
    public static void main(String[] args){
        Point point1=new Point();
        point1.setName('A');
        point1.setAbscisse(9);
        point1.setOrdonnee(3);

        System.out.println("Nom: " + point1.getName()+ " Abscisse : "+point1.getAbscisse()+" Ordonnee : " + point1.getOrdonnee());
        System.out.println("Sa norme est : " + point1.Norme());
    }
}
