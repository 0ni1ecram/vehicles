public class Main {

//    private static int milesPerGallon = 10;
//    private static double gallonsOfGas = 20.0;
//    private static int odometer = 0;

    private static int[] milesPerGallon = {20, 25, 15};
    private static double[] gallonsOfGas = {10.0, 8, 12};
    private static int[] odometer = {0, 10000, 20000};

    public static void main(String[] args){
        System.out.println("In Vehivle main;");

        drive(100);
        drive(60);
    }
    private static void drive(int milage) {
        for(int i = 0; i < 3; i++) {
            System.out.println(i +". Odometer: " + odometer[i] + " | Gallons of Gas: " + gallonsOfGas[i]);

            gallonsOfGas[i] -= (milage / milesPerGallon[0]);
            odometer[i] += milage;

            System.out.println(i +". Odometer: " + odometer[i] + " | Gallons of Gas: " + gallonsOfGas[i]);
        }
    }
        }