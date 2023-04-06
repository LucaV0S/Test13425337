public class Artikel implements IO{
    public String name;
    public Artikel(String name){
        this.name= name;
    }


    @Override
    public void printData() {
        System.out.println("Ich bin ein Artikel" + this.name);
    }

    @Override
    public void setData() {

    }
}
