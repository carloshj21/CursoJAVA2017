import java.io.*;
class RegistroEstudiante
{
	public static void main (String [] args)
	{
		String nombre, fechnaci, nocuenta, turno, grupo, situacion, ete;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);

		try
		{
			System.out.println("\nBienvenido al sistema!\n");
			//Nombre
			System.out.print("Nombre del alumno a registrar: ");
			nombre = flujoE.readLine();
			//Fecha de Nacimiento
			System.out.print("Fecha de nacimiento: ");
			fechnaci = flujoE.readLine();
			//Número de cuenta
			System.out.print("Numero de cuenta: ");
			nocuenta = flujoE.readLine();

			Estudiante est1 = new Estudiante(nombre,fechnaci,nocuenta);   // Constructor de Estudiante
			//Turno
			System.out.print("Turno: ");
			turno = flujoE.readLine();
			est1.asignaTurno(turno);
			//Grupo
			System.out.print("Grupo: ");
			grupo = flujoE.readLine();
			est1.asignaGrupo(grupo);
			//Situación escolar
			System.out.print("Situacion escolar: ");
			situacion = flujoE.readLine();
			est1.conocerSituacion(situacion);

			est1.conocerValores();        // Se despliegan todos los valores introducidos
			System.out.print("\n\n\n");



			//Nombre
			System.out.print("Nombre del alumno a registar en una ETE: ");
			nombre = flujoE.readLine();
			//Fecha de Nacimiento
			System.out.print("Fecha de nacimiento: ");
			fechnaci = flujoE.readLine();
			//Número de cuenta
			System.out.print("Numero de cuenta: ");
			nocuenta = flujoE.readLine();
			//ETE
			System.out.print("ETE a la cual se desea registrar: ");
			ete = flujoE.readLine();

			Estudiante est2 = new EstudianteETE(nombre,fechnaci,nocuenta,ete);   //Constructor de Estudiante ETE
		}
		catch (Exception e)
		{
			System.err.println("Error: "+ e.getMessage());
		}
	}
}
