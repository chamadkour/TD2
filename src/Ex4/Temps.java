package Ex4;

public class Temps {
    private int heures;
    private int minutes;
    private int secondes;

    public Temps() {
        this.heures = 0;
        this.minutes = 0;
        this.secondes = 0;
    }

    public Temps(int heures) {
        this.heures = heures;
        this.minutes = 0;
        this.secondes = 0;
    }

    public Temps(int heures, int minutes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = 0;
    }

    public Temps(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }

    public Temps(Temps temps) {
        this.heures = temps.heures;
        this.minutes = temps.minutes;
        this.secondes = temps.secondes;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }

    public void ajouterHeures(int heures) {
        this.heures += heures;
    }

    public void ajouterMinutes(int minutes) {
        this.minutes += minutes;
    }

    public void ajouterSecondes(int secondes) {
        this.secondes += secondes;
    }
    public String toString() {
        return "Temps{" +
                "heures=" + heures +
                ", minutes=" + minutes +
                ", secondes=" + secondes +
                '}';
    }
}
