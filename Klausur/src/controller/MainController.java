package controller;

import java.util.ArrayList;

//importieren der Klassen aus Model und View
import model.Buchung;
import model.Escaperoom;
import view.Output;

public class MainController {

    //Erstellen der Räume
    Escaperoom r1 = new Escaperoom("Breaking Bad", 4, 1, "Schlüssel steckt im Zündschloss", 90, 12);
    Escaperoom r2 = new Escaperoom("Walking Dead", 6, 3, "Schlüsselkarte in der Brust der Leiche", 120, 14);
    Escaperoom r3 = new Escaperoom("Squid Game", 4, 2, "Schlüssel ist in der schwarzen Maske", 90, 18);
    Escaperoom r4 = new Escaperoom("American Horror Story", 6, 2, "Im linken Schuh der Leiche auf dem Sofa", 140, 18);

    //Liste in der alle Buchungen gespeicher werden können
    ArrayList<Buchung> buchungen = new ArrayList<Buchung>();

    Output o = new Output();


    public void demoData() {

        //Erstellen der Demobuchungen und anschließendes Hinzufügen in die ArrayList
        Buchung b1r1 = new Buchung("12.10.2022, 12:10", 14, "Markus", "Weser", r1, 15);
        buchungen.add(b1r1);
        Buchung b2r1 = new Buchung("13.10.2022, 13:20", 2, "Sabine", "Hirsch", r1, 22);
        buchungen.add(b2r1);

        Buchung b1r2 = new Buchung("12.10.2022, 14:20", 5, "Heinz", "Müller", r2, 50);
        buchungen.add(b1r2);
        Buchung b2r2 = new Buchung("01.10.2022, 20:30", 3, "Oskar", "Schwitters", r2, 13);
        buchungen.add(b2r2);

        Buchung b1r3 = new Buchung("12.10.2022, 15:20", 2, "Theo", "Heine", r3, 19);
        buchungen.add(b1r3);
        Buchung b2r3 = new Buchung("12.10.2022, 16:20", 3, "Jordan", "Velte", r3, 20);
        buchungen.add(b2r3);

        Buchung b1r4 = new Buchung("12.10.2022, 14:30", 5, "Brat", "Wurst", r4, 18);
        buchungen.add(b1r4);
        Buchung b2r4 = new Buchung("12.10.2022, 15:20", 6, "Holger", "Trampe", r4, 30);
        buchungen.add(b2r4);


        //In dieser Foreach-Schleife wird jede Buchung geprüft und anschließend ausgegeben, oder es erscheint ein Fehlercode
        for (Buchung buchung : buchungen) {
            o.printData(buchung.checkBuchung());
        }

        
    }

    
}
