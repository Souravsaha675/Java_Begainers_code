public class Main {
    public static void main(String[] args) {
        long value = SpeedConverter.toMilesPerHour(10.5);
        System.out.println(value);

        SpeedConverter.printConversion(10.5);
    }
}
