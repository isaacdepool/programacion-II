/* PROGRAMA PARA EJEMPLIFICAR EL MANEJO DE STRING CON LAS SENTENCIAS DADAS POR
   EL JAVA
*/
public class Cad_Carat
{
	static String texto, texto2;

	//METODO PARA BAJAR N NUMEROS DE LINEAS EN EL MONITOR
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

	//METODO PARA INGRESAR EL TEXTO A TRABAJAR
	public static String IngTex()
	{	String t;
		do {
			BLineas(30);
			System.out.print("INGRESE EL TEXTO A EVALUAR: ");
			t = KbInput.read();
			if((t.startsWith(" ") == true) || (t.length()<=0))
			{ 	MCursor(25); System.out.println("ERROR. DEBE INGRESAR UN TEXTO Y COMENCAR SIN");
			 	MCursor(25); System.out.println("             ESPACIOS EN BLANCO");
			 	Salida();
			}
		}while((t.startsWith(" ") == true) || (t.length()<=0));
		return t;
	}//IngTex

	//METODO PARA MOSTRAR EL TEXTO INDICADO
	public static void MTexto(String tex)
	{	MCursor(20);System.out.println("TEXTO INGRESADO: ''"+tex+"''");
		return;
	}//MTexto

	//METODO PARA BUSCAR EL TAMAÑO DEL STRING
	public static int TTexto()
	{	return texto.length();

	}//TTexto

	//METODO PARA UBICAR LA LETRA Y LA POSICION QUE OCUPA EN EL TEXTO
	public static void PLTexto(int l)
	{	BLineas(30);
		MCursor(20); System.out.println("LAS LETRAS DEL STRING SON:");
		int i=0,j;
		while(i<l)
		{	if(i<10) j=11;
			else 	 j=10;
			MCursor(20); System.out.println("P_"+i+" = "+texto.charAt(i));
			i++;
		}
		Salida();
		return;
	}//PLTexto

	//METODO PARA VERIFICAR SI DOS TEXTOS SON IGUALES
	public static void VIguTexto(int est)
	{	boolean res;
		BLineas(30);
		MCursor(20); System.out.println("EL PRIMER TEXTO ES:");
		MTexto(texto);
		BLineas(2);
		MCursor(20); System.out.println("EL SEGUNDO TEXTO ES:");
		MTexto(texto2);
		if(est == 1)
			res = texto.equals(texto2);
		else
			res = texto.equalsIgnoreCase(texto2);
		BLineas(2);
		if(res == true)
		{	MCursor(20); System.out.println("LOS TEXTOS SON IGUALES"); }
		else
		{	MCursor(20); System.out.println("LOS TEXTOS SON DIFERENTES"); }
		Salida();
		return;
	}//VIguTexto

	//METODO PARA COMPARAR DOS CADENAS UTILIZANDO EL compareTo
	public static void COMPARETO()
	{	int res;
		BLineas(30);
		MCursor(20); System.out.println("EL PRIMER TEXTO ES:");
		MTexto(texto);
		BLineas(2);
		MCursor(20); System.out.println("EL SEGUNDO TEXTO ES:");
		MTexto(texto2);
		BLineas(3);
		res = texto.compareTo(texto2);
		if(res < 0)
		{	MCursor(20); System.out.println("EL TEXTO 1 ES MENOR AL TEXTO 2"); }
		if(res > 0)
		{	MCursor(20); System.out.println("EL TEXTO 1 ES MAYOR AL TEXTO 2"); }
		if(res == 0)
		{	MCursor(20); System.out.println("EL TEXTO 1 ES IGUAL AL TEXTO 2"); }
		Salida();
		return;
	}//COMPARETO

	//METODO PRINCIPAL
	public static void main(String arg[])
	{	short opc;
		int lon;
		boolean au = false;
		do{	BLineas(30);
			MCursor(30); System.out.println("MENU PRINCIPAL DE OPCIONES");
			BLineas(2);
			MCursor(20); System.out.println("0.- SALIR DEL SISTEMA");
			MCursor(20); System.out.println("1.- INGRESAR EL TEXTO A EVUALUAR");
			MCursor(20); System.out.println("2.- LONGITUD DEL STRING DE CARACTER");
			MCursor(20); System.out.println("3.- POSICION DE LAS LETRAS QUE COMPONEN EL STRING");
			MCursor(20); System.out.println("4.- VERIFICAR SI DOS STRING SON IGUALES");
			MCursor(20); System.out.println("5.- COMPARAR DOS TEXTO CON EL compareTo");
			BLineas(2);
			MCursor(25); System.out.print("ESCOJA SU OPCION: ");
			opc = Short.parseShort(KbInput.read());
			if(opc == 1 || au == false)
			{	texto = IngTex();
				au=true;
				BLineas(2);
				MTexto(texto);
				Salida();
			}
			switch(opc)
			{	case 2: lon = TTexto();
						BLineas(30);
						MTexto(texto);
						BLineas(3);
						MCursor(20); System.out.println("LA LONGITUD DEL TEXTO ES: "+lon+" CARACTERES");
						Salida();
				break;
				case 3: lon = TTexto();
						PLTexto(lon);
				break;
				case 4: short op;
						texto2 = IngTex();
						do{ BLineas(30);
							MCursor(30); System.out.println("MENU SECUNDARIO DE OPCIONES");
							BLineas(2);
							MCursor(10); System.out.println("0.- SALIR DEL SISTEMA");
							MCursor(10); System.out.println("1.- VERIF. LOS STRING TOMANDO EN CUENTA LA MAYUS. Y LA MINUS.");
							MCursor(10); System.out.println("2.- VERIF. LOS STRING SIN TOMAR EN CUENTA LA MAYUS. Y LA MINUS.");
							BLineas(2);
							MCursor(25); System.out.print("ESCOJA SU OPCION: ");
							op = Short.parseShort(KbInput.read());
							if((op==1) || (op==2))
								VIguTexto(op);
						}while(op != 0);
				break;
				case 5: texto2 = IngTex();
						COMPARETO();
				break;
			}
		}while(opc != 0);
	}//main

}//class