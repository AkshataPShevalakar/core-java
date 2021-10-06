class Weather
{
static int numberOfInstance=0;
WeatherSeason Season;
float temperatureinCelsius=28.0f;
String humidity;
boolean feel;
Weather(weatherSeason Season,String humidity)
{
numberOfInstance++;
this.Season=Season;
this.humidity=humidity;
}
}