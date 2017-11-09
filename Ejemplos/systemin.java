class Lectura
{
  public static void main (String args[])
  {
    int letra=' ';
    try
    {
      letra=System.in.read();
    }
    catch (Exception a)
    {
      System.err.println("Error: "+ a.getMessage());
    }
    System.out.println(letra);
  }
}
