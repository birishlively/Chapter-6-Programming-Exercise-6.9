public class Exercise06_09

//convert from feet to meters 
public static double footToMeter(double foot) {
    return 0.305 * foot;
}

//conver from meters to feet
public static double meterToFoot(double meter) {
    return 3.279 * meter;
}

public static void main(String[] args) {

    System.out.println("Feet \t\ Meters \t\ \t\ | \t\ Feet");
    System.out.println("--------------------------------------------------");

    double feet = 1.0;
    double meters = 20.0;

    for int i = 1; i <= 10; i++) {
        System.out.printf("%-10.1f \t\ %-10.3f \t\ \t\ | \t\ %-10.1f\n", feet, footToMeter(feet), meters);
        feet += 1.0;
        meters += 5.0;      
    }
}

