public class DrinkCoffe {

    void drinkCoffe(Coffe coffe)  throws TemperatureException, ConcentrationException{
        if (coffe.getTemp() > 65) {
            throw new TemperatureException(coffe.getTemp(), "Cafeaua e prea fierbinte o aruncam");

        }else {
            System.out.println("t: " + coffe.getTemp());
        }

        if (coffe.getConc() > 55) {
            throw new ConcentrationException(coffe.getConc(), "Concentratia cafelei e prea mare! O aruncam");

        } else {
            System.out.println("c:" + coffe.getConc());
        }
    }
}
