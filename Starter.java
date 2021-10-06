class Starter{
public static void main(String[] args)
{
System.out.println(args);
System.out.println(args.length);
System.out.println(args[0]);
System.out.println(args[1]);
String movieName="KGF";
String[] acs=Movie.getActorsByMovieName(movieName);
System.out.println(acs);
System.out.println(acs[0]);
}
}