public class Ejer02{
public static void main(String arg[])
	{
		MCursor.UCursor(10);
		String Texto = Leer.CString("INGRESE EL TEXTO A EVALUAR = ");
		int S=0;
		for (int i=0; i<Texto.length(); i++)
			 S += SumaD(Texto.charAt(i));
		if (S == 0)
			MCursor.TCen(26, "NO HAY DIGITOS EN EL STRING");
		else
			MCursor.TCen(26, "LA SUMA DE LOS DIGITOS = " + S);
	} // main

	// METODO PARA VER SI UN CHAR ES UN DIGITO Y DEVOLVER SU VALOR
	public static int SumaD(char L)
	{
		switch(L)
		{
			case '1': return 1;
			case '2': return 2;
			case '3': return 3;
			case '4': return 4;
			case '5': return 5;
			case '6': return 6;
			case '7': return 7;
			case '8': return 8;
			case '9': return 9;
		}
		return 0;
	}
}
