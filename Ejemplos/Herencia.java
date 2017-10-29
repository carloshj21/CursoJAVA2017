class Empleado
{

}

class EmpleadoNoc extends Empleado
{
	private estimproduct;
	public void asignaestimproduc(double ep)
	{
		estimproduc = ep;
		return;
	}
	public double calcSueldo()
	{
		return horas*12+estimproduct;
	}
}


super.calcSueldo();  //Para mandar llamar al constructor o método del padre.