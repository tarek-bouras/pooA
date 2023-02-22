package tp1.exo2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repertoire {
    private List<Abonne> abonnes;
    private int capacite;

    //*constructeur */
    public Repertoire(int capacite) {
        this.abonnes = new ArrayList<>();
        this.capacite = capacite;
    }

    //*ajouter abonne */
    public boolean addAbonne(Abonne abonne) {
        if (abonnes.size() >= capacite) {
            return false;
        } else {
            abonnes.add(abonne);
            return true;
        }
    }
    //*récuperer le numero */
    public String getNumero(String nom) {
        for (Abonne abonne : abonnes) {
            if (abonne.getNom().equals(nom)) {
                return abonne.getNumero();
            }
        }
        return null;
    }

    public int getNAbonnes() {
        return abonnes.size();
    }

    public Abonne getAbonne(int index) {
        if (index < 0 || index >= abonnes.size()) {
            return null;
        } else {
            return abonnes.get(index);
        }
    }

    public List<Abonne> getAbonnesTries() {
        List<Abonne> abonnesTries = new ArrayList<>(abonnes);
        Collections.sort(abonnesTries, (a1, a2) -> a1.getNom().compareTo(a2.getNom()));
        return abonnesTries;
    }
}
