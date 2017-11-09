class EstudianteETE extends Estudiante
{
		private String etec;
		public EstudianteETE (String nom, String fechnac, String nocuen, String ete)
		{
		 	super(nom, fechnac, nocuen);
			etec=ete;
			System.out.println("\n\nEl alumno "+nom+" ha sido inscrito en la ETE: "+etec+".");
      System.out.println("\nEl numero de alumnos registrados es: "+NUMALUM);
		}
}
