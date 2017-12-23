class arrayMenu extends Lectura
{
	public static void main(String[] args)
	{

    char eleccion1,eleccion2;
		int posi;

    Lectura lec1 = new Lectura();
    Lectura lec2 = new Lectura();
		Lectura lec3 = new Lectura();
    Menu al1 = new Menu();

		do
		{
			System.out.println("\nElija una opcion:\n1) Dar de alta un numero.\n2) Dar de baja un numero.\n3) Cambiar un numero.\n4) Ver los elementos registrados.");
			lec2.lecChar();
			eleccion2 = chars;
			if (eleccion2 == '1')
			{
				System.out.println("\nIngrese el numero a registrar:");
				lec3.lecFloat();
				al1.altaNum(floati);
			}
			if (eleccion2 == '2')
			{
				al1.verNums();
				System.out.println("\nIngrese el numero de la posicion del elemento que quiera dar de baja:");
				lec3.lecInt();
				al1.bajaNum(inte);
			}
			if (eleccion2 == '3')
			{
				al1.verNums();
				System.out.println("\nIngrese el numero de la posicion del elemento que quiera cambiar:");
				lec3.lecInt();
				posi = inte;
				System.out.println("\nIngrese el valor del numero nuevo:");
				lec3.lecFloat();
				al1.alterNum(posi,floati);
			}
			if(eleccion2 == '4')
			{
				al1.verNums();
			}
			System.out.println("\nDesea realizar otra accion? (s/n)");
	    lec1.lecChar();
	    eleccion1 = chars;
		}
		while(eleccion1 == 's');
		System.out.println("\nHasta Pronto!");
	}
}
