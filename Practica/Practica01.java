public class Practica01
{	static final int Max = 20;

	static Vestimenta ArVe[] = new Vestimenta[Max];
	static Electro    ArEl[] = new Electro[Max];

	static int V=0, E=0;

	//METODO PRINCIPAL
	public static void main(String arg[])
	{	byte opc;
		do{ opc = menu();
			MCursor.BLinea(30);
			switch(opc)
			{	case 1:	IngVes();	break;
				case 2: MosVes();	break;
				case 3:
				case 4:
				case 5:
			}//switch
		}while(opc != 0);
	}//main

	//METODO PARA INGRESAR LOS ARTICULOS DE VESTIMENTA
	public static void IngVes()
	{	if(V < Max)
		{	MCursor.TCen(10, "============================================================");
			MCursor.TCen(20, "INGRESE LOS DATOS DEL ARTICULO NUMERO "+(V+1));
			MCursor.TCen(10, "============================================================");
			MCursor.UCursor(10);
			String D = Leer.CString("DESCRIPCION = ").toUpperCase();
			float C;
			do{ MCursor.UCursor(10);
				C = Leer.NFloat("COSTO DEL PRODUCTO = ");
			}while(C <= 0);
			int B;
			do{	MCursor.UCursor(10);
				B = Leer.NInt("CODIGO DE BARRA = ");
			}while((B<10000000) || (B>99999999));

			short E;
			do{	MCursor.UCursor(10);
				E = Leer.NShort("EXISTENCIA = ");
			}while(E<=0);
			char T;
			do{	MCursor.UCursor(10);
				T = Character.toUpperCase(Leer.CChar("TALLA = "));
			}while((T!='S') && (T!='M') && (T!='L') && (T!='X'));
			MCursor.UCursor(10);
			String M = Leer.CString("MARCA = ").toUpperCase();
			ArVe[V] = new Vestimenta(D,C,B,E,T,M);
			V++;
		}//if
		else	error(17, "NO HAY CAPACIDAD EN ALMACEN PARA OTRO ARTICULO");
		return;
	}//IngVes

	//METODO PARA MOSTRAR EL LISTADO DE ARTICULOS DE VESTIMENTA
	public static void MosVes()
	{	if(V>0)
		{	 for(int i=0; i<V; i++)
			 {	MCursor.BLinea(30);
			 	ArVe[i].Mostrar(31, "ARTICULO NUMERO "+(i+1));
			 }//for
		}//if
		else	error(23, "NO HAY ARTICULOS EN EL INVENTARIO");
		return;
	}//MosVes

	//METODO PARA MOSTRAR UN MENSAJE DE ERROR
	public static void error(int P, String T)
	{	MCursor.BLinea(3);
		MCursor.TCen(23,"\007E       R       R       O       R\007");
		MCursor.TCen(P,T);
		MCursor.Salida();
	}//error


	//METODO PARA MOSTRAR EL MENU DE OPCIONES
	public static byte menu()
	{	MCursor.BLinea(30);
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(25, "ALMACEN \"A VER QUE ENCUENTRAS\"");
		MCursor.TCen(27, "MENU PRINCIPAL DE OPCIONES");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(25,"1.- INGRESAR VESTIMENTA");
		MCursor.TCen(25,"2.- MOSTRAR VESTIMENTA");
		MCursor.TCen(25,"3.- INGRESAR ELECTRODOMESTICO");
		MCursor.TCen(25,"4.- MOSTRAR ELECTRODOMESTICO");
		MCursor.TCen(25,"5.- GANANCIA DEL ALMACEN");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(25,"0.- SALIR DEL SISTEMA");
		MCursor.TCen(10, "============================================================");
		MCursor.UCursor(25);
		return Leer.NByte("ESCOJA SU OPCION = ");
	}//menu

}//class








