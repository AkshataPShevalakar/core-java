class TheaterRunner
{
public static void main(String[] args)
{
TicketPrice tp=TicketPrice.GANDHI;
System.out.println("Gandhi = "+tp.price);

TicketPrice btp=TicketPrice.BALCONY;
System.out.println(btp.price);
System.out.println(btp.tax);
System.out.println(TicketPrice.BOX.tax + TicketPrice.BOX.price);
}
}
