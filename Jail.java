class Jail
{
String location;
String name;
int noofcells;
int noofcriminals;
int personnel;
float areaInAcres;
int yearofconstruction;
boolean strict;

Jail(String location,String name,int yearofconstructions)
{
this.location=location;
this.name=name;
this.yearofconstruction=yearofconstruction;
this.noofcells=80;
this.personnel=80;
this.noofcriminals=200;
this.areaInAcres=5;
System.out.println("created with string,string,int");
System.out.println("this.noofcells==this.personnel");
}
Jail()
{
}
}