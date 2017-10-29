class CalcCirc
{
	public static void main(String [] args)
	{
		Circulo circ = new Circulo();
		circ.asignaRadio(1.0);
		System.out.println(circ.calcPeri());
		System.out.println(circ.calcArea());
	}
}
