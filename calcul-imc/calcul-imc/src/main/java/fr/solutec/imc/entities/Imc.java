package fr.solutec.imc.entities;


public class Imc {
    private int id;
    public double taille;
    public double poids;
    public double indice;

    public Imc() {

    }

    public Imc(int id, double taille, double poids, double indice) {
        this.id = id;
        this.taille = taille;
        this.poids = poids;
        this.indice = indice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getIndice() {
        return indice;
    }

    public void setIndice(double indice) {
        this.indice = indice;
    }
}


