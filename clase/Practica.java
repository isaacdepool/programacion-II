public class Practica
{
	public static void main(String arg[])
	{
		int A=Leer.NInt("INGRESE EL VALOR DE A = ");
		int B=Leer.NInt("INGRESE EL VALOR DE B = ");
		MCursor.BLinea(30);
		int S=A+B;
		MCursor.TCen(10,"=======================================================");
		MCursor.TCen(34,"LA SUMA = "+S);
		MCursor.TCen(10,"=======================================================");
	}//main

}//Class