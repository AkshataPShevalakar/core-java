class Festival
{
String festreligon;
String festname;
String day;
String month;

Festival()
{
  System.out.println("invoking default const");
  }
  
  Festival(String name,int noofmembers,int score,int wicket,String coacher)
  {
  System.out.println("invoking parameterized const");
  
  this.name=name;
  this.noofmembers=noofmembers;
  this.score=score;
  this.wicket=wicket;
  this.coacher=coacher;
  }
  CricketTeam(int score,int wicket)
  {
  this.score=score;
  this.wicket=wicket;
  }
  }