class Prueba
{
  public static void main (String [] args)
  {
    Integer s1, s2, suma;

    Lectura l1 = new Lectura();
    Lectura l2 = new Lectura();
    s1 = l1.lecInt();
    s2 = l2.lecInt();

    suma = s1 + s2;
    System.out.println(suma);
  }
}
