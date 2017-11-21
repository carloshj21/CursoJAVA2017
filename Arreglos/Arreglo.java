class Arreglo
{
	private int[] sum = new int[5];
	private int[] sum2 = new int[5];
	private int [] res = new int[5];

	public Arreglo()
	{
		System.out.println("\nBienvenido al sistema.\n");
		/*sum[0]= 23;
		System.out.println(cant1+"\n"+sum[0]);*/
	}
	public void asignaArre1 (int a1, int a2, int a3, int a4, int a5)
	{
		sum[0] = a1;
		sum[1] = a2;
		sum[2] = a3;
		sum[3] = a4;
		sum[4] = a5;

		/*System.out.println(sum[0]);
		System.out.println(sum[1]);
		System.out.println(sum[2]);
		System.out.println(sum[3]);
		System.out.println(sum[4]);*/
	}

	public void asignaArre2 (int b1, int b2, int b3, int b4, int b5)
	{
		sum2[0] = b1;
		sum2[1] = b2;
		sum2[2] = b3;
		sum2[3] = b4;
		sum2[4] = b5;

		/*System.out.println(sum2[0]);
		System.out.println(sum2[1]);
		System.out.println(sum2[2]);
		System.out.println(sum2[3]);
		System.out.println(sum2[4]);*/
	}

	public void suma ()
	{
		res[0] = sum[0] + sum2[0];
		res[1] = sum[1] + sum2[1];
		res[2] = sum[2] + sum2[2];
		res[3] = sum[3] + sum2[3];
		res[4] = sum[4] + sum2[4];

		System.out.println("\n\nLa sumas de cada una de las casillas del Arreglo 1 con su correspondiente en el Arreglo 2 son:\n");
		System.out.println("Arreglo1[0] + Arreglo2[0] = " + res[0]);
		System.out.println("Arreglo1[1] + Arreglo2[1] = " + res[1]);
		System.out.println("Arreglo1[2] + Arreglo2[2] = " + res[2]);
		System.out.println("Arreglo1[3] + Arreglo2[3] = " + res[3]);
		System.out.println("Arreglo1[4] + Arreglo2[4] = " + res[4]);
	}
}
