/* Objeto Auxiliar: para guardar un numero telefonico
*/
public class Telefono
{	short Cod;
	int Num;

	public Telefono(short C, int N)
	{	Cod = C;
		Num = N;
	}//Telefono

	public void Mostrar(int pos, String texto)
	{	MCursor.TCen(pos, texto + "[0"+Cod+"]["+Num+"]");
		return;
	}//Mostrar
}//class