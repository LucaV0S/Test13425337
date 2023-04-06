public class Main {
    public static void main(String[] args) {
        IO[] sammlung = new IO[3];

        sammlung[0] = new Artikel(" Artikel 1");
        sammlung[1] = new Warenkorb(" Warenkorb 1");
        sammlung[2] = new Artikel(" Artikel 2");

        for(IO io : sammlung){
            io.printData(); //Dynamische-Ausgabe es wird während der ALufzeit geschaut welche Methode der Klasse gefordert ist.
        }
    }
}