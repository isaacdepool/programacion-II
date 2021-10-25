/* DADO UN STRING INGRESADO POR TECLADO Y UN CHAR TAMBIEN INGRESADO
   POR TECLADO, DECIR CUANTOS CHAR IGUALES A ESTE HAY EN EL ESTRING.
*/

public class ContarLetras
{
	//METODO PARA BAJAR N NUMERO DE LINEAS
	public static void BLineas(int N)
	{	for(int l=0; l<N; l++)
			System.out.print("\n");
		return;
	}//BLineas

	//METODO PARA MOVER EL CURSOR N ESPACIOS HACIA LA DERECHA
	public static void MCursor(int N)
	{	for(int m=0; m<N; m++)
			System.out.print(" ");
		return;
	}//MCursor

	//METODO PARA MOSTRAR MENSAJE DE SALIDA
	public static void Salida()
	{	BLineas(1);
		MCursor(20);System.out.println("PRESIONE 'ENTER' PARA COMTINUAR");
		KbInput.read();
		return;
	}//Salida

	//METODO PARA LEER UN STRING
	public static String IngTex()
	{	String t;
		do {
			BLineas(30);
			System.out.print("INGRESE EL TEXTO A EVALUAR: ");
			t = KbInput.read();
			if((t.startsWith(" ") == true) || (t.length()<=0))
			{ 	MCursor(25); System.out.println("ERROR. DEBE INGRESAR UN TEXTO Y COMENZAR SIN");
			 	MCursor(25); System.out.println("             ESPACIOS EN BLANCO");
			 	Salida();
			}
		}while((t.startsWith(" ") == true) || (t.length()<=0));
		return t.toUpperCase();
	}//IngTex

	//METODO PARA BUSCAR EL TAMAÑO DEL STRING
	public static int TTexto(String texto)
	{	return texto.length();
	}//TTexto

	//METODO PARA CONTAR LOS CARACTERES
	public static int ContLet(String texto, char let, int lon)
	{	int i=0, cont=0;
		while(i<lon)
		{	if(texto.charAt(i) == let)
				cont++;
			i++;
		}
		return cont;
	}//ContLet

	//METODO PRINCIPAL
	public static void main(String arg[])
	{	String texto;
		char let;
		int nl=0;
		texto = IngTex();
		MCursor(25);System.out.print("INGRESE LA LETRA A BUSCAR = ");
		let = Character.toUpperCase(KbInputChar.read());
		nl = ContLet(texto, let, TTexto(texto));
		BLineas(30);
		MCursor(5); System.out.println("TEXTO = "+texto);
		BLineas(2);
		MCursor(35); System.out.println("LETRA = "+let);
		BLineas(2);
		MCursor(24); System.out.println("EXISTEN "+nl+" LETRAS "+let+" EN EL TEXTO");
		Salida();
	}//main
}



