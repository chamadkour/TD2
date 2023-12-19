package Ex3;

public class Main {
    public static void main(String[] args){
        //On essaie chaque constructeur
        Livre livre1=new Livre();
        Livre livre2=new Livre("L'etranger");
        Livre livre3=new Livre("La peste","Albert Camus");
        Livre livre4=new Livre("Geisha","Golden",75);
        Livre livre5=new Livre("La prisonnière","Malika Oufkir",149,1999);
        Livre livre6=new Livre(livre5);
        System.out.println(livre1);
        System.out.println(livre2);
        System.out.println(livre3);
        System.out.println(livre4);
        System.out.println(livre5);
        System.out.println(livre6);
        //Nous pouvons également fait appel a la methode toString explicitement
        System.out.println(livre4.toString());

    }
}
