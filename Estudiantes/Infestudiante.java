class InfEstudiante
{
	public static void main (String [] args)
	{
		Estudiante est0 = new Estudiante();
		Estudiante est1 = new Estudiante("Carlos Hernandez Juarez",210800,"316262165");
		est1.asignaTurno("Matutino");
		est1.asignaGrupo("601");
		est1.conocerSituacion("Regular");
		System.out.print("\n\n\n");
		EstudianteETE est2 = new EstudianteETE();
		Estudiante est3 = new EstudianteETE("Carlos Hernandez Juarez",210800,"316262165","Computacion");
		//est3.asignaGrupo("401");
	}
}
