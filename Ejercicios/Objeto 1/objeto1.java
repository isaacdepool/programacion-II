public class objeto1
{
	static final int Max = 20;

	static Vestimenta ArVe[] = new Vestimenta[Max];
	static Electro    ArEl[] = new Electro   [Max];

	static int V=0, E=0;

	//METODO PRINCILPAL
	public static void main(String arg[])
	{	byte opc;
		do{ opc = menu();
		switch(opc)
		{	case 1: IngVes(); break;
			case 2:
			case 3:
			case 4:
			case 5:
		}
		}while(opc != 0);
	}//main

	//METODO PARA INGRESAR VESTIMENTA
	public static void IngVes()
	{
		if(V<Max)
		{
			MCursor.TCen(10, "========================================================");
			MCursor.TCen(10, "INGRESE LOS DATOS DEL ARTICULO NUMERO " +(V+1));
			MCursor.TCen(10, "========================================================");
			MCursor.UCursor(10);
			String D = Leer.CString("DESCRIPCION =").toUpperCase();
			MCursor.UCursor(10);
			float C = Leer.NFloat("COSTO DEL PRODUCTO");
			MCursor.UCursor(10);
			int B = Leer.NInt("CODIGO DE BARRA =");
			MCursor.UCursor(10);
			short E = Leer.NShort("EXISTENCIA = ");
			MCursor.UCursor(10);
			char T = Character.toUpperCase(Leer.CChar("TALLA ="));
			MCursor.UCursor(10);
			String M = Leer.CString("MARCA =").toUpperCase();
			ArVe[V] = new Vestimenta(D,C,B,E,T,M);
			V++;
		}
		else error(17,"NO HAY CAPACIDAD EN EL ALMACEN PARA OTRO ARTICULO");
		return;
}

	//METODO PARA MOSTRAR UN MESAJE DE ERROR

	public static void error(int P, String T)
	{
		MCursor.BLinea(3);
		MCursor.TCen(23,"\007 E		R		R		O		R");
		MCursor.BLinea(3);
		MCursor.Salida();
	}
	//METODO PARA MOSTRAR EL MENU DE OPCIONES

	public static byte menu()
	{
		MCursor.BLinea(30);
		MCursor.TCen(10, "========================================================");
		MCursor.TCen(25, "ALMACEN \"A VER QUE ENCUENTRAS\"");
		MCursor.TCen(27, "MENU DE OPCIONES");
		MCursor.TCen(10, "========================================================");
		MCursor.TCen(25,"1.- INGRESAR VESTIEMNTA");
		MCursor.TCen(25,"2.- MOSTRAR VESTIMENTA");
		MCursor.TCen(25,"3.- INGRESAR ELECTRODOMESTICOS");
		MCursor.TCen(25,"4.- MOSTRAR ELECTRODOMESTICOS");
		MCursor.TCen(25,"5.- GANANCIA DEL ALMACEN");
		MCursor.TCen(10, "========================================================");
		MCursor.TCen(25,"0.- SALIR DEL SISTEMA");
		MCursor.TCen(10, "========================================================");
		MCursor.UCursor(25);
		return Leer.NByte("ESCOJA SU OPCION = ");
	}//menu
}//class