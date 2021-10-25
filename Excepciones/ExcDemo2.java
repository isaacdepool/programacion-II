public class ExcDemo2
{

	public static byte LByte(String tex)
	{	byte valor;
		System.out.print(tex);
		valor = Byte.parseByte(KbInput.read());
		return valor;
	}

	public static void main(String arg[])
	{
		byte num = LByte("INGRESE UN NUMERO TIPO BYTE = ");
		System.out.println("EL NUMERO INGRESADO FUE = " + num);
	}


	/*public static byte LByte(String tex)
	{	byte valor=0;
		boolean aux;
		do{
			try{
				System.out.print(tex);
				valor = Byte.parseByte(KbInput.read());
				aux = true;
			}
			catch(NumberFormatException exc)
			{	System.out.println("\n\n\n\n\n");
				System.out.println("ERROR, VALOR FUERA DEL RANGO PERMITIDO");
				System.out.println("\n\n\n\n\n");
				aux = false;
			}
		}while(aux == false);
		return valor;
	}*/

}//class



























