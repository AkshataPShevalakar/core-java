class Developer11Example
{
public static void main(String[] args)
{
String name="Omkar";
String designation="Software Developer";
int salary=5000000;
int totalExp=12;

Developer11 ref=new Developer11(name,designation,salary,totalExp);


System.out.println(ref.name);
System.out.println(ref.designation);
System.out.println(ref.salary);
System.out.println(ref.totalExp);
}
}