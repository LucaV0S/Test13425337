public abstract class Calculator {
    private String operator;
    private int zahl1;
    private int zahl2;

    public Calculator(int zahl1, int zahl2, String operator){
        this.zahl1= zahl1;
        this.zahl2=zahl2;
        this.operator =operator;

    }

    public String toString(){
        return zahl1 + "" + operator + "" + zahl2 + " = ";
    }
    public int berechne(){
        return 0;
    }
}
