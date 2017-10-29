class CalcSal
{
	public static void main (String [] args)
	{
		salario sal = new salario();
		sal.horasTrab(43);
		System.out.println(sal.calcSal());
	}
}