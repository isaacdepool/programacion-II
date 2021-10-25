// Autor M.Sc. Maria Eugenia Fossi Medina

public class Leer
{
	//METODO PARA LEER NUMEROS TIPO BYTE
	public static byte NByte(String tex)
		{	byte val=0;
			boolean aux;
			do{
				try{
					System.out.print(tex);
					val = Byte.parseByte(KbInput.read());
					aux = true;
				}
				catch(NumberFormatException ex)
				{	 MCursor.TCen(10, "============================================================");
					 MCursor.TCen(10," E 	R	 R	 O	 R!!!, 	VALOR NO PERMITIDO");
					 MCursor.TCen(10, "============================================================");
					 MCursor.UCursor(20);
					aux = false;
				}
			}while(aux == false);
			return val;
	}//NByte

	//METODO PARA LEER NUMEROS TIPO SHORT
	public static short NShort(String tex)
		{	short va=0;
			boolean aux;
			do{
				try{
					System.out.print(tex);
					va = Short.parseShort(KbInput.read());
					aux = true;
				}
				catch(NumberFormatException ex)
				{	 MCursor.TCen(10, "============================================================");
					 MCursor.TCen(10," E 	R	 R	 O	 R!!!, 	VALOR NO PERMITIDO");
					 MCursor.TCen(10, "============================================================");
					 MCursor.UCursor(20);
					aux = false;
				}
			}while(aux == false);
			return va;
	}//NShort

	//METODO PARA LEER NUMEROS TIPO INT
	public static int NInt(String tex)
		{	int v=0;
			boolean aux;
			do{
				try{
					System.out.print(tex);
					v = Integer.parseInt(KbInput.read());
					aux = true;
				}
				catch(NumberFormatException ex)
				{	 MCursor.TCen(10, "============================================================");
					 MCursor.TCen(10," E 	R	 R	 O	 R!!!, 	VALOR NO PERMITIDO");
					 MCursor.TCen(10, "============================================================");
					 MCursor.UCursor(20);
					aux = false;
				}
			}while(aux == false);
			return v;
	}//NInt

	//METODO PARA LEER NUMEROS TIPO LONG
	public static long NLong(String tex)
		{	long valu=0;
			boolean aux;
			do{
				try{
					System.out.print(tex);
					valu = Long.parseLong(KbInput.read());
					aux = true;
				}
				catch(NumberFormatException ex)
				{	 MCursor.TCen(10, "============================================================");
					 MCursor.TCen(10," E 	R	 R	 O	 R!!!, 	VALOR NO PERMITIDO");
					 MCursor.TCen(10, "============================================================");
					 MCursor.UCursor(20);
					aux = false;
				}
			}while(aux == false);
			return valu;
	}//NLong

	//METODO PARA LEER NUMEROS TIPO FLOAT
	public static float NFloat(String tex)
		{	float value=0;
			boolean aux;
			do{
				try{
					System.out.print(tex);
					value = Float.parseFloat(KbInput.read());
					aux = true;
				}
				catch(NumberFormatException ex)
				{	 MCursor.TCen(10, "============================================================");
					 MCursor.TCen(10," E 	R	 R	 O	 R!!!, 	VALOR NO PERMITIDO");
					 MCursor.TCen(10, "============================================================");
					 MCursor.UCursor(20);
					aux = false;
				}
			}while(aux == false);
			return value;
	}//NFloat

	//METODO PARA LEER NUMEROS TIPO DOUBLE
	public static double NDouble(String tex)
		{	double vale=0;
			boolean aux;
			do{
				try{
					System.out.print(tex);
					vale = Double.parseDouble(KbInput.read());
					aux = true;
				}
				catch(NumberFormatException ex)
				{	 MCursor.TCen(10, "============================================================");
					 MCursor.TCen(10," E 	R	 R	 O	 R!!!, 	VALOR NO PERMITIDO");
					 MCursor.TCen(10, "============================================================");
					 MCursor.UCursor(20);
					aux = false;
				}
			}while(aux == false);
			return vale;
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