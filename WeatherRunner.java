class WeatherRunner
{
public static voidmain(String[] args)
{
WeatherSeason Season=WeatherSeason.RAINY;
String humidity="cloudy";
Weather weather=new Weather(Season,humidity);
Weather.feel=true;
System.out.println(weather.Season);
System.out.println(weather.temperatureinCelsius);
System.out.println(weather.humidity);
System.out.println(weather.feel);
System.out.println(weather.numberOfInstance);
}
}
