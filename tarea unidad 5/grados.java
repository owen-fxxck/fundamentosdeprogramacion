public class grados {
    public static void main(String[] args) {
        double c1 = 25.0;
        double c2 = 0.0;
        double c3 = -10.0;

        double f1 = celsiusAFahrenheit(c1);
        double f2 = celsiusAFahrenheit(c2);
        double f3 = celsiusAFahrenheit(c3);

        System.out.println(c1 + "°C = " + f1 + "°F");
        System.out.println(c2 + "°C = " + f2 + "°F");
        System.out.println(c3 + "°C = " + f3 + "°F");
    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}
