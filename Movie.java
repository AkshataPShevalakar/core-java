class Movie{
public static String[] getActorsByMovieName(String movieName)
{
System.out.println("invoked getActorsByMovieName,arg passed"+movieName);
if(movieName.equals("KGF"))
{
System.out.println("KGF is matched");
String hero="Yash";
String heroin="Srinidhi";
String narrator="Anathnag";
String[] actors={hero,heroin,narrator};
return actors;
}
else{
System.out.println("Movie is not KGF");
}
return null;
}
}