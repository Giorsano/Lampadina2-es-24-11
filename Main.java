public class Main {
    public static void main(String[] args) {
    Lampadina lampadina = new Lampadina(new Interruttore(Stato.OFF), new Interruttore(Stato.ON));
        System.out.println(lampadina);
    lampadina.accendi();
        System.out.println(lampadina);
        lampadina.spegni();
        System.out.println(lampadina);
        lampadina.accendi();
        System.out.println(lampadina);
        lampadina.spegni();
        System.out.println(lampadina);
    }
}
