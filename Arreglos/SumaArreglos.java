import java.io.*;
class SumaArreglos
{
	public static void main (String [] args)
  	{
  		int a1, a2, a3, a4, a5, b1, b2, b3, b4, b5;
  		String  a1Cad, a2Cad, a3Cad, a4Cad, a5Cad, b1Cad, b2Cad, b3Cad, b4Cad, b5Cad;

 		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);

		try
		{
			Arreglo sum1 = new Arreglo();
			System.out.print("Valor a registrar en la primer casilla del Arreglo 1: ");
			a1Cad = flujoE.readLine();
			a1 = Integer.parseInt(a1Cad);
			System.out.print("Valor a registrar en la segunda casilla del Arreglo 1: ");
			a2Cad = flujoE.readLine();
			a2 = Integer.parseInt(a2Cad);
			System.out.print("Valor a registrar en la tercer casilla del Arreglo 1: ");
			a3Cad = flujoE.readLine();
			a3 = Integer.parseInt(a3Cad);
			System.out.print("Valor a registrar en la cuarta casilla del Arreglo 1: ");
			a4Cad = flujoE.readLine();
			a4 = Integer.parseInt(a4Cad);
			System.out.print("Valor a registrar en la quinta casilla del Arreglo 1: ");
			a5Cad = flujoE.readLine();
			a5 = Integer.parseInt(a5Cad);

			sum1.asignaArre1(a1,a2,a3,a4,a5);

			System.out.print("\nValor a registrar en la primer casilla del Arreglo 2: ");
			b1Cad = flujoE.readLine();
			b1 = Integer.parseInt(b1Cad);
			System.out.print("Valor a registrar en la segunda casilla del Arreglo 2: ");
			b2Cad = flujoE.readLine();
			b2 = Integer.parseInt(b2Cad);
			System.out.print("Valor a registrar en la tercer casilla del Arreglo 2: ");
			b3Cad = flujoE.readLine();
			b3 = Integer.parseInt(b3Cad);
			System.out.print("Valor a registrar en la cuarta casilla del Arreglo 2: ");
			b4Cad = flujoE.readLine();
			b4 = Integer.parseInt(b4Cad);
			System.out.print("Valor a registrar en la quinta casilla del Arreglo 2: ");
			b5Cad = flujoE.readLine();
			b5 = Integer.parseInt(b5Cad);

			sum1.asignaArre2(b1,b2,b3,b4,b5);


			sum1.suma();
		}
		catch (Exception e)
		{
			System.err.println("Error: "+ e.getMessage());
		}
  }
}
