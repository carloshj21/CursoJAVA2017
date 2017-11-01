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
			//Estudiante Normal
			Estudiante est0 = new Estudiante();   //Constructor de Estudiante
			//Nombre
			System.out.print("Nombre del alumno a registrar: ");
			nombre = flujoE.readLine();
			//Fecha de nacimiento
			System.out.print("Fecha de nacimiento: ");
			fechnaci = flujoE.readLine();
			//Número de cuenta
			System.out.print("Numero de cuenta: ");
			nocuenta = flujoE.readLine();
			Estudiante est1 = new Estudiante(nombre,fechnaci,nocuenta);    //Constructor de Estudiante instanciando valores
			//Turno
			System.out.print("Turno: ");
			turno = flujoE.readLine();
			est1.asignaTurno(turno);    //Se asigna turno
			//Grupo
			System.out.print("Grupo: ");
			grupo = flujoE.readLine();
			est1.asignaGrupo(grupo);   //Se asigna grupo
			//Situación escolar
			System.out.print("Situacion escolar: ");
			situacion = flujoE.readLine();
			est1.conocerSituacion(situacion);    //Se asigna situación escolar
			est1.conocerValores();      //Se despliegan en pantalla los datos introducidos
			System.out.print("\n\n\n");

			//Estudiante con ETE
			EstudianteETE est2 = new EstudianteETE();    //Constructor de Estudiante ETE
			//Nombre
			System.out.print("Nombre del alumno a registar en una ETE: ");
			nombre = flujoE.readLine();
			//Fecha de nacimiento
			System.out.print("Fecha de nacimiento: ");
			fechnaci = flujoE.readLine();
			//Número de cuenta
			System.out.print("Numero de cuenta: ");
			nocuenta = flujoE.readLine();
			//Opción Técnica
			System.out.print("ETE a la cual se desea registrar: ");
			ete = flujoE.readLine();
			Estudiante est3 = new EstudianteETE(nombre,fechnaci,nocuenta,ete);   //Constructor de Estudiante ETE instanciando valores
		}
		catch (Exception e)
		{
			System.err.println("Error: "+ e.getMessage());
		}
	}
}
