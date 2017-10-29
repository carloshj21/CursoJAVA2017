class Circulo
{
  final static float PI=3.1416F;
  private double r;
	public void asignaRadio (double radio)
	{
		r=radio;
	}
	public double calcPeri()
	{
		return PI*r*2;
	}
	public double calcArea()
	{
		return PI*r*r;
	}
}
