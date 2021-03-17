import java.util.Random;

class Main 
{
  private static int randomNums = 8;
  public static void main(String[] args) 
  {
    for(int i = 1; i < random()+1; i++)
    {
      System.out.println("Alien " + i + ": " + blurb() + "\n");
    }//end for loop
    System.out.println("zzz...Interception from Earth: PP8.0-alienConversation by Fiona Wee Eng...zzz");
  }//end main

  public static String blurb()
  {
    return whoozit() + whatzit();
  }//end method blurb

  public static String whoozit()
  {
    String whoo = "xy";
    if(random2() == 0)
    {
      whoo = "x0";
    }
    else
    {
      if(random2() == 0)
      {
        for(int i = 0; i < random(); i++)
        {
          whoo+="y";
        }//end for
      }//end inner if
    }//end outer if
    return whoo;
  }//end method whoozit

  public static String whatzit()
  {
    String what = "qz";
    for(int i = 0; i < random(); i++)
    {
      if(random2() == 0)
      {
        what += "qd";
      }
      else
      {
        what += what;
      }//end if
    }//end outer for
    return what;
  }//end method whatzit

  public static int random2()
  {
    Random randa = new Random();
    int a = randa.nextInt(2);
    return a;
  }//end method random2

  public static int random()
  {
    Random randb = new Random();
    int b = randb.nextInt(randomNums);
    return b+1; //add 1 to make sure each run is a conversation (at least two aliens blurbing)
  }//end method random
}//end class Main