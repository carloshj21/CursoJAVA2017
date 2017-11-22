import java.io.*;
class Lectura
{
  static Integer inte;
  static Float floati;
  static Double dobli;
  static char chars;
  static String cadRec;

  public static void recCad ()
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader flujoE = new BufferedReader(isr);
    try
    {
      //System.out.println("Ingrese el dato a convertir: ")
      cadRec = flujoE.readLine();
    }
    catch (Exception e)
    {
      System.err.println("Error: "+ e.getMessage());
    }
  }

  public static Integer lecInt ()
  {
    recCad();
    inte = Integer.parseInt(cadRec);
    return inte;
  }

  public static Float lecFloat ()
  {
    recCad();
    floati = Float.parseFloat(cadRec);
    return floati;
  }

  public static Double lecDouble ()
  {
    recCad();
    dobli = Double.parseDouble(cadRec);
    return dobli;
  }

  public static char lecChar ()
  {
    recCad();
    chars = cadRec.charAt(0);
    return chars;
  }
}
