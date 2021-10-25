public class PCongelado extends producto
{
	float TR;

public PCongelado(String	D, int E, float C,float PV, byte FEM, int FEA, byte FCM, int FCA,int	L, String PO, float TR)
{
	super(D,E,C,PV,FEM,FEA,FCM,FCA,L,PO);
	this.TR = TR;
}
public void MostrarC(int pos, String tex)
{
	MCursor.TCen(10, "============================================================");
	MCursor.TCen(pos, tex);
	super.Mostrar(10, "PRODUCTOS CONGELADOS");
	MCursor.TCen(pos, "   TEMPERATURA.M.R: ["+TR+" ]");
	MCursor.TCen(10, "============================================================");
}


}
