class JailRunner
{
public static void main(String[] args)
{
String location="Ballary";
String name="Ballary Central Jail";
int yearofconst=1875;

Jail jail=new Jail(location,name,yearofconst);
System.out.println(jail.name);
System.out.println(jail.yearofconstruction);
System.out.println(jail.noofcells);
System.out.println(jail.noofcriminals);
System.out.println(jail.strict);
System.out.println(jail.personnel);
System.out.println(jail.areaInAcres);

System.out.println(location=jail.location);
System.out.println(Jail.noofcells=Jail.personnel);
}
}