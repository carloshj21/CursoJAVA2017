class Circulo
{
	private double r;
	public void asignaRadio (double radio)
	{
		r=radio;
	}
	public double calcPeri()
	{
		return 3.1416*r*2;
		//return p;
	}
	public double calcArea()
	{
		return 3.1416*r*r;
		//return a;
	}
}