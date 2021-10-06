class CurrencyRunner
{
public static void main(String[] args)
{
Currency currency=new class("Rupees");
currency.displayDetails();
currency=new currency("dollor");
currency.value=0.18f;
System.out.println(currency);

currency.displayDetails();
currency=new currency("euros");
currency.value=0.18f;
currency.displayDetails();
currency.country=new countryDetails("India",91);
System.out.println(currency.country);
CountryDetail country=currency.country;
country.displayDetails();

Application application=new Application("Java",10.21);
application.displayDetails();
application.company=new companyDetails("Oracle","xyz","abc");

CompanyDetails company=application.company;
company.displayDetails();
}
}
