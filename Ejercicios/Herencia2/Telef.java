/* SE DEBE CREAR EL OBJETO TELEFONO CON LOS SIGUIENTES DATOS:
    TEL_CEL, TEL_OFI, TEL_HAB MAS LOS DATOS DEL PRIMER OBJETO
   LA CLASE DEBE TENER EL METODO:
    MOSTRAR -> DEBE MOSTRAR TODOS LOS DATOS, INCLUYENDO LOS HEREDADOS
*/
//Objeto hijo
public class Telef extends Persona
{	Telefono Tel_Cel;
	Telefono Tel_Ofi;
	Telefono Tel_Hab;

	public Telef(String N, String A, char S, byte E, Telefono Cel, Telefono Ofi, Telefono Hab)
	{	super(N,A,S,E);
		Tel_Cel = Cel;
		Tel_Ofi = Ofi;
		Tel_Hab = Hab;
	}//Telef

	public void Mostrar(int pos, String texto)
	{	super.Mostrar(pos, texto);
		Tel_Cel.Mostrar(pos, "   TELEFONO CELULAR: ");
		Tel_Ofi.Mostrar(pos, "   TELEFONO OFICINA: ");
		Tel_Hab.Mostrar(pos, "TELEFONO HABITACION: ");
		MCursor.TCen(pos-2, "------------------------------------------");
		return;
	}//Mostrar
}//class