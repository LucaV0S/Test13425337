public class Warenkorb implements IO {
    private String warenkorbID;


    public Warenkorb(String warenkorbID){
        this.warenkorbID=warenkorbID;
    }

    @Override
    public void printData() {
        System.out.println("ich bin ein Warenkorb" + this.warenkorbID);
    }

    @Override
    public void setData() {

    }
}
