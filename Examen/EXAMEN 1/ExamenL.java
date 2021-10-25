public class ExamenL
{	static int max = 1000;
	static Registro Tabla[] = new Registro [max];
	static Registro Total;
	static int T=0;
	public static void main (String arg[])
	{
		int opc;
				do{ opc = menu();
					MCursor.BLinea(30);
					switch(opc)
					{	case 1:	regis(); break;
						case 2: most();	 break;
					}//switch
		}while(opc != 0);


	}//main

	//RegistroTrabajador
	public static void regis(){
	 MCursor.BLinea(30);
	 T = LInt("INGRESE EL NUMERO TOTAL DE TRABAJADORES : ");
	 MCursor.BLinea(30);
	 String N;
	 String A;
	 int C = 0;
	 int X = 0;
	 int Civ;
	 float S = 0;
	 int H = 0;
	 String G;
	 String EC;
	for(int i=0;i<T;i++)
	{	MCursor.BLinea(30);
		MCursor.TCen(20,"INGRESE DATOS DEL TRABAJADOR #"+(i+1));
		 N = Leer.CString(" NOMBRE DEL TRABAJADOR : ").toUpperCase();
		 MCursor.BLinea(30);
		 A = Leer.CString(" APELLIDO DEL TRABAJADOR  : ").toUpperCase();
		 MCursor.BLinea(30);
		 do{C = LInt(" CEDULA DEL TRABAJADOR  : ");}while(C<0);
		 MCursor.BLinea(30);
		 do{MCursor.TCen(28," SEXO DEL TRABAJADOR : ");
		 MCursor.TCen(34,"1-FEMENINO");
		 MCursor.TCen(34,"2-MASCULINO");
		 X =  LInt("SELECCIONE SU OPCION : ");}while( X != 1 && X != 2);
		 MCursor.BLinea(30);
		 do{MCursor.TCen(28," ESTADO CIVIL : ");
		 MCursor.TCen(34,"1-SOLTERO");
		 MCursor.TCen(34,"2-CASADO");
		 MCursor.TCen(34,"3-VIUDO");
		 Civ =  LInt("SELECCIONE SU OPCION : ");}while( Civ != 1 && Civ != 2 && Civ != 3);
		 MCursor.BLinea(30);
		 do{S =  LInt(" SALARIO POR HORA : ");}while(S<0);
		 MCursor.BLinea(30);
		 do{H =  LInt(" HORAS TRABAJADAS EN LA SEMANA : ");}while(H<0);
		 MCursor.BLinea(30);

		 if(X==1)
		 G = "FEMENINO";
		 else
		 G = "MASCULINO";

		 if(Civ == 1)
		 EC = "SOLTERO";
		 else{
		 if(Civ == 2)
		 EC = "CASADO";
		 else
		 EC="VIUDO";}



		Tabla[i] = new Registro (T,N,A,C,G,EC,S,H);
		MCursor.BLinea(30);


	}//fori
}//regis

public static void most()
{	int x=0;
	if (T>0)
	{
	do{
	Tabla[x].mostrar();
	x++;
	MCursor.Salida();
	MCursor.BLinea(30);
	}while(x != T);
	}
	else{
	System.out.println("E R R O R, NO HA INGRESADO NINGUN DATO");}
	MCursor.Salida();



}//mos
public static int LInt(String tex)
		{	int valor=0;
			boolean aux;
			do{
				try{
					System.out.print(tex);
					valor = Integer.parseInt(KbInput.read());
					aux = true;
				}
				catch(NumberFormatException exc)
				{	MCursor.TCen(10, "============================================================");
					 MCursor.TCen(20,"	E	R	R	O	R ");
					 MCursor.TCen(30,"	!	!	!INGRESE UN VALOR VALIDO	!	!	!");
					 MCursor.TCen(10, "============================================================");
					 MCursor.UCursor(15);
					aux = false;
				}
			}while(aux == false);
			return valor;
	}
public static int menu()
{	MCursor.BLinea(30);
	MCursor.TCen(27, "MENU PRINCIPAL DE OPCIONES");
	MCursor.TCen(10, "============================================================");
	MCursor.TCen(20," 1-REGISTRAR TRABAJADOR: ");
	MCursor.TCen(20," 2-TABLA DE SALARIOS ");
	MCursor.TCen(10, "============================================================");
	MCursor.TCen(25,"0.- SALIR DEL SISTEMA");
	MCursor.TCen(10, "============================================================");
	return  LInt("SELECCIONE SU OPCION = ");

}//menu
}//Examen