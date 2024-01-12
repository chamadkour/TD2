package Ex4;
public class Main {
    public static void main(String[] args) {
        Temps temps1 = new Temps(5, 8, 46);
        Temps temps2 = new Temps(1, 2, 3);
        Temps temps3 = new Temps(temps1);

        System.out.println(temps1);
        System.out.println(temps2);
        System.out.println(temps3);

        temps1.ajouterHeures(2);
        temps1.ajouterMinutes(2);
        temps1.ajouterSecondes(2);

        System.out.println(temps1);
    }
}
