public class ConcentrationException extends Exception{

    //prop
    int c;

    public ConcentrationException(int c, String msg) {
        super(msg);
        this.c = c;
    }
    public int getC() {
        return c;
    }

}
