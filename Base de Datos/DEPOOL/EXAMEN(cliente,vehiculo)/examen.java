public class examen
{


	public static void main(String arg[]){
			do{ opc = menu();
			switch(opc)
			{
				case 1 :carac();	break;
				case 2 :Most();	break;
			}
			}while(opc != 0);

	}//main

	public static Byte menu()
	{
			MCursor.BLinea(30);
			portada(10,"MENU DE OPCIONES");
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(20, "1.- INGRESAR DATOS DEL CLIENTE");
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(20, "2.- LISTADO DE CLIENTES");
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(20, "0.- SALIR DEL SISTEMA");
			MCursor.TCen(10, "============================================================");
			MCursor.UCursor(20);
			return Leer.NByte("ESCOJA SU OPCION = ");
}//menu

	public static void Ingreso(){

		 MCursor.BLinea(30);
		 portada(10,"REGISTRO");
		 MCursor.TCen(10, "============================================================");
		 MCursor.UCursor(20);
		 N = Leer.CString("NOMBRE = ").toUpperCase();

		  MCursor.BLinea(30);
		  portada(10,"REGISTRO");
		  MCursor.TCen(10, "============================================================");
		  MCursor.UCursor(20);
		  A = Leer.CString("APELLIDO = ").toUpperCase();

		  do{
			  do{auxi=true;
		   MCursor.BLinea(30);
		   portada(10,"REGISTRO");
		   MCursor.TCen(10, "============================================================");
		   MCursor.UCursor(20);
		   C = Leer.NInt("CEDULA = ");
		   if(t>0){
		   for(int i=0;i<t;i++)
		   if(C==vehi[i].C){auxi=false;}
		   if(auxi==false){
		   MCursor.TCen(10, "============================================================");
		   MCursor.TCen(10, "CEDULA YA REGISTRADA");
		   MCursor.TCen(10, "============================================================");
		   MCursor.Salida();}}
		   }while(auxi==false);
		  }while(C<=1000000 || G>=99999999);

		  do{
		   MCursor.BLinea(30);
		   portada(10,"REGISTRO");
		   MCursor.TCen(10, "============================================================");
		   MCursor.UCursor(20);
		   G = Leer.NByte("GRADO DE LICENCIA = ");
		  }while(G<=0 || G>=5);
}

public static void carac(){
	if(t<MAX){
	Ingreso();

		  MCursor.BLinea(30);
		  portada(10,"REGISTRO");
		  MCursor.TCen(10, "============================================================");
		  MCursor.UCursor(20);
		  MR = Leer.CString("MARCA DEL VEHICULO = ").toUpperCase();

		  MCursor.BLinea(30);
		  portada(10,"REGISTRO");
		  MCursor.TCen(10, "============================================================");
		  MCursor.UCursor(20);
		  MD = Leer.CString("MODELO DEL VEHICULO = ").toUpperCase();

		  do{
		   MCursor.BLinea(30);
		   portada(10,"REGISTRO");
		   MCursor.TCen(10, "============================================================");
		   MCursor.UCursor(20);
		   CP = Leer.NInt("CAPACIDAD DEL VEHICULO = ");
		  }while(CP!=5 && CP!=8 && CP!=16);

		  MCursor.BLinea(30);
		  portada(10,"REGISTRO");
		  MCursor.TCen(10, "============================================================");
		  MCursor.UCursor(20);
		  SR = Leer.CString("SERIAL DEL MOTOR = ").toUpperCase();
	vehi[t]= new vehiculo(N,A,C,M,G,V,MR,MD,CP,SR);
	cal();
	}
	if(t>MAX) error(30, "NO SE PUEDEN REGISTRAR MAS PRODUCTOS");

}

public static void cal()
{
			if(vehi[t].CP==5){mon[t]=(float)463.25;}
			else if(vehi[t].CP==8){mon[t]=(float)584.24;}
			else if(vehi[t].CP==16){mon[t]=(float)743.38;}
	do{

			   MCursor.BLinea(30);
			   portada(10,"INGRESO");
			   MCursor.TCen(10, "============================================================");
			   MCursor.UCursor(20);
			   a = Leer.NInt("DIAS DE ALQUILER = ");
	}while(a<0);
float p=0;
mon2[t]=mon[t];
	if(a<=13){p=mon2[t]*(float)0.10; mon2[t]-=p;}
	if(a>=14){p=mon2[t]*(float)0.15; mon2[t]-=p;}

do{

			   MCursor.BLinea(30);
			   portada(10,"INGRESO");
			   MCursor.TCen(10, "============================================================");
			   MCursor.UCursor(20);
			   b = Leer.NInt("(1)PAGO EN EFECTIVO (2)PAGO POR TARJETA = ");
}while(b<1 || b>2);
M = pg[b-1];
float p2=0;
if(b==1){p2=mon2[t]*(float)0.05; mon2[t]-=p2;}
float p3=0;
p3=mon2[t]*(float)0.40;
	do{
	 			   MCursor.BLinea(30);
				   portada(10,"MONTO A PAGAR");
				   MCursor.TCen(10, "============================================================");
				   MCursor.UCursor(20);
				   ini [t] = Leer.NFloat("INICIAL A PAGAR = ");
				   MCursor.TCen(10, "============================================================");
				   if(ini[t]<p3){MCursor.TCen(10, "EL MONTO DEBE SER MAYOR A "+  p3);}
				   MCursor.Salida();
	}while(ini[t]<p3);
vehi[t]= new vehiculo(N,A,C,M,G,V,MR,MD,CP,SR);
	t++;
}

public static void Most(){

if(t>0){
	auxi=true;
		  do{
		   MCursor.BLinea(30);
		   portada(10,"BUSCAR");
		   MCursor.TCen(10, "============================================================");
		   MCursor.UCursor(20);
		   C = Leer.NInt("INGRESE CEDULA = ");
		  }while(C<=1000000 || G>=99999999);
	for(int i=0;i<t;i++)
	if(C==vehi[i].C){auxi=false;
		MCursor.BLinea(30);
		portada(10,"DATOS DEL CLIENTE");
	vehi[i].MostrarV(10, "");
	MCursor.Salida();
	MCursor.BLinea(30);
	portada(10,"MONTO DE ALQUILER");
	MCursor.TCen(10, "============================================================");
		MCursor.TCen(10, " MONTO BASE A PAGAR: ["+mon[i]+"]");
		MCursor.TCen(10, "MONTO TOTAL A PAGAR: ["+mon2[i]+"]");
		MCursor.TCen(10, "       PAGO INICIAL: ["+ini[i]+"]");
		MCursor.TCen(10, "      DEUDA A PAGAR: ["+(mon2[i]-ini[i])+"]");
		MCursor.TCen(10, "============================================================");
	MCursor.Salida();}
	if(auxi==true){
		MCursor.BLinea(30);
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(25, "*** NO SE ENCONTRO CEDULA EN EL SISTEMA ***");
		MCursor.TCen(10, "============================================================");
	MCursor.Salida();}}
	else error(30, "SIN DATOS EN EL SISTEMA");
}

public static void portada(int F, String T)
{
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(20, " BIENVENIDO AL SISTEMA");
		    MCursor.TCen(10, "============================================================");
			MCursor.TCen(F,T);
}
public static void error(int F, String T)
{
			MCursor.BLinea(30);
			MCursor.TCen(10, "============================================================");
			MCursor.TCen(18, "	E	R	R	O	R");
			MCursor.TCen(F,T);
		    MCursor.TCen(10, "============================================================");
		    MCursor.Salida();
}
static final int MAX = 10;
static vehiculo vehi[] = 	new vehiculo [MAX];
static float mon[] =  new float [MAX];
static float mon2[] =  new float [MAX];
static float ini[] =  new float [MAX];
static boolean auxi=false;

//INT
static int t=0;
static int C=0;
static int CP=0;
static int opc=0;
static int a=0;
static int b=0;

//STRING

static String N;
static String A;
static String V;
static String MR;
static String MD;
static String SR;
static String pg[] =  {"EFECTIVO ","TARJETA "};
//BYTE

static byte G;
static String M;
}