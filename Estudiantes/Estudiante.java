class Estudiante
{
	private String nom, nocuen,turn,group,situation;
	public Estudiante ()
	{
		System.out.println("\nBienvenido al sistema!\n");
	}
	public Estudiante (String nom, int fechnac, String nocuen)
	{
		System.out.println(nom);
		System.out.println(fechnac);
		System.out.println(nocuen);
	}
	public void asignaTurno(String turno)
	{
		turn=turno;
		System.out.println("El alumno ha sido registrado en el turno: "+turn+".");
	}
	public void asignaGrupo(String grupo)
	{
		group=grupo;
		System.out.println("El alumno ha sido registrado en el grupo: "+group+".");
	}
	public void conocerSituacion(String situacion)
	{
		situation=situacion;
		System.out.println("La situacion escolar del alumno es: "+situation+".");
	}
}

class EstudianteETE extends Estudiante
{
		private String etec;
		public EstudianteETE ()
		{
			super();
		}
		public EstudianteETE (String nom, int fechnac, String nocuen, String ete)
		{
		 	super(nom, fechnac, nocuen);
			etec=ete;
			System.out.println("El alumno ha sido inscrito en la ETE: "+etec+".");
		}
}
