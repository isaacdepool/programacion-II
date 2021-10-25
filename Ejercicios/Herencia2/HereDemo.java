/* CREAR UN OBJETO CON LOS SIGUIENTES DATOS:
	NOMBRE, APELLIDO, SEXO, EDAD.
   LA CLASE DEBE CONTENER EL METODO
    MOSTRAR -> DEBE MOSTRAR TODOS LOS DATOS
   POR OTRA PARTE, SE DEBE CREAR EL OBJETO TELEFONO CON LOS SIGUIENTES
   DATOS:
    TEL_CEL, TEL_OFI, TEL_HAB MAS LOS DATOS DEL PRIMER OBJETO
   LA CLASE DEBE TENER EL METODO:
    MOSTRAR -> DEBE MOSTRAR TODOS LOS DATOS, INCLUYENDO LOS HEREDADOS
   PARA TERMINAR SE DEBE CREAR LA CLASE PRINCIPAL, DONDE SE TENDRA QUE
   LEER LOS DATOS A UTILIZAR Y REALIZAR UN METODO QUE PERMITA BUSCAR
   EL TELEFONO DE UNA PERSONA EXPECIFICA.
   FINALMENTE SE DEBE MOSTRAR LOS DATOS ORDENADOS ALFABETICAMENTE POR EL
   APELLIDO
*/
public class HereDemo
{	//VARIABLES  Y/O ATRIBUTOS GLOBALES
	static final int Max = 50;
	static int TP=0;
	static Telef Agenda[] = new Telef[Max];

	//METODO PRINCIPAL
	public static void main(String arg[])
	{	byte opc;
		do{	opc = menu();
			MCursor.BLinea(30);
			switch(opc)
			{	case 1:			IngDat();		break;
				case 2:			MosCon();		break;
				case 3:
			}//switch
		}while(opc != 0);
	}//main

	//METODO PARA INGRESAR LOS DATOS
	public static void IngDat()
	{	if(TP < Max)
		{	MCursor.TCen(10, "============================================================");
			MCursor.TCen(26, "AGENDA ELECTRONICA LA CHIMBA");
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(15, "INGRESE LOS DATOS DEL CONTACTO NUMERO " +(TP+1));
			MCursor.TCen(10, "============================================================");
			String Nom = LString(15, "    NOMBRE = ");
			String Ape = LString(15, "  APELLIDO = ");
			char Sex = LSexo(15, "SEXO (F/M) = ");
			byte Eda = LEdad(15, "      EDAD = ");
			Telefono Cel = LTel(15, "TELEFONO CELULAR: ");
			Telefono Ofi = LTel(15, "TELEFONO OFICINA: ");
			Telefono Hab = LTel(15, "TELEFONO HABITACION: ");
			Agenda[TP] = new Telef(Nom, Ape, Sex, Eda, Cel, Ofi, Hab);
			TP++;
			if(TP > 1) Orden();
		}//if
		else MCursor.error(13, "NO HAY CAPACIDAD EN MEMORIA PARA GUARDAR OTRO CONTACTO");
		return;
	}//IngDat

	//METODO PARA MOSTRAR LA LISTA DE CONTACTO
	public static void MosCon()
	{	if(TP > 0)
		{	for(int i=0; i<TP; i++)
			{	MCursor.TCen(10, "============================================================");
				MCursor.TCen(26, "AGENDA ELECTRONICA LA CHIMBA");
				MCursor.TCen(10, "============================================================");
				Agenda[i].Mostrar(15, "CONTACTO NUMERO " + (i+1) );
				MCursor.Salida();
			}//for
		}//if
		else MCursor.error(26, "NO HAY CONTACTOS ALMACENADOS");
		return;
	}//MosCon

	//METODO PARA LEER UN NUMERO TELEFONICO
	public static Telefono LTel(int pos, String texto)
	{	short Cod;
		int Num=0;
		MCursor.TCen(pos, texto);
		MCursor.TCen(10,"------------------------------------------------------------");
		do{	MCursor.UCursor(pos);
			Cod = Leer.NShort("CODIGO = ");
			if(Cod == 0) break;
		}while((Cod < 100) || (Cod > 999));
		do{	if(Cod == 0) break;
			MCursor.UCursor(pos);
			Num = Leer.NInt("NUMERO = ");
		}while((Num < 1000000) || (Num > 9999999));
		return new Telefono(Cod, Num);
	}//LTel

	//METODO PARA LEER Y VALIDAR LA EDAD
	public static byte LEdad(int pos, String texto)
	{	byte E=0;
		do{	MCursor.UCursor(pos);
			E = Leer.NByte(texto);
		}while((E < 10) || (E > 110));
		return E;
	}//LEdad

	//METODO PARA LEER Y VALIDAR EL SEXO
	public static char LSexo(int pos, String texto)
	{	char S;
		do{	MCursor.UCursor(pos);
			S = Character.toUpperCase(Leer.CChar(texto));
		}while((S != 'F') && (S != 'M'));
		return S;
	}//LSexo

	//METODO PARA LEER Y CONVERTIR A MAYUSCULA UN STRING
	public static String LString(int pos, String texto)
	{	MCursor.UCursor(pos);
		return Leer.CString(texto).toUpperCase();
	}//LString

	//METODO PARA ORDENAR LOS DATOS POR EL APELLIDO DE FORMA ALFABETICA
	public static void Orden()
	{	for(int i=0; i<(TP-1); i++)
			for(int j=0; j<(TP-1); j++)
			{	if(Agenda[j].Ape.compareTo(Agenda[j+1].Ape) > 0)
				{	Telef Aux = Agenda[j];
					Agenda[j] = Agenda[j+1];
					Agenda[j+1] = Aux;
				}//if
			}//for
		return;
	}//Orden

	//METODO PARA MOSTRAR EL MENU DE OPCIONES
	public static byte menu()
	{	MCursor.BLinea(30);
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(26, "AGENDA ELECTRONICA LA CHIMBA");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(25, "1.- INGRESAR CONTACTO");
		MCursor.TCen(25, "2.- MOSTRAR LISTA DE CONTACTOS");
		MCursor.TCen(25, "3.- BUSCAR CONTACTO");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(25, "0.- SALIR DEL SISTEMA");
		MCursor.TCen(10, "============================================================");
		MCursor.UCursor(25);
		return Leer.NByte("ESCOJA SU OPCION [   ]\b\b\b");
	}//menu

}//class
