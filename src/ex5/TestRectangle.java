package ex5;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(12, 34);
        Rectangle rectangle3 = new Rectangle(rectangle2);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);

        rectangle1.setLongueur(5);
        rectangle1.setLargeur(10);

        System.out.println(rectangle1);
        System.out.println("Périmètre: " + rectangle1.perimetre());
        System.out.println("Aire: " + rectangle1.aire());
        System.out.println("Est-ce un carré? " + rectangle1.isCarre());
    }
}