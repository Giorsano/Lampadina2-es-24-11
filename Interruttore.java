public class Interruttore {
    private Stato status;

    public Interruttore(Stato status){
        this.status = status;
    }

    public Stato getStatus() {
        return status;
    }

    public void setStatus(Stato status) {
        this.status = status;
    }
}
