public class CoffeeTest {
    public static void main(String[] args) {

        CoffeMaker mk = new CoffeMaker();
        DrinkCoffe d = new DrinkCoffe();

        for (int i = 0; i < 5; i++) {
            Coffe coffe = mk.makeCoffe();

            try {
                d.drinkCoffe(coffe);
            } catch (TemperatureException e) {
                System.out.println("Exceptie T: " + e.getMessage() + "temperatura: " + e.getT());
            } catch (ConcentrationException e) {
                System.out.println("Exceptie C: " + e.getMessage() + "concentratia: " + e.getC());
            } finally {
                System.out.println("Aparatul de cafea sa oprit");
            }
        }


    }
}
