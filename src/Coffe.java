public class Coffe {

    //props - proprieties - proprietati
    private int temp;// temperatura la cafea
    private int conc;//concentratia la cafea

    //constructor
    public Coffe(int temp, int conc) {
        this.temp = temp;
        this.conc = conc;
    }
    Coffe() {}

    public int getTemp() {
        return temp;
    }

    public int getConc() {
        return conc;
    }

    @Override
    public String toString() {
        return "Coffe{" +
                "temp=" + temp +
                ", conc=" + conc +
                '}';
    }
}
