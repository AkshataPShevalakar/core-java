class Person{
public static String PersonName(byte date,String month,short year)
{
if(date==23 && month=="may" && year==1998){
return "Akshu";
}
if(date==1 && month=="june" && year==2002){
return "Pavan";
}
if(date==18 && month=="september" && year==2006){
return "Ajith";
}
return "No match for this Date Of Birth";
}
}
