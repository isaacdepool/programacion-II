/* CREAR UN OBJETO CON LOS SIGUIENTES DATOS:
	NOMBRE, APELLIDO, SEXO, EDAD.
   LA CLASE DEBE CONTENER EL METODO
    MOSTRAR -> DEBE MOSTRAR TODOS LOS DATOS
*/
//OBJETO PADRE
public class Persona
{	String Nom;
	String Ape;
	char Sex;
	byte Eda;

	public Persona(String N, String A, char S, byte E)
	{	Nom = N;
		Ape = A;
		Sex = S;
		Eda = E;
	}//Persona

	public void Mostrar(int pos, String texto)
	{	MCursor.TCen(pos-2, "------------------------------------------");
		MCursor.TCen(pos, texto);
		MCursor.TCen(pos-2, "------------------------------------------");
		MCursor.TCen(pos, "["+Ape+"]["+Nom+"]");
		MCursor.TCen(pos, "Sexo: ["+Sex+"] - Edad: ["+Eda+"]");
		MCursor.TCen(pos-2, "------------------------------------------");
		return;
	}//Mostrar
}//class
