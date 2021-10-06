class GrinderStarter
{
public static void main(String[] idlis)
{
Grinder ref=new Grinder(1,"Prestige");

System.out.println(ref.capacity);
System.out.println(ref.company);

int capacity=ref.capacity;
String company=ref.company;

System.out.println(ref.capacity);
System.out.println(ref.company);
Motor motor=ref.motor;
System.out.println(motor.model);
}
}
