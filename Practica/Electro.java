/* Objeto Electrodomestico.
   Atributos: Articulo
              Peso del equipo.
			  Linea (blanca o marrón)
			  Costo de Flete
*/
public class Electro
{	Articulo Arti;
	float    Peso;
	String   Line;
	float    CosF;

	public Electro(String Desc, float C, int B, short E, float P, String L, float F)
	{	Arti = new Articulo(Desc, C, B, E);
	    Peso = P;
	    Line = L;
	    CosF = F;
	    Arti.PreB = CalPB();
		Arti.PreV = CalPV();
		Arti.PreF = CalPF();
	}//Electro

	//METODO PARA CALCULAR EL PRECIO BASE DEL PRODUCTO
	public float CalPB()
	{	return Arti.CosP + Arti.CosP*(float)0.35;
	}//CalPB

	//METODO PARA CALCULAR EL PRECIO DE VENTA DEL ARTICULO
	public float CalPV()
	{	float D = 0;
		if(Arti.PreB > 350)	D = Arti.PreB*(float)0.25;
		else				D = Arti.PreB*(float)0.15;
		return Arti.PreB - D;
	}//CalPV

	//METODO PARA CALCULAR EL PRECIO FINAL DEL ARTICULO
	public float CalPF()
	{	float IVA = Arti.PreV * (float)0.12;
		return Arti.PreV + IVA;
	}//CalPF

	//METODO PARA MOSTRAR LOS DATOS
	public void Mostrar(int pos, String Texto)
	{	MCursor.TCen(10, "============================================================");
		MCursor.TCen(pos, Texto);
		MCursor.TCen(10, "============================================================");
		MCursor.TCen(15, "    DESCRICCION ==> [ "+Arti.Desc+" ]");
		MCursor.TCen(15, "          LINEA ==> [ "+Line+" ]");
		MCursor.TCen(15, "           PESO ==> [ "+Peso+" ]");
		MCursor.TCen(15, "CODIGO DE BARRA ==> [ "+Arti.CodB+" ]");
		MCursor.TCen(15, "     EXISTENCIA ==> [ "+Arti.Exis+" ]");
		MCursor.TCen(10, "------------------------------------------------------------");
		MCursor.TCen(15, " COSTO PRODUCTO ==> [ "+Arti.CosP+" ]");
		MCursor.TCen(10, "------------------------------------------------------------");
		MCursor.TCen(15, "    PRECIO BASE ==> [ "+Arti.PreB+" ]");
		MCursor.TCen(15, "   PRECIO VENTA ==> [ "+Arti.PreV+" ]");
		MCursor.TCen(15, " PRECIO A PAGAR ==> [ "+Arti.PreF+" ]");
		MCursor.TCen(10, "------------------------------------------------------------");
		MCursor.TCen(15, "    COSTO FLETE ==> [ "+CosF+" ]");
		MCursor.TCen(10, "------------------------------------------------------------");
		MCursor.TCen(15, "  TOTAL A PAGAR ==> [ "+(Arti.PreF+CosF)+" ]");
		MCursor.TCen(10, "============================================================");
		MCursor.Salida();
		return;
	}//Mostrar
}//class











