class NartakiTheaterRunner
{
public static void  main(String[] values)
{
Theater theater=new Theater("Naraki",TicketPrice.BOX);
theater.location="Majestic";
System.out.println(theater);
System.out.println(theater.name);
System.out.println(theater.location);
System.out.println(theater.capacity);
System.out.println(theater.ticketprice);
System.out.println(theater.ticketprice.price);
System.out.println(theater.ticketprice.tax);
}
}
