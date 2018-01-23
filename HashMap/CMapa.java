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
    for(car='a'; car<='z'; car++)
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
    //---------------------------------23/01/2018--------------------
      System.out.print("\n");
      Iterator <Map.Entry<Character, Integer>> it=c.entrySet().iterator();
      while (it.hasNext())
      {
        Map.Entry<Character,Integer> elem=it.next();
        System.out.println(elem.getKey()+" "+elem.getValue()); //getKey= valor del lado izquierdo;  getValue=valor del lado derecho
      }
      System.out.println(c.size()+" elementos");

/*
        containsKey: revisar si ya está definida una llave con el valor dado.
        containsValue: revisar si ya está definido un valor en el HashMap.
        remove
        isEmpty
        clear
*/

/*
      1. Altas
      2. Bajas
      3. Cambios
      4. Consulta individual
      5. Consulta general
      6. Salir
*/

  }
}
