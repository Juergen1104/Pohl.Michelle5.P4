import java.util.Random;

public class Wuerfel {
    public static int max = 6;  // maximale Augenzahl auf dem Wuerfel
    public int nr;
    public int wert;

    /* *** Aufgabenteil (a) *** */

    private static int zaehler = 1;  // Klassenvariable zur eindeutigen Nummerierung

    /* *** Aufgabenteil (a) *** */

    // Konstruktor: Initialisierung des Werts auf 1 und Zuweisung einer eindeutigen Nummer
    public Wuerfel() {
        this.wert = 1;  // Initialer Wert des Würfels ist 1
        this.nr = zaehler++;  // Zuweisung einer fortlaufenden Nummer
    }

    // Methode zum Würfeln: Setzt den Würfelwert auf einen Zufallswert zwischen 1 und max
    public void werfen() {
        Random random = new Random();
        this.wert = random.nextInt(max) + 1;  // Zufallswert zwischen 1 und max (einschließlich)
    }

    // Methode zur Ausgabe der Würfelnnummer und des aktuellen Werts
    public void print() {
        System.out.println("Wuerfel Nr. " + this.nr + " -> " + this.wert);
    }


}
