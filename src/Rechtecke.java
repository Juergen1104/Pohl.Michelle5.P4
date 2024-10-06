import java.util.Random;

class Punkt {
    public int x, y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rechteck {
    public String name;
    public Punkt loEcke;        // linke, obere Ecke
    public int breite, hoehe;

    public Rechteck(String name, Punkt loEcke, int breite, int hoehe) {
        this.name = name;
        this.loEcke = loEcke;
        this.breite = breite;
        this.hoehe = hoehe;
    }
}

public class Rechtecke {

    /* *** Aufgabenteil (a) *** */
    public static void fuellen(Rechteck[] rechtecke) {

        Random random = new Random();
        for (int i = 0; i < rechtecke.length; i++) {
            String name = "R" + (i + 1);  // Rechteck-Namen fortlaufend "R1", "R2", etc.
            int x = (int) (Math.random() * 10);  // Zufallswert für x aus [0, 9]
            int y = (int) (Math.random() * 10);  // Zufallswert für y aus [0, 9]
            int breite = (int) (Math.random() * 50) + 1;  // Zufallswert für Breite aus [1, 50]
            int hoehe = (int) (Math.random() * 50) + 1;   // Zufallswert für Höhe aus [1, 50]
            rechtecke[i] = new Rechteck(name, new Punkt(x, y), breite, hoehe);
        }
    }

    /* *** Aufgabenteil (b) *** */
    public static void ausgeben(Rechteck[] rechtecke) {

        for (int i = 0; i < rechtecke.length; i++) {
            Rechteck r = rechtecke[i];
            int flaeche = groesse(r);  // Fläche des Rechtecks berechnen

            System.out.println((i+1) + " " + "Rechteck");
            System.out.println("   Ecke:     (" + r.loEcke.x + "/" + r.loEcke.y + ")");
            System.out.println("   Groesse:  " + + r.breite + " x " + r.hoehe + " = " + flaeche);
            System.out.println("----------------");
        }
    }

    /* *** Aufgabenteil (c) *** */

    public static int groesse(Rechteck r) {
        return r.breite * r.hoehe;
    }

    public static int findeIndexVonMin(Rechteck[] rechtecke, int vonIndx) {

        int minIndex = vonIndx;
        for (int i = vonIndx + 1; i < rechtecke.length; i++) {
            if (groesse(rechtecke[i]) < groesse(rechtecke[minIndex])) {
                minIndex = i;
            }
        }
        return minIndex;

    }

    public static void sortieren(Rechteck[] rechtecke) {

        for (int i = 0; i < rechtecke.length - 1; i++) {
            int minIndex = findeIndexVonMin(rechtecke, i);  // Finde das kleinste Rechteck im Bereich [i, N)
            if (minIndex != i) {
                // Vertausche das kleinste Rechteck mit dem ersten Rechteck in diesem Bereich
                Rechteck temp = rechtecke[i];
                rechtecke[i] = rechtecke[minIndex];
                rechtecke[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int N = 5;
        Rechteck[] rechtecke = new Rechteck[N];

        fuellen(rechtecke);
        ausgeben(rechtecke);
        sortieren(rechtecke);
        ausgeben(rechtecke);
    }
}
