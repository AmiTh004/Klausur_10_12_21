package model;

public class Escaperoom {

    String _name;
    int _max_personen;
    int _schwierigkeit;
    String _loesung;
    int _dauer;
    int _mindestalter;

    public Escaperoom(String name, int max_personen, int schwierigkeit, String loesung, int dauer, int mindestalter){
        setDauer(dauer);
        setLoesung(loesung);
        setMindestalter(mindestalter);
        setName(name);
        setSchwierigkeit(schwierigkeit);
        setmaxPersonen(max_personen);
    }

    /**
     * 
     * 
     * SETTER und GETTER
     */

     public void setDauer(int dauer) {
         this._dauer = dauer;
     }

     public int getDauer() {
         return _dauer;
     }

     public void setLoesung(String loesung) {
         this._loesung = loesung;
     }

     public String getLoesung() {
         return _loesung;
     }
     public void setMindestalter(int mindestalter) {
         this._mindestalter = mindestalter;
     }
     public int getMindestalter() {
         return _mindestalter;
     }
     public void setName(String name) {
         this._name = name;
     }
     public String getName() {
         return _name;
     }
     public void setmaxPersonen(int max_personen) {
         this._max_personen = max_personen;
     }
     public int getmaxPersonen() {
         return _max_personen;
     }
     public void setSchwierigkeit(int schwierigkeit) {
         this._schwierigkeit = schwierigkeit;
     }
     public int getSchwierigkeit() {
         return _schwierigkeit;
     }
    
}
