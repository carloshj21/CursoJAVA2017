import java.io.*;
import java.util.*;
class Menu
{
  private int num;
  ArrayList <Float> numeros = new ArrayList <Float>();



  public void altaNum ()
  {
    numeros.add(14.34F);
    num = numeros.size();
    System.out.println(num);
  }

}
