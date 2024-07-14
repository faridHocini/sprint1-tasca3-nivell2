package sprint1Tasca3Exercici2Nivell2;


import java.util.Objects;


class Restaurant implements Comparable<Restaurant> {
    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return puntuacio == that.puntuacio &&
                Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, puntuacio);
    }

    @Override
    public int compareTo(Restaurant other) {
        int nameCompare = this.nom.compareTo(other.nom);
        if (nameCompare != 0) {
            return nameCompare;
        } else {
            return Integer.compare(this.puntuacio, other.puntuacio);
        }
    }

    @Override
    public String toString() {
        return "nom: " + nom + ", puntuació: " + puntuacio;
    }
}
