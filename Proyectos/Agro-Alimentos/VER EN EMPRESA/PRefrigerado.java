public class PRefrigerado extends producto{
	String	COSA;
	float	TP;

public PRefrigerado (String	D, int E, float C,float PV, byte FEM, int FEA, byte FCM, int FCA,int	L, String PO, String COSA, float TP)
{
	super(D,E,C,PV,FEM,FEA,FCM,FCA,L,PO);
	this.COSA = COSA;
	this.TP = TP;
}
public void MostrarR(int pos, String tex)
{
	MCursor.TCen(10, "============================================================");
	MCursor.TCen(pos, tex);
	super.Mostrar(10, "PRODUCTOS REFIGERADOS");
	MCursor.TCen(pos, "              COSA: ["+COSA+" ]");
	MCursor.TCen(pos, "   TEMPERATURA.M.R: ["+TP+" ]");
	MCursor.TCen(10, "============================================================");
}
}