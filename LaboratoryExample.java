class  LaboratoryExample
{
public static void main(String[] args)
{
String name="CS";
String location="5 th Floor";
int noOfRooms=6;

Laboratory lab=new Laboratory(name,location,noOfRooms);
System.out.println(lab.name);
System.out.println(lab.location);
System.out.println(lab.noOfRooms);

lab.noOfRooms=4;
System.out.println(lab.noOfRooms);
lab.location="3 rd Floor";
System.out.println(lab.location);
System.out.println(lab.location=location);
}
}