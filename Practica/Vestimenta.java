/* Objeto Vestimenta.
   Atributos: Articulo
              Talla (S,M,L,XL)
		      Marca
*/
public class Vestimenta
{	Articulo Arti;
	char     Tall;
	String   Marc;

	//CONSTRUCTOR
	public Vestimenta(String Desc, float C, int B, short E, char T, String M)
	{	Arti = new Articulo(Desc, C, B, E);
		Tall = T;
		Marc = M;
		Arti.PreB = CalPB();
		Arti.PreV = CalPV();
		Arti.PreF = CalPF();
	}//Vestimenta

	//METODO PARA CALCULAR EL PRECIO BASE DEL PRODUCTO
	public float CalPB()
	{	return Arti.CosP + Arti.CosP*(float)0.30;
	}//CalPB

	//METODO PARA CALCULAR EL PRECIO DE VENTA DEL ARTICULO
	public float CalPV()
	{	float D = 0;
		if(Arti.PreB > 170)	D = Arti.PreB*(float)0.15;
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
		MCursor.TCen(15, "          TALLA ==> [ "+Tall+" ]");
		MCursor.TCen(15, "          MARCA ==> [ "+Marc+" ]");
		MCursor.TCen(15, "CODIGO DE BARRA ==> [ "+Arti.CodB+" ]");
		MCursor.TCen(15, "     EXISTENCIA ==> [ "+Arti.Exis+" ]");
		MCursor.TCen(10, "------------------------------------------------------------");
		MCursor.TCen(15, " COSTO PRODUCTO ==> [ "+Arti.CosP+" ]");
		MCursor.TCen(10, "------------------------------------------------------------");
		MCursor.TCen(15, "    PRECIO BASE ==> [ "+Arti.PreB+" ]");
		MCursor.TCen(15, "   PRECIO VENTA ==> [ "+Arti.PreV+" ]");
		MCursor.TCen(15, " PRECIO A PAGAR ==> [ "+Arti.PreF+" ]");
		MCursor.TCen(10, "============================================================");
		MCursor.Salida();
		return;
	}//Mostrar
}//class










