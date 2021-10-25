/* CREAR UNA CLASE "COMPUTADOR" QUE PERMITA ALMACENAR LAS SIGUIENTES
   CARACTERISTICAS:
   => PESO
   => TAMAÑO MEMORIA RAM
   => TAMAÑO DISCO DURO
   => TIPO DE MONITOR (ESTA OPCION DEBE SER PRIVADA)
   => EXISTENCIA (SE DEBERA GENERAR CON EL RANDOM)
   SE DEBERA CREAR SU CONSTRUCTOR Y EL METODO MOSTRAR, EL CUAL PERMITIRA VER LA INFORMACION
   REQUERIDA.
*/
import java.util.Random;

public class Computador
{	float Peso;
	short RAM;
	short DiDu;
	private String TMon;
	int Exi;

	//Costructor 1
	public Computador(float P, short R, short D, String M)
	{	Peso = P;
		RAM = R;
		DiDu = D;
		TMon = M;
		Exi = Existencia(20);
	}//Computador

	//Costructor 2
	public Computador(float P, short R, short D)
	{	Peso = P;
		RAM = R;
		DiDu = D;
		Exi = Existencia(20);
	}//Computador

	//METODO PARA GENERAR LA EXISTENCIA EN FORMA ALEATORIA
	public int Existencia(int Max)
	{	Random R = new Random();
		return R.nextInt(Max);
	}//Existencia

	//METODO PARA MOSTRAR LOS DATOS
	public void Mostrar(int pos, String tex, boolean aux)
	{	MCursor.TCen(10, "============================================================");
		MCursor.TCen(pos, tex);
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(pos, "   PESO DEL EQUIPO: ["+Peso+" Kg]");
		MCursor.TCen(pos, "        TAMAÑO RAM: ["+RAM+" GB]");
		MCursor.TCen(pos, " TAMAÑO DISCO DURO: ["+DiDu+" GB]");
		MCursor.TCen(pos, "        EXISTENCIA: ["+Exi+"]");
		MCursor.TCen(10, "============================================================");
		if(aux)
		{	MCursor.TCen(pos, "TIPO DE MONITOR: ["+TMon+"]");
			MCursor.TCen(10, "============================================================");
		}//if
		return;
	}//Mostrar

}//class










