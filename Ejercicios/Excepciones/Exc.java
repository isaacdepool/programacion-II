/* SUPONGA UN ARREGLO DE 10 ELEMENTOS CUYOS VALORES PUEDAN SER INGRESADOS
   POR TECLADO O ESTAR PREDETERMINADO CON LOS SIGUIENTES VALORES:
   65   98   32   41   95   74   32   95   10   18
   POR OTRA PARTE, SE TIENE UN SEGUNDO ARREGLO DE 6 ELEMENTOS CUYOS
   VALORES PUEDAN SER INGRESADOS POR TECLADO O ESTAR PREDETERMINADO
   CON LOS SIGUIENTES VALORES:
   5   0   4   6   0   4
   REALIZAR UN PROGRAMA QUE HAGA LA DIVISION DEL PRIMER ARREGLO
   ENTRE EL SEGUNDO. DEBE TENER EN CUENTA LAS POSIBLES EXCEPCIONES QUE
   SE PUEDAN GENERAR.
*/

public class Exc
{	//declaraciones de los arreglos globales
	static int AT1[] = {65,   98,   32,   41,   95,   74,   32,   95,   10,   18};
	static int AT2[] = {5,    0,    4,    6,    0,    4};

	public static void main(String arg[])
	{
	MCursor.TCen(10,"===============================================");
	MCursor.TCen(28,"DIVISION ENTRE ARREGLOS");
	MCursor.TCen(10,"===============================================");
	for(int i=0; i<10; i++)
	{try
	{
		MCursor.TCen(15, AT1[i]+" / "+AT2[i]+" = "+(AT1[i]/AT2[i]));
	}//try
	catch(ArithmeticException exc)
	{ MCursor.TCen(15,AT1[i]+" / "+AT2[i]+" = DIVISION ENTRE CERO");
	}//catch
	catch(ArrayIndexOutOfBoundsException exc)
		{ MCursor.TCen(15,"ERROR. ARREGLOS DE TAMAÑOS DIFERENTES");
		break;
	}//catch
	}//for
	MCursor.TCen(10,"================================================");
	MCursor.Salida();
}
}//class