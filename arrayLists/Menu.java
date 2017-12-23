import java.io.*;
import java.util.*;
class Menu
{
  private int num,i;
  ArrayList <Float> numeros = new ArrayList <Float>();

	public void altaNum (Float numAdd)
  {
    numeros.add(numAdd);
    System.out.println("Numero registrado satisfactoriamente.");
  }

  public void bajaNum (int inte)
  {
    numeros.remove(inte);
    System.out.println("Numero eliminado satisfactoriamente.");
  }

  public void alterNum (int inte, Float numAlter)
  {
    numeros.set(inte, numAlter);
    System.out.println("Numero cambiado satisfactoriamente.");
  }

  public void verNums ()
  {
    num = numeros.size();
    System.out.println("\n\nNumero de elementos registrados: "+num+".");
    if(num == 0)
    {
      System.out.println("No hay elementos registrados.");
    }
    else
    {
      for (i=0;i<num;i++) {
    		System.out.println("\n["+i+"] "+numeros.get(i));
    	}
    }
  }
}
