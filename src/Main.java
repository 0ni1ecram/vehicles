public class Main {

    private static int milesPerGallon = 20;
    private static double gallonsOfGs = 10.0;
    private static int odometer = 0;
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Second Line");


        System.out.println("Odometer:"+ odometer + " Gallons of Gas:"+ gallonsOfGs);

        drive(100);
        drive(60);

    }

    private static void drive(int milesDriven) {
        gallonsOfGs -= (milesDriven / milesPerGallon);
        odometer += milesDriven;
        System.out.println("Odometer:"+ odometer+ " Gallons of Gas:"+ gallonsOfGs);
    }
}