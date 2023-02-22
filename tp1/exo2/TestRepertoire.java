package tp1.exo2;

import java.util.List;

public class TestRepertoire {
    public static void main(String[] args) {
        Repertoire repertoire = new Repertoire(3);

        Abonne abonne1 = new Abonne("tarek", "55555");
        Abonne abonne2 = new Abonne("amina", "0000");
        Abonne abonne3 = new Abonne("mohamed", "213456");
        Abonne abonne4 = new Abonne("anes", "16815");

        System.out.println(repertoire.addAbonne(abonne1)); // true
        System.out.println(repertoire.addAbonne(abonne2)); // true
        System.out.println(repertoire.addAbonne(abonne3)); // true
        System.out.println(repertoire.addAbonne(abonne4)); // false

        System.out.println(repertoire.getNumero("tarek")); // 555-5678
        System.out.println(repertoire.getNumero("amina")); // null

        System.out.println(repertoire.getNAbonnes()); // 3

        Abonne abonne = repertoire.getAbonne(1);
        if (abonne != null) {
            System.out.println(abonne.getNom() + " " + abonne.getNumero()); // Jane 555-5678
        }

        List<Abonne> abonnesTries = repertoire.getAbonnesTries();
        for (Abonne a : abonnesTries) {
            System.out.println(a.getNom() + " " + a.getNumero());
        }
    }
}
