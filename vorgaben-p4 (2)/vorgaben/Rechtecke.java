class Punkt {
    public int x,y;
}

class Rechteck {
    public String name;
    public Punkt loEcke;        // linke, obere Ecke
    public int breite, hoehe;  
}

public class Rechtecke {
  

    /* *** Aufgabenteil (a) *** */
    public static void fuellen(Rechteck[] rechtecke){
	
    }

    /* *** Aufgabenteil (b) *** */
    public static void ausgeben(Rechteck[] rechtecke){
	
    }
    
    /* *** Aufgabenteil (c) *** */

    public static int groesse(Rechteck r){
	return 0; // Dummy return
    }

    public static int findeIndexVonMin(Rechteck[] rechtecke, int vonIndx){
	return 0; // Dummy return
    }


    public static void sortieren(Rechteck[] rechtecke){

    }

    public static void main(String[] args){
	int N = 5;
	Rechteck[] rechtecke = new Rechteck[N];

	fuellen(rechtecke);
	ausgeben(rechtecke);
	sortieren(rechtecke);
	ausgeben(rechtecke);
    }
}
