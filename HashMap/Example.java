import java.util.*;
import java.io.*;
public class CMapa
{
  public static void main(String[] args)
  {
    HashMap <Character, Integer> c=new HashMap<Character, Integer>();
    char car;
    int v;
    final char eof=(char)-1;
    for(car='a'; car='z'; car++)
      c.put(car,0);
      System.out.println("Introducir texto:");
      System.out.println("Para finalizar pulsa Ctrl+z...\n");
      try{
        while((car=(char)System.in.read())!=eof)
          if(car>='a'&&car<='z')
          {
            v=c.get(car);
            c.put(car,++v);
          }
      }
      catch(IOException e){}
        System.out.println("\nTabla de frecuencias\n");
        for(car='a';car<='z';car++)
          System.out.print(" "+car+" ");
        System.out.println("\n_________________________");
        for(car='a';car<='z';car++)
          System.out.printf("%3d",c.get(car));
  }
}
