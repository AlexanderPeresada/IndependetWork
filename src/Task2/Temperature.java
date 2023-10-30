package Task2;

public class Temperature {
    static double morning;
    static double noon;
    static double evening;

    public static void main(String[] args) {
        morning = 14.5;
        noon = 21.3;
        evening = 17.6;
        double avgTemperature = (morning + noon + evening) / 3;

        System.out.printf("1) morning temperature is %.1f degree(s)." + "%n" +
                "2) noon temperature is %.1f degree(s)." + "%n" +
                "3) evening temperature is %.1f degree(s)." + "%n" +
                "Average day temperature is %.1f degree(s).", morning, noon, evening, avgTemperature);
    }

}
