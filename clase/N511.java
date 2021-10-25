/*LOS COMENTARIOS SON IGUALES QUE  EN C
*/
public class N511
{
	public static void main(String arg[])
	{
		int S,A,B;
		System.out.print("INGRESE EL VALOR DE A = ");
		A=Integer.parseInt(KbInput.read());
		System.out.print("INGRESE EL VALOR DE B = ");
		B=Integer.parseInt(KbInput.read());
		S=A+B;
		System.out.println("SUMA = "+S);
	}//main

	public static int LInt(String Texto)
	{
		System.out.print(Texto);
		return Integer.parseInt(KbInput.read());
	}//LInt
}//class