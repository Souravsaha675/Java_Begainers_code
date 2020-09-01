public class SpeedConverter {
    public static long toMilesPerHour(double KilometersPerHour) {
        if (KilometersPerHour < 0)
            return -1;
        else if (KilometersPerHour > 0) {
            return Math.round(KilometersPerHour / 1.609);

        }
        return -1;
    }

    public static void printConversion(double KilometersPerHour) {
        long value = toMilesPerHour(KilometersPerHour);

        if (value == -1)
            System.out.println("Invalid Value");
        else
            System.out.println(KilometersPerHour + " km/h = " + value + " mi/h");
    }
}
