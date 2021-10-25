public class PFresco extends producto{

float A;
public PFresco(String	D, int E, float C,float PV, byte FEM, int FEA, byte FCM, int FCA,int	L, String PO)
{
	super(D,E,C,PV,FEM,FEA,FCM,FCA,L,PO);
}

public void MostrarF(int pos, String tex)
{
	MCursor.TCen(10, "============================================================");
	MCursor.TCen(pos, tex);
	super.Mostrar(10, "PRODUCTOS FRESCOS");
	MCursor.TCen(10, "============================================================");
}

public void Exi(int pos, String tex)
{
		A=0;
		A=E;
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(pos, tex);
		//super.Mostrar(10, "");
		MCursor.TCen(pos, ""+A);
	MCursor.TCen(10, "============================================================");
}

}