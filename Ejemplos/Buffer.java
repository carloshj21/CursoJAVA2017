import java.io.*;   //Jala todo lo que está en la librería Java.io      io= input/output
class CalcEmplea2
{
	public static void main (String [] args)
	{
		String htCad;
		double htNum=0;

		InputStreamReader isr = new InputStreamReader(System.in);   //Entrada de estandar= System.in, en este caso System.in es el teclado.
		BufferedReader flujoE = new BufferedReader(isr);

		try
		{
			System.out.print("Horas trabajadas:");
			htCad = flujoE.readLine();    // readLine, recibe y hace un salto de línea.
			htNum = Double.parseDouble(htCad);
		}
		catch (Exception e)
		{
			System.err.println("Error: "+ e.getMessage());
		}
	}
}
