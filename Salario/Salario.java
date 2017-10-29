class salario 
{
	private double hs;
	public void horasTrab (double hours)
	{
		hs = hours;
	}
	public double calcSal()
	{
		double he,ho,s1,s2,tsal;
		if(hs >= 0 && hs <= 40)
		{
			tsal = hs*12;
		}
		else
		{
			he = hs-40;
			ho = hs-he;
			s1 = ho*12;
			s2 = he*24;
			tsal = s1 + s2;
		}	
		return tsal;
	}
}