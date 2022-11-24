public class Lampadina {
    private Interruttore interruttore;
    private Interruttore interruttore2;
    private Stato stato = Stato.OFF;

    public Lampadina(Interruttore interruttore, Interruttore interruttore2){
        this.interruttore = interruttore;
        this.interruttore2 = interruttore2;
    }

    public void accendi(){
        if(stato == Stato.OFF && interruttore.getStatus() == Stato.OFF){
            stato = Stato.ON;
            interruttore.setStatus(Stato.ON);
            interruttore2 = interruttore;
        }
    }

    public void spegni(){
        if(stato == Stato.ON && interruttore2.getStatus() == Stato.ON){
            stato = Stato.OFF;
            interruttore.setStatus(Stato.OFF);
            interruttore = interruttore2;
        }
    }

    public String toString(){
        String s = "Stato lampadina: " + stato;
        return s;
    }
}
