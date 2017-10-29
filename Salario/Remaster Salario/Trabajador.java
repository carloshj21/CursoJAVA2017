class Trabajador
{
	private float hs,tsal,he,ho,s1,s2;
	public Trabajador ()
	{
		System.out.println("Trabajador Creado!");
	}
	public Trabajador (float hours)
	{
		hs = hours;
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
		System.out.println(tsal);
	}
}



	
/*	public double calcSal()
	{
		float he,ho,s1,s2;
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
}*/