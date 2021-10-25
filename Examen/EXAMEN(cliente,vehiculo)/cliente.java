public class cliente
{
	String 	N;
	String 	A;
	int 	C;
	String	M;
	byte	G;
	String 	V;

	public cliente(String 	N, String 	A, int 	C, String	M, byte	G, String 	V)
	{
		this.N = N;
		this.A = A;
		this.C = C;
		this.M = M;
		this.G = G;
		this.V = V;
	}

public void Mostrar(int pos, String tex)
	{
		MCursor.TCen(pos, "             NOMBRE: ["+N+"]");
		MCursor.TCen(pos, "           APELLIDO: ["+A+"]");
		MCursor.TCen(pos, "             CEDULA: ["+C+"]");
		MCursor.TCen(pos, "       MODO DE PAGO: ["+M+"]");
		MCursor.TCen(pos, "  GRADO DE LICENCIA: ["+G+"]");

}
}