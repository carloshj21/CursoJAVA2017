class Estudiante
{
	static int NUMALUM = 0;
	private String nom,fechnac,nocuen,turn,group,situation;
	public Estudiante ()
	{
		System.out.println("\nBienvenido al sistema!\n");
	}
	public Estudiante (String nombre, String fechnaci, String nocuenta)
	{
		nom=nombre;
		fechnac=fechnaci;
		nocuen=nocuenta;
		NUMALUM++;
	}
	public void asignaTurno(String turno)
	{
		turn=turno;
	}
	public void asignaGrupo(String grupo)
	{
		group=grupo;
	}
	public void conocerSituacion(String situacion)
	{
		situation=situacion;
	}
	public void conocerValores()
	{
		System.out.println("\n\n\n");
		System.out.println("Nombre del alumno: "+nom);
		System.out.println("Fecha de Nacimiento: "+fechnac);
		System.out.println("Numero de cuenta: "+nocuen);
		System.out.println("El alumno ha sido registrado en el turno: "+turn+".");
		System.out.println("El alumno ha sido registrado en el grupo: "+group+".");
		System.out.println("La situacion escolar del alumno es: "+situation+".");
		System.out.println("\n");
		System.out.println("El numero de alumnos registrados es: "+NUMALUM);
	}
}

class EstudianteETE extends Estudiante
{
		private String etec;
		public EstudianteETE ()
		{
			super();
		}
		public EstudianteETE (String nom, String fechnac, String nocuen, String ete)
		{
		 	super(nom, fechnac, nocuen);
			etec=ete;
			System.out.println("\n\nEl alumno "+nom+" ha sido inscrito en la ETE: "+etec+".");
		}
}
