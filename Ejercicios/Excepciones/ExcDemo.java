//MUESTRA EL MANEJO DE EXCEPCIONES

class ExcDemo
{

	public static void main(String arg[])
	{
		int num[] = new int[4];
		int i = 6;
		num[i] = 10;
		System.out.println("EL NUMERO GUARDADO EN LA POSICION "+i+" = "+num[i]);
	}
/*

	public static void main(String arg[])
	{
		int num[] = new int[4];
		int i = 2;
		try{
			System.out.println("ANTES DE GENERAR LA EXCEPCION");
			num[i] = 10;
			System.out.println("EL VALOR GUARDADO ES = "+num[i]);
		}
		catch(ArrayIndexOutOfBoundsException exc)
		{
			System.out.println("INDICE FUERA DE LIMITE");
		}
		System.out.println("DESPUES DE ATRAPAR LA DECLARACION");
		//System.out.println("EL VALOR GUARDADO ES = "+num[i]);
	}
*/
}

