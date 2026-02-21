public class CoffeMaker {
    Coffe makeCoffe() {
        System.out.println("Coffe is preparing...");

        int t = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);

        Coffe coffe = new Coffe(t,c);
        return coffe;
    }
}
