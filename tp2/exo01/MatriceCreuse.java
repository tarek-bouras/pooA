package tp2.exo01;

import java.util.LinkedList;

public class MatriceCreuse implements MatriceCarree {

    private int N; 
    private LinkedList<Triplet> liste;

    
    public MatriceCreuse(int taille) {
        N = taille;
        liste = new LinkedList<Triplet>();
    }

    
    private class Triplet {
        int i;
        int j;
        double v;
        Triplet(int i, int j, double v) {
            this.i = i;
            this.j = j;
            this.v = v;
        }
    }

    public int taille() {
        return N;
    }

    public double getValeur(int i, int j) {
        for (Triplet t : liste) {
            if (t.i == i && t.j == j) {
                return t.v;
            }
        }
        return 0.0; 
    }


    public void setValeur(int i, int j, double v) {
        for (Triplet t : liste) {
            if (t.i == i && t.j == j) {
                t.v = v; 
                return;
            }
        }
        liste.addLast(new Triplet(i, j, v));
    }

    public void add(MatriceCarree m) {
        if (m.taille() != N) {
            throw new IllegalArgumentException("Les deux matrices n'ont pas la même taille !");
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                setValeur(i, j, getValeur(i, j) + m.getValeur(i, j));
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Triplet t : liste) {
            sb.append("(").append(t.i).append(",").append(t.j).append(",").append(t.v).append(")").append("\n");
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MatriceCreuse)) {
            return false;
        }
        MatriceCreuse other = (MatriceCreuse) obj;
        if (N != other.N || liste.size() != other.liste.size()) {
            return false;
        }
        for (Triplet t : liste) {
            double v = other.getValeur(t.i, t.j);
            if (v != t.v) {
                return false;
            }
        }
        return true;
    }

}
