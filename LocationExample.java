class LOcationExample
{
public static void main(String[] args)
{
String name="Tiruvananthapuram";
String state="Kerala";
int famousFor="Onam";
String bestTimeToVisit="festival";

Location location=new Location(name,state,famousFor,bestTimeToVisit);


System.out.println(location.name);
System.out.println(location.state);
System.out.println(location.famousFor);
System.out.println(location.bestTimeToVisit);
}
}