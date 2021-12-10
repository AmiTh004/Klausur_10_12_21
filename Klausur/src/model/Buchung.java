package model;

public class Buchung {

    //initialisieren der Variablen
    String _zeitraum;
    int _gruppengroesse;
    String _vorname_gruppenleiter;
    String _nachname_gruppenleiter;
    Escaperoom _raum;
    int _juengster_teilnehmer;

    //Constructor -> Deklariert die Variablen für jedes neue Objekt dieser Klasse
    public Buchung(String zeitraum, int gruppengroesse, String vorname_gruppenleiter, String nachname_gruppenleiter, Escaperoom raum, int juengster_teilnehmer){
        setGruppengroesse(gruppengroesse);
        setJuengsterTeilnehmer(juengster_teilnehmer);
        setNachnameGruppenleiter(nachname_gruppenleiter);
        setRaum(raum);
        setVornameGruppenleiter(vorname_gruppenleiter);
        setZeitraum(zeitraum);
    }


    //Mehode in der das maximale Alter und die Gruppengröße überprüft wird
    public String checkBuchung() {
        if (getJuengsterTeilnehmer() < getRaum()._mindestalter || getGruppengroesse() > getRaum()._max_personen) {
            return "Buchung kann nicht vorgenommmen werden, wenn eine Person zu jung ist, oder die Gruppe zu groß ist.";
        } else {
            return getRaum()._name + " wurde für "+ getZeitraum() + " gebucht. Gruppenleiter: "+ getVornameGruppenleiter()+" "+getNachnameGruppenleiter()+" Gruppengröße: "+getGruppengroesse()+ " Der jüngste Teilnehmer ist "+ getJuengsterTeilnehmer()+" Jahre alt";
        }
    }


    /**
     * 
     * SETTER UND GETTER
     */

     public void setGruppengroesse(int gruppengroesse) {
         this._gruppengroesse = gruppengroesse;
     }
     public int getGruppengroesse() {
         return _gruppengroesse;
     }
     public void setJuengsterTeilnehmer(int juengster_teilnehmer) {
         this._juengster_teilnehmer = juengster_teilnehmer;
     }
     public int getJuengsterTeilnehmer() {
         return _juengster_teilnehmer;
     }
     public void setNachnameGruppenleiter(String nachname_gruppenleiter) {
         this._nachname_gruppenleiter = nachname_gruppenleiter;
     }
     public String getNachnameGruppenleiter() {
         return _nachname_gruppenleiter;
     }
     public void setRaum(Escaperoom raum) {
         this._raum = raum;
     }
     public Escaperoom getRaum() {
         return _raum;
     }
     public void setVornameGruppenleiter(String vorname_gruppenleiter) {
         this._vorname_gruppenleiter = vorname_gruppenleiter;
     }
     public String getVornameGruppenleiter() {
         return _vorname_gruppenleiter;
     }
     public void setZeitraum(String zeitraum) {
         this._zeitraum = zeitraum;
     }
     public String getZeitraum() {
         return _zeitraum;
     }
    
}
