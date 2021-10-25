// Autor M.Sc. Maria Eugenia Fossi Medina

public class Leer
{
	//METODO PARA LEER NUMEROS TIPO BYTE
	public static byte NByte(String texto, int p){
		byte b = 0;
		boolean aux;
		do{
			try{
				System.out.print(texto);
				b = Byte.parseByte(KbInput.read());
				aux = true;
			}
			catch(NumberFormatException exc){
				System.out.println();
				MCursor.TCen(21, "ERROR, VALOR FUERA DEL RANGO PERMITIDO");
				System.out.println();
				MCursor.UCursor(p);
				aux = false;
			}
		}while(aux == false);
	    return b;
	}//NByte

	//METODO PARA LEER NUMEROS TIPO SHORT
	public static short NShort(String texto, int p){
		short n = 0;
		boolean aux;
		do{
			try{
				System.out.print(texto);
				n = Short.parseShort(KbInput.read());
				aux = true;
			}
			catch(NumberFormatException exc){
				System.out.println();
				MCursor.TCen(21, "ERROR, VALOR FUERA DEL RANGO PERMITIDO");
				System.out.println();
				MCursor.UCursor(p);
				aux = false;
			}
		}while(aux == false);
	    return n;
	}//NShort

	//METODO PARA LEER NUMEROS TIPO INT
	public static int NInt(String texto, int p){
		int Ni = 0;
		boolean aux;
		do{
			try{
				System.out.print(texto);
				Ni = Integer.parseInt(KbInput.read());
				aux = true;
			}
			catch(NumberFormatException exc){
				System.out.println();
				MCursor.TCen(21, "ERROR, VALOR FUERA DEL RANGO PERMITIDO");
				System.out.println();
                MCursor.UCursor(p);
				aux = false;
			}
		}while(aux == false);
	    return Ni;
	}//NInt

	//METODO PARA LEER NUMEROS TIPO LONG
	public static long NLong(String texto)
	{	System.out.print(texto);
		return Long.parseLong(KbInput.read());
	}//NLong

	//METODO PARA LEER NUMEROS TIPO FLOAT
	public static float NFloat(String texto, int p){
		float Nf = 0;
		boolean aux;
		do{
			try{
				System.out.print(texto);
				Nf = Float.parseFloat(KbInput.read());
				aux = true;
			}
			catch(NumberFormatException exc){
				System.out.println();
				MCursor.TCen(21, "ERROR, VALOR FUERA DEL RANGO PERMITIDO");
				System.out.println();
				MCursor.UCursor(p);
				aux = false;
			}
		}while(aux == false);
	    return Nf;
	}//NFloat

	//METODO PARA LEER NUMEROS TIPO DOUBLE
	public static double NDouble(String texto)
	{	System.out.print(texto);
		return Double.parseDouble(KbInput.read());
	}//NDouble

	//METODO PARA LEER UN CARECTER
	public static char CChar(String texto)
	{	System.out.print(texto);
		return KbInputChar.read();
	}//CChar

	//METODO PARA INGRESAR UN TEXTO
	public static String CString(String texto)
	{	String t;
		do{	System.out.print(texto);
			t = KbInput.read();
			if((t.startsWith(" ") == true) || (t.length()<=0))
			{ 	System.out.println("ERROR. DEBE INGRESAR UN TEXTO Y COMENZAR SIN");
			 	System.out.println("             ESPACIOS EN BLANCO");
			}
		}while((t.startsWith(" ") == true) || (t.length()<=0));
		return t;
	}//IngTex

}//class