public class Examen{

static byte n = 0;
static final int Max = n;
static trabajador tra[];
static String ec[] = {"SOLTERO ", "CASADO  ", "VIUDO   "};
static byte ec1 = 0;
static String EC;
static String NB;
static long CI = 0;
static char SX;
static float SH = 0;
static float sh = 0;
static float HS = 0;
static float hs = 0;
static byte t = 0;
static long ci = 0;
static byte S = 0;
static float S1=0;
static float S2=0;
static float S3=0;
static float S4=0;
static float S5=0;
static float S6=0;
static float S7=0;
//boolean aux=false;

	public static void main(String arg[])
	{ do{
		MCursor.BLinea(30);
		Ing();
		Datos();
		if(t==n){
			ver();
	do{
	MCursor.TCen(10, "==================================================================================================");
	MCursor.TCen(10, "");
	MCursor.TCen(10, "1.- SALIR DEL SISTEMA ");
	MCursor.TCen(10, "0.- REINICIAR SISTEMA ");
	MCursor.UCursor(10);
	S= LByte("INGRESE SU OPCION = ");
	while(S<0 || S>1);
	if(S==0){t=0;}
	if(S==1){S=0;}
			}while(S!=0);}
			}while(t!=n);
	}
public void Datos()
{
	do{
	MCursor.BLinea(30);
	portada(40,"INGRESE DATOS DEL TRABAJADOR " + (t+1));
	MCursor.TCen(10, "==========================================================================================");
	do{
	byte c=0;
	do{
	do{
	MCursor.UCursor(15);
	CI = ci = LLong("INGRESE CEDULA = ");
	MCursor.TCen(10, "==============================================================================================");
	}while(ci<0);
	c++;
	for(int i=0; i<t; i++)
	 		if(ci == tra[i].CI){
			MCursor.TCen(40, "* * * CEDULA YA REGISTRADA * * *"); c=0;
			MCursor.TCen(10, "==============================================================================================");}
	}while(c!=1);
	}while(CI<1000000 || CI>99999999);
		MCursor.UCursor(15);
		NB = Leer.CString("INGRESE NOMBRE = ").toUpperCase();
		MCursor.TCen(10, "==============================================================================================");
	char S;
	do{	MCursor.UCursor(15);
	S = SX = Character.toUpperCase(Leer.CChar("INGRESE SEXO (F)(M) = "));
	MCursor.TCen(10, "==============================================================================================");
	}while((S!='M') && (S!='F'));
	do{
	do{		MCursor.UCursor(15);
			ec1 = LByte("INGRESE ESTADO CIVIL (1)SOLTERO (2)CASADO (3)VIUDO = ");
			MCursor.TCen(10, "==============================================================================================");
	}while(ec1<0);
	}while(ec1<1 || ec1>3);
	EC = ec[ec1-1];
	do{		MCursor.UCursor(15);
				SH = sh = LFloat("INGRESE SALARIO POR HORA = ");
				MCursor.TCen(10, "==============================================================================================");
	}while(sh<0);
	do{
					MCursor.UCursor(15);
					HS = hs = LFloat("INGRESE HORAS TRABAJADAS EN LA SEMANA = ");
					MCursor.TCen(10, "==============================================================================================");
	}while(hs<0 || hs>168);
			if(HS>40){S5 =(HS - 40);
					  S6= (float)1.45*S5;
					  S7= SH*(float)S6;
					  S1=(40*(float)SH)+S7;}
			else{S1=SH*HS;}
			S3=S1*(float)(0.02);
			S4=S1+S3;

	tra[t]=new trabajador(NB,CI,SX,EC,SH,HS,S1,S2,S3,S4,S5,S6,S7);
	t++;
}while(t<n);
}
public static void portada(int P, String PP)
{
				MCursor.TCen(10, "==============================================================================================");
				MCursor.TCen(43, " BIENVENIDOS AL SISTEMA");
				MCursor.TCen(43, "         ISAAC. CA");
			    MCursor.TCen(10, "==============================================================================================");
				MCursor.TCen(P,PP);
}
public static byte LByte(String tex)
		{	byte valor=0;
			boolean aux;
			do{
				try{
					System.out.print(tex);
					valor = Byte.parseByte(KbInput.read());
					aux = true;
				}
				catch(NumberFormatException exc)
				{	MCursor.TCen(10, "==============================================================================================");
					 MCursor.TCen(10,"E	R	R	O	R!!!, 	VALOR NO PERMITIDO");
					 MCursor.TCen(10, "==============================================================================================");
					 MCursor.UCursor(15);
					aux = false;
				}
			}while(aux == false);
			return valor;
	}
public static long LLong(String tex)
		{	long val=0;
			boolean ax;
			do{
				try{
					System.out.print(tex);
					val = Long.parseLong(KbInput.read());
					ax = true;
				}
				catch(NumberFormatException exc)
				{	MCursor.TCen(10, "==============================================================================================");
					 MCursor.TCen(10,"E	R	R	O	R!!!, 	VALOR NO PERMITIDO");
					 MCursor.TCen(10, "==============================================================================================");
					 MCursor.UCursor(15);
					ax = false;
				}
			}while(ax == false);
			return val;
	}
public static float LFloat(String tex)
		{	float va=0;
			boolean a;
			do{
				try{
					System.out.print(tex);
					va = Float.parseFloat(KbInput.read());
					a = true;
				}
				catch(NumberFormatException exc)
				{	MCursor.TCen(10, "==============================================================================================");
					 MCursor.TCen(10,"E	R	R	O	R!!!, 	VALOR NO PERMITIDO");
					 MCursor.TCen(10, "==============================================================================================");
					 MCursor.UCursor(15);
					a = false;
				}
			}while(a == false);
			return va;
	}
public static void Ing()
{
		do{
	portada(10,"");
	MCursor.UCursor(15);
	n = LByte("INGRESE CANTIDAD DE EMPLEADOS = ");
	MCursor.TCen(10, "==============================================================================================");
	}while(n<0);
	 tra = new trabajador [n];
}
public static void ver()
{
	MCursor.BLinea(30);
	portada(10,"");
	 	MCursor.TCen(10,"SH = SALARIO POR HORA");
	  	MCursor.TCen(10,"HT = HORAS DE TRABAJO A LA SEMANA");
	  	MCursor.TCen(10,"SH+ = SALARIO POR HORA POR MAS DE 40 HORAS SEMANALES");
	  	MCursor.TCen(10,"A+ = ASIGNACION ADICIONAL");
  		MCursor.TCen(10,"SB = SALARIO BASICO");
  		MCursor.TCen(10,"");
	MCursor.TCen(10,"\tNombre \tCI\t\t\tSX\tEC\t\tSH\tHT\tSH+\tA+\tSB");
	for(int i=0; i<t; i++)
			 {
			 tra[i].sal(10,""+(i+1));
			 }//for
		return;
}



}