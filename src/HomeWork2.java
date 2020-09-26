public class HomeWork2 {
    public static void main(String[] args) {

        // F -> C; T(°C) = (T(°F) - 32) × 5/9;
        double tempFahrenheitForCelsius = 100;
        double tempCelsiusFromF = (tempFahrenheitForCelsius -32) * (5.0/9.0);
        System.out.println(tempFahrenheitForCelsius + " F is equal to " + tempCelsiusFromF + " degrees Celsius.");

        //F -> K; T(K) = (T(°F) + 459.67)× 5/9;
        double tempFahrenheitForKelvin = 100;
        double tempKelvinFromFahrenheit = (tempFahrenheitForKelvin + 459.67) * (5.0/9.0);
        System.out.println(tempFahrenheitForKelvin + " F is equal to " + tempKelvinFromFahrenheit + " degrees Kelvin.");

        //K -> C; T(°C) = T(K) - 273.15;
        double tempKelvinForCelsius = 100;
        double tempCelsiusFromKelvin = tempKelvinForCelsius- 273.15;
        System.out.println(tempKelvinForCelsius + " K is equal to " + tempCelsiusFromKelvin + " degrees Celsius.");

        //K -> F; T(°F) = T(K) × 9/5 - 459.67
        double tempKelvinForFahrenheit = 100;
        double tempFahrenheitFromKelvin = (tempKelvinForFahrenheit * (9.0/5.0)) - 459.67;
        System.out.println(tempKelvinForFahrenheit + " K is equal to " + tempFahrenheitFromKelvin + " degrees Fahrenheit.");

        //C -> F; T(°F) = T(°C) × 1.8 + 32;
        double tempCelsiusForFahrenheit = 100;
        double tempFahrenheitFromCelsius = (tempCelsiusForFahrenheit * 1.8) + 32;
        System.out.println(tempCelsiusForFahrenheit + " C is equal to " + tempFahrenheitFromCelsius + " degrees Fahrenheit.");

        //C -> K; T(K) = T(°C) + 273.15;
        double tempCelsiusForKelvin = 100;
        double tempKelvinFromCelsius = tempCelsiusForKelvin + 273.15;
        System.out.println(tempCelsiusForKelvin + " C is equal to " + tempKelvinFromCelsius + " degrees Kelvin.");






    }
}
