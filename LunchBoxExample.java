class LunchBoxExample
{
public static void main(String[] args)
{
String name="HotBox";
String material="Fiber";
int price=5000;

LunchBox lb=new LunchBox(name,material,price);

System.out.println(lb.name);
System.out.println(lb.material);
System.out.println(lb.price);
}
}

