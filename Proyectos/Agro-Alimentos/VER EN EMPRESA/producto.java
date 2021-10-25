public class producto{

String	D;
int		E;
float	PV;
float	C;
byte 	FEM;
int 	FEA;
byte 	FCM;
int		FCA;
int		L;
String	PO;
float	GB1;
float	GB2;
float	GB3;
float	GB4;
float	GN;

public producto (String	D, int E, float C,float PV, byte FEM, int FEA, byte FCM, int FCA,int	L, String PO)
{
	this.D = D;
	this.E = E;
	this.C = C;
	this.PV = PV;
	this.FCM = FCM;
	this.FCA = FCA;
	this.FEM = FEM;
	this.FEA = FEA;
	this.PO = PO;
	this.L = L;
}

public producto (float PV,int E, float	GB1, float	GB2, float	GB3, float	GB4, float	GN)
{
	this.PV = PV;
	this.GB1 = GB1;
	this.GB2 = GB2;
	this.GB3 = GB3;
	this.GB4 = GB4;
	this.GN = GN;
}

public void Mostrar(int pos, String tex)
	{
		PV=C*(float)0.30;
		PV=C+PV;
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(pos, "       DESCRIPCION: ["+D+"]");
		MCursor.TCen(pos, "        EXISTENCIA: ["+E+"] UNIDADES");
		MCursor.TCen(0, "	               COSTO: ["+C+"]");
		MCursor.TCen(pos, "   PRECIO DE VENTA: ["+PV+"]");
		MCursor.TCen(pos, " FECHA DE ENVASADO: ["+FEM+"/"+FEA+"]");
		MCursor.TCen(pos, "FECHA DE CADUCIDAD: ["+FCM+"/"+FCA+"]");
		MCursor.TCen(pos, "    NUMERO DE LOTE: ["+L+"]");
		MCursor.TCen(pos, "    PAIS DE ORIGEN: ["+PO+"]");

}
public void Mostr(int pos, String tex, boolean aux)
{


	MCursor.TCen(10, "============================================================");
	MCursor.TCen(pos, "        IMPUESTOS: ["+GB1+"]");
	MCursor.TCen(pos, "GASTOS OPERATIVOS: ["+GB2+"]");
	MCursor.TCen(0, "	  PAGO DE NOMINA: ["+GB3+"]");
	MCursor.TCen(pos, "   GANANCIA BRUTA: ["+GB4+"]");
	MCursor.TCen(pos, "    GANANCIA NETA: ["+GN+"]");


}











}