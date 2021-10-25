public class vehiculo extends cliente
{
	String	MR;
	String	MD;
	int		CP;
	String	SR;
	public vehiculo(String 	N, String 	A, int 	C, String M, byte	G, String V, String	MR, String	MD, int	CP, String	SR)
	{
	super(N,A,C,M,G,V);
	this.MR = MR;
	this.MD = MD;
	this.CP = CP;
	this.SR = SR;
	}

	public void MostrarV(int pos, String tex)
	{
		MCursor.TCen(10, "============================================================");
		super.Mostrar(10, "CARACTERISTICAS DEL CLIENTE");
		MCursor.TCen(10, "============================================================");
	    MCursor.Salida();
	    MCursor.BLinea(30);
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(pos, "CARACTERISTICAS DEL VEHICULO");
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(pos, "            MARCA: ["+MR+" ]");
		MCursor.TCen(pos, "           MODELO: ["+MD+" ]");
		MCursor.TCen(pos, "        CAPACIDAD: ["+CP+" ]");
		MCursor.TCen(pos, " SERIAL DEL MOTOR: ["+SR+" ]");
		MCursor.TCen(10, "============================================================");

}
}