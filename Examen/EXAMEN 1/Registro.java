public class Registro
{
int Trab;
String Nom;
String Ape;
int Ced;
String Sex;
String Civ;
float Sal;
int Hor;
static float Total=0;
static float tot=0;




public Registro(int T, String N, String A, int C, String G,String EC, float S, int H)
{	Trab = T;
	Nom =  N;
	Ape =  A;
	Ced =  C;
	Sex =  G;
	Civ = EC;
	Sal =  S;
	Hor =  H;

}//constructor

public float sal()
{	float SalBas=0;
	int Hor2=0;
	if(Hor > 40){
	Hor2 = 40;
	SalBas= Sal*Hor2;}
	else
	SalBas= Sal*Hor;
	 return SalBas;
}//Sal

public float Paga()
{	int x=0;
	float SalSem=0;
	if(Hor > 40){
	for(int i=40;i<Hor;i++){
	x=x+1;
	 SalSem=((Sal*(float)1.45)*x);
	}}
return SalSem;
}//Paga

public float adi()
{	float Adi=0;
	  Adi=sal()*(float)0.12;
	return Adi;
}//Adi

public float dedu()
{	float Dedu=0;
	 Dedu=sal()*(float)0.10;
	 return Dedu;
}//dedu
public float total()
{
	  Total = ((sal()+Paga()+adi())-dedu());
	return Total;
}
public float total2()
{
	tot+=total();
	return tot;
}
public void mostrar()
{	System.out.println("(N = NOMBRE), (A = APELLIDO), (C = CEDULA), (S = SEXO), (E.C = ESTADO CIVIL)");
	System.out.println("(S.H = SALARIO HORA), (H.T = HORAS TRABAJADAS), (T.P = TOTAL A PAGAR)");
	System.out.println("===============================================================================================");
	System.out.println("===============================================================================================");
	System.out.println("N		A		C		S		E.C	  S.H    H.T  T.P");
	System.out.println("============================================================================================");
	System.out.println("============================================================================================");
	System.out.println("["+Nom+"]   ["+Ape+"]	["+Ced+"]   ["+Sex+"]    ["+Civ+"]   ["+Sal+"] 	 ["+Hor+"] ["+total()+"]");
	/*System.out.println(""+Nom+"");
	System.out.println("===========================================");
	System.out.println(""+Ape+"");
	System.out.println("===========================================");
	System.out.println(""+Ced+"");
	System.out.println("===========================================");
	System.out.println(""+Sex+"");
	System.out.println("===========================================");
	System.out.println(""+Civ+"");
	System.out.println("===========================================");
	System.out.println(""+Sal+"");
	System.out.println("===========================================");
	System.out.println(""+Hor+"");
	System.out.println("===========================================");
	System.out.println("TOTAL SALARIO NETO SEMANAL : ");
	System.out.println(total());
	System.out.println("===========================================");*/
}//mostrar

public void mos()
{	MCursor.TCen(15, " TOTAL NETO A PAGAR ESTA SEMANA :");
	MCursor.TCen(10, "============================================================");
	 System.out.println(total2());
}//mos

}//Registro