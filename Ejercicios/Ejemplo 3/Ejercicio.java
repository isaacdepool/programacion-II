/* CREAR UNA CLASE "COMPUTADOR" QUE PERMITA ALMACENAR LAS SIGUIENTES
   CARACTERISTICAS:
   => PESO
   => TAMAÑO MEMORIA RAM
   => TAMAÑO DISCO DURO
   => TIPO DE MONITOR (ESTA OPCION DEBE SER PRIVADA)
   => EXISTENCIA (SE DEBERA GENERAR CON EL RANDOM)
   SE DEBERA CREAR SU CONSTRUCTOR Y EL METODO MOSTRAR, EL CUAL PERMITIRA VER LA INFORMACION
   REQUERIDA.
   POR OTRA PARTE SE DEBERA CREAR LA CLASE "PDA" PARA COMPUTADORES
   DE MANO, EL CUAL HEREDARA LA CLASE "COMPUTADOR" Y AÑADIRA:
   => TIPO DE PANTALLA
   SE DEBERA CREAR SU CONSTRUCTOR Y EL METODO MOSTRAR, EL CUAL PERMITIRA VER LA INFORMACION
   REQUERIDA.
   PARA FINALIZAR, SE DEBE HACER LA CLASE PRINCIPAL EN DONDE SE CREARAN DOS OBJETOS (UNO DE
   TIPO "COMPUTADOR" Y OTRO DE TIPO "PDA") UNIDIMENCIONALES DE N ELEMENTOS CADA UNO. ESTA
   CLASE DEBERA CONTENER LOS METODOS QUE PERMITAN INGRESAR LOS DATOS Y MOSTRARLOS DEPENDIENDO
   DE QUE ES LO QUE QUIERE EL USUSARIO, SI UN COMPUTADOR O UN PDA.
*/
public class Ejercicio
{	//DECLARACION DE LOS ATRIBUTOS GLOBALES
	static final int Max = 10;
	static Computador ComP[] = new Computador[Max];
	static PDA        ComM[] = new PDA[Max];
	static int CC=0, CP=0;

	public static void main(String arg[])
	{	byte opc;
		do{	opc = menu();
			switch(opc)
			{	case 1:		IngCop();		break;
				case 2:		MosCop();		break;
				case 3:
				case 4:
			}//switch
		}while(opc != 0);
	}//main

	//METODO PARA INGRESAR UN COMPUTADOR AL INVENTARIO
	public static void IngCop()
	{	if(CC < Max)
		{	MCursor.BLinea(30);
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(23, "INGRESE LOS DATOS DE UN COMPUTADOR");
			MCursor.TCen(10, "============================================================");
			MCursor.UCursor(15);
			float Peso = Leer.NFloat("PESO DEL EQUIPO = ");
			MCursor.UCursor(15);
			short RAM = Leer.NShort("RAM (GB) = ");
			MCursor.UCursor(15);
			short DiDu = Leer.NShort("DISCO DURO (GB) = ");
			MCursor.UCursor(15);
			String TMon = Leer.CString("TIPO DE MONITOR = ");
			ComP[CC] = new Computador(Peso, RAM, DiDu, TMon);
			CC++;
		}//if
		else MCursor.error(18, "NO HAY CAPACIDAD PARA ALMACENAR OTRO EQUIPO");
	}//IngCop

	//METODO PARA MOSTRAR LOS COMPURADORES EXISTENTES
	public static void MosCop()
	{	if(CC > 0)
		{	for(int i=0; i<CC; i++)
			{	MCursor.BLinea(30);
				ComP[i].Mostrar(15, "EQUIPO NUMERO " + (i+1), false);
				MCursor.Salida();
			}//for
		}//IF
		else MCursor.error(18, "NO HAY EQUIPOS ALMACENADOS EN EL INVENTARIO");
	}//MosCop

	//METODO PARA MOSTRAR EL MENU
	public static byte menu()
	{	MCursor.BLinea(30);
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(27, "MENU PRINCIPAL DE OPCIONES");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(28, "1.- INGRESAR COMPUTADOR");
		MCursor.TCen(28, "2.- MOSTRAR COMPUTADOR");
		MCursor.TCen(28, "3.- INGRESAR PDA");
		MCursor.TCen(28, "4.- MOSTRAR PDA");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(28, "0.- SALIR DEL SISTEMA");
		MCursor.TCen(10, "============================================================");
		MCursor.UCursor(28);
		return Leer.NByte("INGRESE SU OPCION = ");
	}//menu
}//class