public class PDA extends Computador
{	String TPan;

	//Constructor
	public PDA(float P, short R, short D, String T)
	{	super(P,R,D);
		TPan = T;
	}//PDA

	//Metodo para mostrar los datos
	public void Mostrar(int pos, String tex)
	{	super.Mostrar(pos, tex, false);
		MCursor.TCen(pos, "TIPO DE PANTALLA: ["+TPan+"]");
		MCursor.TCen(10, "============================================================");
		return;
	}//Mostrar
}//class