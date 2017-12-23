class arrayMenu extends Lectura
{
	public static void main (String [] args)
	{

    char eleccion1;

    Lectura lec1 = new Lectura();
		Menu al1 = new Menu();
    System.out.println("Hola!\nDesea ingresar al menu principal? (s/n)");
    lec1.lecChar();
    //System.out.println(chars);
    eleccion1 = chars;
    //System.out.println(eleccion1);
    if(eleccion1 == 's')
    {
      System.out.println("\nEija una opcion:\n1) Dar de alta un numero.\n2) Dar de baja un numero.\n3)Cambiar un numero.");
    }
    else
    {
        System.out.println("\nHasta Pronto!");
    }
    //al1.altaNum();
	}
}
